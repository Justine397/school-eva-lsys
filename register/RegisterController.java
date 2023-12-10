package data.base.register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import data.base.admin.AdminView;

public class RegisterController {
    
    RegisterView viewRegister;
    public AdminView viewAdmin;

    public RegisterController(RegisterView viewRegister){

        this.viewRegister = viewRegister;
        this.viewAdmin = new AdminView();

    }
    public ActionListener getCancelBtn(JFrame frame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                viewAdmin.adminGui(frame);
            }

        };
    }
}