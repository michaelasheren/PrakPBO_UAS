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

/**
 *
 * @author Sheren
 */
public class Register implements ActionListener{
    JFrame frame;
    JPanel panel;
    
    JLabel lbNama, lbEmail, lbPassword, lbFoto, lbCategory, newFoto;
    JTextField tfNama, tfEmail;
    JPasswordField pfPass;
    JButton bFoto, bRegist;
    JComboBox cbCategory;
    
    public Register(){
        showRegist();
    }
    
    Controller control = new Controller();
    
    public void showRegist(){
        frame = new JFrame();
        panel = new JPanel();
        panel.setSize(800, 600);
        
        lbNama = new JLabel("Nama");
        lbNama.setBounds(30, 30, 200, 20);
        lbEmail = new JLabel("Email");
        lbEmail.setBounds(30, 60, 200, 20);
        lbPassword = new JLabel("Password");
        lbPassword.setBounds(30, 90, 200, 20);
        lbFoto = new JLabel ("Upload foto");
        lbFoto.setBounds(30, 120, 200, 20);
        lbCategory = new JLabel("Category");
        lbCategory.setBounds(30, 150, 200, 20);
        
        tfNama = new JTextField();
        tfNama.setBounds(100, 30, 300, 20);
        tfEmail = new JTextField();
        tfEmail.setBounds(100, 60, 300, 20);
        
        pfPass = new JPasswordField();
        pfPass.setBounds(100, 90, 300, 20);
        
        newFoto = new JLabel("No File Selected");
        newFoto.setBounds(100, 120, 300, 20);
        bFoto = new JButton("Choose Foto");
        bFoto.setBounds(500, 120, 300, 20);
        bFoto.addActionListener(this);
        
        cbCategory = new JComboBox();
        cbCategory.addItem(Controller.getAllCategory());
        cbCategory.setBounds(100, 150, 300, 20);
        
        bFoto = new JButton("Registrasi");
        bFoto.setBounds(500, 180, 300, 20);
        bFoto.addActionListener(this);
        
        panel.add(lbNama);
        panel.add(lbEmail);
        panel.add(lbPassword);
        panel.add(lbFoto);
        panel.add(lbCategory);
        panel.add(tfNama);
        panel.add(tfEmail);
        panel.add(newFoto);
        panel.add(cbCategory);
        panel.add(bFoto);
        frame.add(panel);
        frame.setVisible(true);
    }
    
    @Override
        public void actionPerformed(ActionEvent e){
            String comm = e.getActionCommand();
            switch(comm){
                case "Choose Foto" :
                    JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView());
                    int o = file.showOpenDialog(null);
                    if(o == JFileChooser.APPROVE_OPTION){
                        newFoto.setText(file.getSelectedFile().getPath());
                    } else {
                        newFoto.setText("Gagal Input");
                    }
                case "Registrasi" :
                    
            }
        }
}
