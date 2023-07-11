package Controller;

import Model.LoginModel;
import View.CadastroView;
import View.LoginConcluido;
import View.LoginIndeferido;
import View.LoginView;

public class LoginController {

	private LoginModel loginModel;
	private LoginView loginView;

	public LoginController(LoginModel loginModel, LoginView loginView) {
		
		this.loginModel = loginModel;
		this.loginView = loginView;

		loginView.jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		loginView.jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		loginView.jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		loginView.naoVerSenhaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				naoVerSenhaLoginMousePressed(evt);
			}
		});
		
		loginView.verSenhaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                verSenhaLoginMousePressed(evt);
            }
        });
		
		/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });


	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		String usuario = loginView.jTextField1.getText();
		String senha = new String(loginView.pwdLogin.getPassword());
		
		boolean loginvalido = loginModel.fazerLogin(usuario,senha);
		
		if(loginvalido) {
			
			LoginConcluido login = new LoginConcluido();
			login.setVisible(true);
			
		}else {
			
			LoginIndeferido loginIn = new LoginIndeferido();
			loginIn.setVisible(true);
		}

	}// GEN-LAST:event_jButton1ActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed

		CadastroView cadastrar = new CadastroView();
		cadastrar.setVisible(true);

	}// GEN-LAST:event_jButton2ActionPerformed

	private void naoVerSenhaLoginMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_naoVerSenhaLoginMousePressed
		loginView.verSenhaLogin.setVisible(true);
		loginView.naoVerSenhaLogin.setVisible(false);
		loginView.pwdLogin.setEchoChar('*');
	}// GEN-LAST:event_naoVerSenhaLoginMousePressed
	

    private void verSenhaLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verSenhaLoginMousePressed
    	loginView.naoVerSenhaLogin.setVisible(true);
    	loginView.verSenhaLogin.setVisible(false);
    	loginView.pwdLogin.setEchoChar((char)0);
    }//GEN-LAST:event_verSenhaLoginMousePressed


}