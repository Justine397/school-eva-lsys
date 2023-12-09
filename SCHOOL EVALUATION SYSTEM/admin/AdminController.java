package data.base.admin;

import javax.swing.*;
import java.awt.*;

public class AdminController {

    AdminView viewAdmin;

    public AdminController(AdminView viewAdmin){

        this.viewAdmin = viewAdmin;

    }
    public ActionListener getCreateBtn(JFrame frame){

        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                
            }
        };
    }
    
}
