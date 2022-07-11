/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo_uas;
import prakpbo_uas.ModelCategoryUser;
import prakpbo_uas.ModelUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sheren
 */
public class Controller {
    static DBHandler conn = new DBHandler();
    
    // SELECT ALL from table category
    public static ArrayList<ModelCategoryUser> getAllCategory() {
        ArrayList<ModelCategoryUser> listCategory = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM category";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ModelCategoryUser cat = new ModelCategoryUser();
                cat.setId(rs.getInt("idCategory"));
                cat.setName(rs.getString("Name"));
                listCategory.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listCategory);
    }
    
    // SELECT ALL from table user
    public static ArrayList<ModelUser> getAllUser() {
        ArrayList<ModelUser> listUser = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM users";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ModelUser user = new ModelUser();
                user.setId(rs.getInt("idUser"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Pass"));
                user.setIdCategory(rs.getInt("idCategory"));
                user.setPhoto(rs.getString("Photo"));
                listUser.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listUser);
    }
    
    // SELECT ALL from table category BY Name
    public static ModelCategoryUser getCategory(String name) {
        ModelCategoryUser category = new ModelCategoryUser();
        conn.connect();
        String query = "SELECT * FROM category WHERE Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                category.setId(rs.getInt("idCategory"));
                category.setName(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
    
    // SELECT ALL from table users BY Name
    public static ModelUser getUser(String name) {
        ModelUser user = new ModelUser();
        conn.connect();
        String query = "SELECT * FROM users WHERE Name='" + name + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                user.setId(rs.getInt("idUser"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Pass"));
                user.setIdCategory(rs.getInt("idCategory"));
                user.setPhoto(rs.getString("Photo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
    
        public static void main(String[] args) {
        System.out.println("!UNTUK CEKKKK!");
        System.out.println("");

        System.out.println("getAllCategory : ");
        ArrayList<ModelCategoryUser> listCategory = new ArrayList<>();
        listCategory = getAllCategory();

        System.out.println("listCategory.get(0).getName(); = " + listCategory.get(0).getName());
        
        System.out.println("");
        System.out.println("getCategory :");
        ModelCategoryUser category = new ModelCategoryUser();
        category = getCategory("Private Account");

        System.out.println("category.getId() = " + category.getId());
        
//        System.out.println("");
//        System.out.println("getAllUser : ");
//        ArrayList<ModelUser> listUser = new ArrayList<>();
//        listUser = getAllUser();
//
//        System.out.println("listUser.get(0).getEmail(); = " + listUser.get(0).getEmail());
//        
//        System.out.println("");
//        System.out.println("getUser :");
//        ModelUser user = new ModelUser();
//        user = getUser("Sheren");
//
//        System.out.println("user.getId() = " + user.getId());
    }
}
