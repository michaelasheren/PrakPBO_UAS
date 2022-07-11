/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo_uas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import prakpbo_uas.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sheren
 */
public class Login implements ActionListener {

    JFrame frame;
    JPanel panel;

    JLabel lbNama, lbPass;
    JTextField tfNama;
    JPasswordField pfPass;
    JButton bBack, bLogin;

    MainMenu mainMenu = new MainMenu();
    Controller getUser = new Controller();
    SearchByCategory cat = new SearchByCategory();
    static DBHandler conn = new DBHandler();

    public Login() {
        showLogin();
    }

    public void showLogin() {
        lbNama = new JLabel("Nama");
        lbNama.setBounds(30, 30, 200, 20);
        lbPass = new JLabel("Email");
        lbPass.setBounds(30, 60, 200, 20);

        tfNama = new JTextField();
        tfNama.setBounds(100, 30, 300, 20);

        pfPass = new JPasswordField();
        pfPass.setBounds(100, 60, 300, 20);

        bBack = new JButton("Back");
        bBack.setBounds(300, 200, 300, 20);
        bBack.addActionListener(this);
        bLogin = new JButton("Login");
        bLogin.setBounds(800, 200, 300, 20);
        bLogin.addActionListener(this);

        panel.add(lbNama);
        panel.add(lbPass);
        panel.add(tfNama);
        panel.add(pfPass);
        panel.add(bBack);
        panel.add(bLogin);
        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comm = e.getActionCommand();
        switch (comm) {
            case "Back":
                mainMenu.showMainMenu();
            case "Login":
                try {
                    if (tfNama.getText().equals(Controller.getAllUser()) && pfPass.getPassword().equals(Controller.getAllUser())) {
                        JOptionPane.showMessageDialog(null, "Welcome " + tfNama.getText() + "!");
                        cat.search();
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Login Gagal");
                }
        }
    }
}
