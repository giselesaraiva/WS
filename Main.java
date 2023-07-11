package Model;

import Controller.LoginController;
import View.LoginView;
import Model.DAO.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	LoginDAO loginDao = new LoginDAO();
    	
        LoginModel loginModel = new LoginModel(loginDao);
        
        LoginView loginView = new LoginView();
        
        LoginController loginController = new LoginController(loginModel, loginView);
        
        loginView.setVisible(true);
    }
}