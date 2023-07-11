package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

	private static final String url = "jdbc:mysql://localhost:3306/Teste2";
	private static final String username = "root";
	private static final String password = "souza0868";

	public static Connection getConnection() {
	   
        Connection conn = null;
       
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, username, password);
           
        } catch (ClassNotFoundException |SQLException e) {
            e.printStackTrace();
        
        }
        
        return conn; 
	}
	
        public static void closeConnection(Connection conn) {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        
    }
}