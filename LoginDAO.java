package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	public boolean fazerLogin(String usuario, String senha) {
		
		boolean loginValido = false;
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_winxstudies", "root", "souza0868");

			String verificar = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
			PreparedStatement stmt = conn.prepareStatement(verificar);
			stmt.setString(1, usuario);
			stmt.setString(2, senha);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				
				loginValido = true;
				
			}
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return loginValido;
		
	}

}
