package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import View.TelaInicial;

public class TelaInicialController {

	
	private TelaInicial telainicial;
	
	public TelaInicialController(TelaInicial telainicial) {
		
		this.telainicial = telainicial;
		
		telainicial.jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
		
		 telainicial.jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                jLabel5MouseClicked(evt);
	            }
	        });
		 
		 
		
	}
	
	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        closeMenuBar();
    }
	
	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        openMenuBar();
    }
	 int w=297;
	    int h=697;
	private void openMenuBar(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<w;i++){
                    telainicial.menu.setSize(w, h);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();

}
	 private void closeMenuBar(){
	        new Thread(new Runnable() {
	            @Override
	            public void run() {
	                for(int i=w;i>0;i--){
	                    telainicial.menu.setSize(i, h);
	                    try {
	                        Thread.sleep(2);
	                    } catch (InterruptedException ex) {
	                        Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
	                    }
	                }
	            }
	        }).start();
	}
}
