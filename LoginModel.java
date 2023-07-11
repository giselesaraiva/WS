package Model;

import Model.DAO.LoginDAO;

public class LoginModel {
	
	private LoginDAO loginDao;
	
	public LoginModel(LoginDAO loginDao) {
		
		this.loginDao = loginDao;
		
	}
	
	public boolean fazerLogin(String usuario, String senha) {
		
		return loginDao.fazerLogin(usuario, senha);
		
	}
    
}

