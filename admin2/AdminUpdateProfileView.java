package data.base.admin2;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AdminUpdateProfileView extends JFrame {
    JPanel aUpdatePanel;
    JButton saveBtn;

    public AdminUpdateProfileView() {
        setTitle("Update Grade");
        setSize(600, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        adminUpdateProfile();

        setVisible(true);
    }

    public void adminUpdateProfile() {
        aUpdatePanel = new JPanel();
        aUpdatePanel.setLayout(null);
        aUpdatePanel.setBackground(new Color(18, 22, 43));
        aUpdatePanel.setBounds(0, 0, 600, 800);
        aUpdatePanel.setLayout(null);
        add(aUpdatePanel);

        JLabel infoL = new JLabel("INFORMATION");
        infoL.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
        infoL.setForeground(new Color(255, 255, 255));
        infoL.setBounds(170, 20, 500, 40);
        aUpdatePanel.add(infoL);

        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setBounds(30, 70, 520, 5); // Adjust position and size of the separator
        aUpdatePanel.add(separator);

        try {
            String imagePath = "database/picture/avatar.jpg";
            ImageIcon originalIcon = new ImageIcon(imagePath);
            Image img = originalIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(img);

            JLabel imageLabel = new JLabel(scaledIcon);
            imageLabel.setBounds(30, 100, 200, 200);
            aUpdatePanel.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel nameL = new JLabel("Name: ");
        Font nameF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        nameL.setForeground(new Color(255, 255, 255));
        nameL.setBounds(250, 200, 100, 15);
        nameL.setFont(nameF);
        aUpdatePanel.add(nameL);

        JLabel classL = new JLabel("Class: ");
        Font classF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        classL.setForeground(new Color(255, 255, 255));
        classL.setBounds(250, 240, 100, 15);
        classL.setFont(classF);
        aUpdatePanel.add(classL);

        JLabel idL = new JLabel("ID No: ");
        Font idF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        idL.setForeground(new Color(255, 255, 255));
        idL.setBounds(250, 280, 100, 15);
        idL.setFont(idF);
        aUpdatePanel.add(idL);

        JLabel evaluationL = new JLabel("EVALUATION: ");
        Font evaluationF = new Font("Arial Rounded MT Bold", Font.PLAIN, 15);
        evaluationL.setForeground(new Color(255, 255, 255));
        evaluationL.setBounds(50, 310, 200, 15);
        evaluationL.setFont(evaluationF);
        aUpdatePanel.add(evaluationL);

        JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
        separator1.setBounds(30, 350, 520, 5); // Adjust position and size of the separator
        aUpdatePanel.add(separator1);

        JLabel yearLabel1 = new JLabel("YEAR GRADE");
        Font yearFont1 = new Font("Arial Rounded MT Bold", Font.PLAIN, 20);
        yearLabel1.setBounds(220, 410, 200, 30); // Adjust position and size
        yearLabel1.setFont(yearFont1);
        yearLabel1.setForeground(new Color(255, 255, 255)); // Set text color
        aUpdatePanel.add(yearLabel1);

        // Create a rectangle and set it as the background for the JLabel
        JPanel rectPanel1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(44, 66, 184));
                g.fillRect(0, 0, 520, 50);
            }
        };
        rectPanel1.setBounds(30, 400, 520, 50);
        aUpdatePanel.add(rectPanel1);

        // Creating the table for the first year
        String[] columnNames1 = { "Subject", "1st Sem", "2nd Sem", "Finals" };
        Object[][] data1 = {
                { "Math", "", "", "" },
                { "Science", "", "", "" },
                { "History", "", "", "" },
                { "OOP", "", "", "" },
                { "DSA", "", "", "" },
                // Add more rows as needed
        };

        DefaultTableModel tableModel1 = new DefaultTableModel(data1, columnNames1);
        JTable table1 = new JTable(tableModel1);
        JScrollPane scrollPane1 = new JScrollPane(table1);
        scrollPane1.setBounds(30, 450, 520, 200);
        aUpdatePanel.add(scrollPane1);

        saveBtn = new JButton("SAVE");
        saveBtn.setBackground(new Color(44, 66, 184));
        saveBtn.setForeground(new Color(255, 255, 255));
        saveBtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
        saveBtn.setBounds(30, 670, 250, 50);
        saveBtn.setFocusable(false);
        aUpdatePanel.add(saveBtn);
    }
}