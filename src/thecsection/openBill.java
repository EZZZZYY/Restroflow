package thecsection;

import javax.swing.JOptionPane;
import java.io.File;

/**
 * 
 * OpenBill class is used to open a bill file by its ID.
 * 
 */
public class openBill {

    public static void openById(String id) {
        try {
            String filePath = "D:\\BILL FOR RESTROFLOW" + id + ".pdf";
            File file = new File(filePath);

            if (file.exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filePath);
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist in the location.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
