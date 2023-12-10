package data.base.admin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.io.*;

public class Admin {

    public boolean isUserExists(String username) {
        boolean exists = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("database\\users.dat"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("\t");
                if (userData.length >= 2 && userData[1].trim().equals(username)) {
                    exists = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return exists;
    }

    public void AdminFileHandling(String fullname, String username, String password) {
        if (isUserExists(username)) {
            JOptionPane.showMessageDialog(null, "Username already exists!");
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("database\\users.dat", true))) {
                writer.write(fullname + "\t " + username + "\t " + password );
                writer.newLine();
                JOptionPane.showMessageDialog(null, "You've Successfully Registered!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

    

