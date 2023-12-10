package data.base.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import data.base.student.StudentView;
import data.base.admin.AdminView;
import data.base.teacher.TeacherView;

public class LoginController {
    
    private  LoginView viewLogin;
    public StudentView viewStudent;
    public AdminView adminView = new AdminView();
    public TeacherView teacherView = new TeacherView();
    

    public LoginController(LoginView viewLogin){

        this.viewLogin = viewLogin;
        this.viewStudent = new StudentView();
       
    }


    public ActionListener getLoginBtn(JFrame frame, JTextField username, JPasswordField password){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                String getUsername = username.getText();
                String getPassword = new String(password.getPassword());

                if (getUsername.equals("admin") && getPassword.equals("password")) {
                   frame.getContentPane().removeAll();
                   frame.repaint();
                   adminView.adminGui(frame);

                } else if (getUsername.startsWith("STAFF-") && getPassword.equals("001")) {
                   frame.getContentPane().removeAll();
                   frame.repaint();
                   teacherView.teacherGui(frame);

    
                } else if (getUsername.startsWith("STUDENT-") && getPassword.equals("002")) {
                   frame.getContentPane().removeAll();
                   frame.repaint();
                   viewStudent.studentGui(frame);
    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                    // Actions for failed login attempt
                }
            }

        };
    }
    
}