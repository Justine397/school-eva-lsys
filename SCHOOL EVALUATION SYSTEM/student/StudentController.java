package data.base.student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import data.base.login.LoginView;


public class StudentController {

    public LoginView viewLogin;
    StudentView viewStudent;

    public StudentController(StudentView viewStudent){

        this.viewStudent = viewStudent;
        this.viewLogin = new LoginView();
    }
    public ActionListener getLogoutBtn(JFrame frame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                viewLogin.loginGui(frame);

            }
        };
    }
}
                               
