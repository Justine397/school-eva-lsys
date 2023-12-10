package data.base.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminView{

    AdminController controlAdmin;

    JPanel adminPanel;
   
    


    public void adminGui(JFrame frame) {
        
        controlAdmin = new AdminController(this);

        adminPanel = new JPanel();
        adminPanel.setBackground(new Color(18, 22, 43));
        adminPanel.setBounds(0, 0, 600, 800);
        adminPanel.setLayout(null);
        frame.add(adminPanel);

        JLabel adminL = new JLabel("ADMIN");
        adminL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        adminL.setForeground(new Color(255, 255, 255));
        adminL.setBounds(120, 20, 500, 40);
        adminPanel.add(adminL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(30, 70, 520, 5); // Adjust position and size of the separator
        adminPanel.add(separator);

        try {
            ImageIcon originalIcon = new ImageIcon("C:\\Users\\MARC JOSEPH\\Desktop\\SCHOOL EVALUATION SYSTEM\\picture\\avatar.jpg");
            Image img = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 100, 200, 200);
            adminPanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel nameL = new JLabel("Name: ");
        Font nameF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        nameL.setForeground(new Color(255, 255, 255));
        nameL.setBounds(250, 200, 100, 15);
        nameL.setFont(nameF);
        adminPanel.add(nameL);

        JLabel adminName = new JLabel("CITE Admin");
        adminName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        adminName.setForeground(new Color(255, 255, 255));
        adminName.setBounds(320, 200, 100, 15);
        adminPanel.add(adminName);   

        JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
        separator1.setBounds(30, 330, 520, 5); // Adjust position and size of the separator
        adminPanel.add(separator1);

        JLabel registerLabel = new JLabel("REGISTER");
        registerLabel.setBounds(120,350,150,30);
        registerLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
        registerLabel.setForeground(new Color(255,255,255));
        adminPanel.add(registerLabel);

        JLabel fullnameLabel = new JLabel("Fullname");
        fullnameLabel.setBounds(40,400,100,30);
        fullnameLabel.setForeground(new Color(255,255,255));
        adminPanel.add(fullnameLabel);

        JTextField fullnameTxt = new JTextField();
        fullnameTxt.setBounds(40,440,300,30);
        adminPanel.add(fullnameTxt);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(40,480,100,30);
        usernameLabel.setForeground(new Color(255,255,255));
        adminPanel.add(usernameLabel);

        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(40,520,300,30);
        adminPanel.add(usernameTxt);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(40,560,100,30);
        passLabel.setForeground(new Color(255,255,255));
        adminPanel.add(passLabel);

        JPasswordField passTxt = new JPasswordField();
        passTxt.setBounds(40,600,300,30);
        adminPanel.add(passTxt);

        JRadioButton studentBtn = new JRadioButton(" STUDENT ");
        studentBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        studentBtn.setForeground(new Color(255, 255, 255));
        studentBtn.setBounds(380, 350, 100, 20);
        studentBtn.setOpaque(false);

        studentBtn.setFocusable(false);




        
        adminPanel.add(studentBtn);

        JRadioButton teacherBtn = new JRadioButton(" TEACHER ");
        teacherBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        teacherBtn.setForeground(new Color(255, 255, 255));
        teacherBtn.setBounds(490, 350, 100, 20);
        teacherBtn.setOpaque(false);
        teacherBtn.setFocusable(false);
      //  teacherBtn.addActionListener(controlAdmin.getTeacherBtn());
        adminPanel.add(teacherBtn);   

        JButton cancelBtn = new JButton("CANCEL");
        cancelBtn.setBounds(60,650,100,30);
        cancelBtn.addActionListener(controlAdmin.getCancelBtn(frame));
        adminPanel.add(cancelBtn);

        JButton registerBtn = new JButton("REGISTER");
        registerBtn.setBounds(220,650,100,30);
        registerBtn.addActionListener(controlAdmin.getRegisterBtn(frame, fullnameTxt, usernameTxt, passTxt));
        adminPanel.add(registerBtn);         


        

        

        
    }   




    
}