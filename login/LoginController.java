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

    public ActionListener getLoginBtn(JFrame frame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

              frame.getContentPane().removeAll();
              frame.repaint();
              //viewStudent.studentGui(frame);
            }

        };
    }
    
}
