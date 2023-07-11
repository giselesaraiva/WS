package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.VO.UsuarioVO;
import View.CadastroView;

public class CadastroDAO {

	public int check = 0;
	PreparedStatement ps = null;
	Connection conn = null;
	CadastroView cadastroView;

	@SuppressWarnings({})


	public void cadastrarUsuario(UsuarioVO usuario) {

		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_winxstudies", "root", "souza0868");
			String cadastrar = "INSERT INTO usuario (nome, sobrenome, datanas, usuario, senha, grauescola) VALUES (?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(cadastrar);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getSobrenome());
			ps.setString(3, usuario.getDataNascimento());
			ps.setString(4, usuario.getNomeUsuario());
			if (usuario.getSenha().equals(new String(cadastroView.pwdSenhaConfima.getPassword()))) {
				ps.setString(5, usuario.getSenha());
			}
			ps.setString(6, usuario.getGrauEscola());
			check = ps.executeUpdate();
			ps.close();
			conn.commit();
			if (check > 0) {
				System.out.println("Usuário cadastrado com sucesso!");
			} else {
				System.out.println("Falha ao cadastrar usuário.");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
		} 

	}
}