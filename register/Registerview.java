import javax.swing.*;
import java.awt.*;

public class RegisterView extends JFrame {
    JPanel registerPanel;
    JTextField fullname, section, idNo, evaluation, username;
    JPasswordField password;
    JRadioButton teacherBtn, studentBtn;
    JButton cancelBtn, registerBtn;

    public RegisterView() {
        setTitle("Register");
        setSize(600, 800);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addRegisterView();

        setVisible(true);
    }

    public void addRegisterView() {
        registerPanel = new JPanel();
        registerPanel.setBackground(new Color(18, 22, 43));
        registerPanel.setBounds(0, 0, 600, 800);
        registerPanel.setLayout(null);
        add(registerPanel);

        JLabel registerL = new JLabel("REGISTER");
        registerL.setForeground(new Color(255, 255, 255));
        registerL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        registerL.setBounds(200, 20, 200, 40);
        registerPanel.add(registerL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(60, 70, 455, 5); // Adjust position and size of the separator
        registerPanel.add(separator);

        JLabel fullnameL = new JLabel("Fullname");
        fullnameL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        fullnameL.setForeground(new Color(255, 255, 255));
        fullnameL.setBounds(60, 100, 100, 20);
        registerPanel.add(fullnameL);

        fullname = new JTextField();
        fullname.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        fullname.setBounds(60, 130, 450, 40);
        registerPanel.add(fullname);

        JLabel sectionL = new JLabel("Section");
        sectionL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        sectionL.setForeground(new Color(255, 255, 255));
        sectionL.setBounds(60, 190, 100, 20);
        registerPanel.add(sectionL);

        JLabel sectionEx = new JLabel("Ex. '1G - ComputerET'");
        sectionEx.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
        sectionEx.setForeground(new Color(175, 163, 182));
        sectionEx.setBounds(130, 195, 200, 15);
        registerPanel.add(sectionEx);

        section = new JTextField();
        section.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        section.setBounds(60, 220, 210, 40);
        registerPanel.add(section);

        JLabel idNoL = new JLabel("ID No");
        idNoL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        idNoL.setForeground(new Color(255, 255, 255));
        idNoL.setBounds(300, 190, 100, 20);
        registerPanel.add(idNoL);

        idNo = new JTextField();
        idNo.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        idNo.setBounds(300, 220, 210, 40);
        registerPanel.add(idNo);

        studentBtn = new JRadioButton(" STUDENT ");
        studentBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        studentBtn.setForeground(new Color(255, 255, 255));
        studentBtn.setBounds(150, 300, 150, 20);
        studentBtn.setOpaque(false);
        studentBtn.setFocusable(false);
        registerPanel.add(studentBtn);

        teacherBtn = new JRadioButton(" TEACHER ");
        teacherBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        teacherBtn.setForeground(new Color(255, 255, 255));
        teacherBtn.setBounds(300, 300, 150, 20);
        teacherBtn.setOpaque(false);
        teacherBtn.setFocusable(false);
        registerPanel.add(teacherBtn);

        JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
        separator1.setBounds(60, 350, 450, 5); // Adjust position and size of the separator
        registerPanel.add(separator1);

        JLabel usernameL = new JLabel("Username");
        usernameL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        usernameL.setForeground(new Color(255, 255, 255));
        usernameL.setBounds(60, 380, 100, 20);
        registerPanel.add(usernameL);

        username = new JTextField();
        username.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        username.setBounds(60, 410, 450, 40);
        registerPanel.add(username);

        JLabel passwordL = new JLabel("Password");
        passwordL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        passwordL.setForeground(new Color(255, 255, 255));
        passwordL.setBounds(60, 480, 100, 20);
        registerPanel.add(passwordL);

        password = new JPasswordField();
        password.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        password.setBounds(60, 510, 450, 40);
        registerPanel.add(password);

        JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setBounds(60, 590, 450, 5); // Adjust position and size of the separator
        registerPanel.add(separator2);

        cancelBtn = new JButton("CANCEL");
        cancelBtn.setBackground(new Color(44, 66, 184));
        cancelBtn.setForeground(new Color(255, 255, 255));
        cancelBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        cancelBtn.setBounds(60, 630, 200, 50);
        cancelBtn.setFocusable(false);
        registerPanel.add(cancelBtn);

        registerBtn = new JButton("REGISTER");
        registerBtn.setBackground(new Color(44, 66, 184));
        registerBtn.setForeground(new Color(255, 255, 255));
        registerBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        registerBtn.setBounds(310, 630, 200, 50);
        registerBtn.setFocusable(false);
        registerPanel.add(registerBtn);
    }

    public static void main(String[] args) {
        RegisterView registerView = new RegisterView();
    }
}