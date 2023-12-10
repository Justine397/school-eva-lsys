package data.base.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import data.base.admin.AdminView;


public class LoginController {
    
    private  LoginView viewLogin;
    public AdminView viewAdmin;

    public LoginController(LoginView viewLogin){

        this.viewLogin = viewLogin;
        this.viewAdmin = new AdminView();
       
    }

    public ActionListener getLoginBtn(JFrame frame, JTextField username, JPasswordField password){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String getUsername = username.getText();
                String getPassword = new String(password.getPassword());
               
                if (getUsername.equals("admin") && getPassword.equals("password")) {
                    frame.getContentPane().removeAll();
                    frame.repaint();
                    viewAdmin.adminGui(frame);

                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                    
                }
            }

        };
    }
    
}
