package data.base.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import data.base.register.RegisterView;

public class AdminController {

    public RegisterView viewRegister;
    AdminView viewAdmin;

    public AdminController(AdminView viewAdmin){

        this.viewAdmin = viewAdmin;
        this.viewRegister = new RegisterView();

    }
    public ActionListener getCreateBtn(JFrame frame){

        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                viewRegister.registerGui(frame);
                
            }
        };
    }
    
}