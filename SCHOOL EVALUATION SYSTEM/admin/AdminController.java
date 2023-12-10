package data.base.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import data.base.login.LoginView;

public class AdminController {

    public LoginView viewLogin;
    Admin admin;
    AdminView viewAdmin;

    public AdminController(AdminView viewAdmin){

        this.viewAdmin = viewAdmin;
        this.admin = new Admin();
        this.viewLogin = new LoginView();
        

    }
    public ActionListener getCancelBtn(JFrame frame){

        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                viewLogin.loginGui(frame);

                
                
            }
        };
    }
    public ActionListener getRegisterBtn(JFrame frame, JTextField fullname, JTextField username, JPasswordField password){

        return new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                String getFullname = fullname.getText();
                String getUserName = username.getText();
                String getPassword = new String(password.getPassword());
    
                if (getFullname.isEmpty() || getUserName.isEmpty() || getPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill up all before Registering");
                } else {
                    if (admin.isUserExists(getUserName)) {
                        JOptionPane.showMessageDialog(null, "Username already exists!");
                    } else {
                        admin.AdminFileHandling(getFullname, getUserName, getPassword);
                       
                        fullname.setText("");
                        username.setText("");
                        password.setText("");
                        
                        
                        frame.getContentPane().removeAll();
                        frame.repaint();
                        viewLogin.loginGui(frame);
                    }
                }
            }
        };
    }
    public ActionListener getStudentBtn(JFrame frame, JTextField fullname, JTextField username, JPasswordField password){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

               
            }
        };
    }
    
}
