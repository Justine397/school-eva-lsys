import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    JPanel loginPanel, contentPanel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginView() {
        setTitle("Login Panel");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        addLoginView();

        setVisible(true);
    }

    public void addLoginView() {
        loginPanel = new JPanel();
        loginPanel.setBackground(new Color(44, 0, 62));
        loginPanel.setBounds(0, 0, 600, 800);
        loginPanel.setLayout(null);
        add(loginPanel);

        try {
            ImageIcon schoolImage = new ImageIcon("C:\\Users\\SHALDONN GIEL\\Downloads\\GROUP Project\\school1.jpg");
            Image img = schoolImage.getImage().getScaledInstance(525, 255, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 70, 525, 255);
            loginPanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        contentPanel = new JPanel();
        contentPanel.setBackground(new Color(58, 0, 82));
        contentPanel.setBounds(30, 265, 525, 430);
        contentPanel.setLayout(null); // Use absolute positioning for components inside contentPanel
        loginPanel.add(contentPanel);

        // Create and position username label and field
        JLabel welcomeL = new JLabel("WELCOME !");
        welcomeL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
        welcomeL.setForeground(new Color(255, 255, 255));
        welcomeL.setBounds(70, 80, 300, 40);
        contentPanel.add(welcomeL);

        JLabel mottoL = new JLabel("We do ordinary things, extra ordinarily well!");
        mottoL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
        mottoL.setForeground(new Color(175, 163, 182));
        mottoL.setBounds(70, 123, 400, 18);
        contentPanel.add(mottoL);

        JLabel usernameL = new JLabel("Username");
        usernameL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        usernameL.setForeground(new Color(255, 255, 255));
        usernameL.setBounds(70, 165, 100, 17);
        contentPanel.add(usernameL);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        usernameField.setBounds(70, 190, 380, 40);
        contentPanel.add(usernameField);

        JLabel passwordL = new JLabel("Password");
        passwordL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
        passwordL.setForeground(new Color(255, 255, 255));
        passwordL.setBounds(70, 245, 100, 17);
        contentPanel.add(passwordL);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        passwordField.setBounds(70, 270, 380, 40);
        contentPanel.add(passwordField);

        loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
        loginButton.setForeground(new Color(255, 255, 255));
        loginButton.setBackground(new Color(128, 0, 181));
        loginButton.setBounds(130, 350, 250, 45);
        loginButton.setFocusable(false);
        contentPanel.add(loginButton);
    }

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
    }
}
