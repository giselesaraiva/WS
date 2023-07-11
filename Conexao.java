package Model;

import java.sql.*;
import Model.DAO.*;

public class Conexao{

	 public static void main(String[] args) {
		 
	Connection conn = ConexaoDAO.getConnection();
	
	if(conn!=null) {
	
		System.out.println("Conexão bem-sucedida!");

		}
	 }
}