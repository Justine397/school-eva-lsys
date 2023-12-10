package data.base.register;

import java.io.*;

public class Register {
    private static final String REGISTER_FILE = "database/user.dat";

    public boolean registerUser(String fullname, String section, String idNo, String username, String password, String role) {
        try {
            File file = new File(REGISTER_FILE);

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            writer.write(fullname + "," + section + "," + idNo + "," + username + "," + password + "," + role + "\n");
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
