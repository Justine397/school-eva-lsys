package data.base.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import data.base.student.StudentView;


public class LoginController {
    
    private  LoginView viewLogin;
    //public StudentView viewStudent = new StudentView();

    public LoginController(LoginView viewLogin){

        this.viewLogin = viewLogin;
       
    }

    public ActionListener getLoginBtn(JFrame frame, JTextField username, JPasswordField password){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String getUsername = username.getText();
                String getPassword = new String(password.getPassword());
                // You can add your login validation or other logic here
                // For example:
                if (getUsername.equals("admin") && getPassword.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                    // Perform actions after successful login
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                    // Actions for failed login attempt
                }
            }

        };
    }
    
}
