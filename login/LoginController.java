package data.base.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import data.base.student.StudentView;
import data.base.admin.AdminView;
import data.base.teacher.TeacherView;
import data.base.login2.AdminLoginView;

public class LoginController {
    
    private  LoginView viewLogin;
    public StudentView viewStudent;
    public AdminView adminView = new AdminView();
    public TeacherView teacherView = new TeacherView();
    public AdminLoginView viewAdLog;
    Login login;
    

    public LoginController(LoginView viewLogin){

        this.viewLogin = viewLogin;
        this.viewStudent = new StudentView();
        this.viewAdLog = new AdminLoginView();
        this.login = new Login();
       
    }


    public ActionListener getLoginBtn(JFrame frame, JTextField idno, JPasswordField password){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String getIdNo = idno.getText();
				String getPassword = new String(password.getPassword());

				if(getIdNo.isEmpty() || getPassword.isEmpty()){
					JOptionPane.showMessageDialog(null,"Please Fill up all Before Login");

				}else{

				String displayName = login.LoginFileHandling(getIdNo,getPassword);



				if (displayName != null){
					
					if(getIdNo.startsWith("STDNT-")){

                        frame.getContentPane().removeAll();
                        frame.repaint();
                        viewStudent.studentGui(frame);



                    }else {

                        frame.getContentPane().removeAll();
                            frame.repaint();
                            teacherView.teacherGui(frame);
                    }
					

				}
					
			


				else{
					JOptionPane.showMessageDialog(null,"Incorrect Password or Username!");

                    idno.setText("");
                    password.setText("");

				}



				

				}



			
		}

	};
	}
	
    public ActionListener getLoginAdmintBtn(JFrame frame){

        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                frame.getContentPane().removeAll();
                frame.repaint();
                viewAdLog.login2Gui(frame);
            }

        };
    }
    
}