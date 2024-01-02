package data.base.register;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register {

    public boolean doesIdExist(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader("database\\user.dat"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("\t");
    
                if (userData.length > 1) {
                    String existingId = userData[1]; 
                    if (existingId.equals(id)) {
                        return true;
                    }
                } else {
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();    
        }
        return false;
    }
    public boolean doesFullNameExist(String fullName) {
        try (BufferedReader reader = new BufferedReader(new FileReader("database\\user.dat"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split("\t");

                if (userData.length > 2) {
                    String existingFullName = userData[2]; 

                    if (existingFullName.equals(fullName)) {
                        return true; 
                    }
                } else {
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    }
    public boolean registerUser(String fullname, String section, String idNo, String password) {
        boolean idExists = doesIdExist(idNo);
        boolean fullNameExists = doesFullNameExist(fullname);

        if (idExists || fullNameExists) {
            return false; 
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("database\\user.dat", true))) {
            writer.write(section + "\t" + idNo + "\t" + fullname + "\t" + password + "\n");
            return true; 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    }
}
