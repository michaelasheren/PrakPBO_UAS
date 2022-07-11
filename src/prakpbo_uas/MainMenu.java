/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo_uas;

import javax.swing.JOptionPane;
import prakpbo_uas.Login;
import prakpbo_uas.Register;
import prakpbo_uas.SearchByCategory;

/**
 *
 * @author Sheren
 */
public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    Login login = new Login();
    Register regist = new Register();
    SearchByCategory cat = new SearchByCategory();

    public void showMainMenu() {

        Boolean next = true;
        while (next) {
            try {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Input menu : \n1. Login \n2. Register \n3. Lihat Data Pengguna Berdasarkan Kategori Dipilih"));
                switch (menu) {
                    case 1:
                        login.showLogin();
                        break;
                    case 2:
                        regist.showRegist();
                        break;
                    case 3:
                        cat.search();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Input salah");
            }
        }
    }
}
