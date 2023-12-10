package data.base.login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    private static final String FILENAME = "database/user_cred.txt";

    public static String authenticateUser(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" / ");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    if (username.equals("Admin") && password.equals("AdminPassword")) {
                        return "Admin";
                    } else if (username.startsWith("STAFF-")) {
                        return "Teacher";
                    } else if (username.startsWith("STUDENT-")) {
                        return "Student";
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
