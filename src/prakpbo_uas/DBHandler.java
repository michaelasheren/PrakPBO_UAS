/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo_uas;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import org.apache.ibatis.jdbc.ScriptRunner;

/**
 *
 * @author Sheren
 */
public class DBHandler {
    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/uas";
    private String username = "root";
    private String password = "";

    private Connection logOn() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Error Ocurred when login" + ex);
        }
        return con;
    }

    private void logOff() {
        try {
            //tutup koneksi
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Ocurred when logoff" + ex);
        }
    }

    public void connect() {
        try {
            con = logOn();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }

    public void disconnect() {
        try {
            logOff();
        } catch (Exception ex) {
            System.out.println("Error occured when connecting to database");
        }
    }

    public void initialize() throws Exception {
        ScriptRunner sr = new ScriptRunner(con);
        Reader reader = new BufferedReader(new FileReader("uas.sql"));
        sr.runScript(reader);
    }
}
