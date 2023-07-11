package Controller;

import Model.BO.CadastroBO;
import Model.VO.UsuarioVO;
import View.CadastroConcluido;
import View.CadastroIndeferido;
import View.CadastroView;

public class CadastroController {

	private CadastroView cadastroView;
	private CadastroBO cadastroBO;
	

	public CadastroController(CadastroView cadastroView) {
		
		this.cadastroView = cadastroView;
		cadastroBO = new CadastroBO();

		cadastroView.btnVoltaLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				String nome = cadastroView.txtNome.getText();
				String sobrenome = cadastroView.txtSobrenome.getText();
				String datanasc = cadastroView.jFormattedTextField1.getText();
				String grauescola = cadastroView.BoxGrau.getSelectedItem().toString();
				String nomeUsuario = cadastroView.txtNomeUsuario.getText();
				String senha = new String(cadastroView.pwdSenha.getPassword());


				boolean cadastrado = cadastroBO.cadastrarUsuario(nome, sobrenome, datanasc, nomeUsuario, senha, grauescola);

				if (cadastrado) {

					System.out.println(cadastrado);
					CadastroConcluido concluido = new CadastroConcluido();
					concluido.setVisible(true);
					
				}else {
					
					CadastroIndeferido indef = new CadastroIndeferido();
					indef.setVisible(true);
				}
				
			}
		});

		cadastroView.txtNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeActionPerformed(evt);
			}
		});

		cadastroView.txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtSobrenomeActionPerformed(evt);
			}
		});

		cadastroView.BoxGrau.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				BoxGrauActionPerformed(evt);
			}
		});

		cadastroView.txtNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtNomeUsuarioActionPerformed(evt);
			}
		});

		cadastroView.verSenha.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				verSenhaMousePressed(evt);
			}
		});

		cadastroView.naoVerSenha.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				naoVerSenhaMousePressed(evt);
			}
		});

		cadastroView.verSenhaConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				verSenhaConfirmaMousePressed(evt);
			}
		});

		cadastroView.naoVerSenhaConfirma.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				naoVerSenhaConfirmaMousePressed(evt);
			}
		});

	}

	

	public void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeActionPerformed

	private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSobrenomeActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtSobrenomeActionPerformed

	private void txtNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNomeUsuarioActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtNomeUsuarioActionPerformed

	private void verSenhaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_verSenhaMousePressed
		cadastroView.naoVerSenha.setVisible(true);
		cadastroView.verSenha.setVisible(false);
		cadastroView.pwdSenha.setEchoChar((char) 0);
	}// GEN-LAST:event_verSenhaMousePressed

	private void naoVerSenhaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_naoVerSenhaMousePressed
		cadastroView.verSenha.setVisible(true);
		cadastroView.naoVerSenha.setVisible(false);
		cadastroView.pwdSenha.setEchoChar('*');
	}// GEN-LAST:event_naoVerSenhaMousePressed

	public void verSenhaConfirmaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_verSenhaConfirmaMousePressed
		cadastroView.naoVerSenhaConfirma.setVisible(true);
		cadastroView.verSenhaConfirma.setVisible(false);
		cadastroView.pwdSenhaConfima.setEchoChar((char) 0);
	}// GEN-LAST:event_verSenhaConfirmaMousePressed

	public void naoVerSenhaConfirmaMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_naoVerSenhaConfirmaMousePressed
		cadastroView.verSenhaConfirma.setVisible(true);
		cadastroView.naoVerSenhaConfirma.setVisible(false);
		cadastroView.pwdSenhaConfima.setEchoChar('*');
	}// GEN-LAST:event_naoVerSenhaConfirmaMousePressed

	private void BoxGrauActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BoxGrauActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_BoxGrauActionPerformed

}// GEN-LAST:event_btnVoltaLoginActionPerformed