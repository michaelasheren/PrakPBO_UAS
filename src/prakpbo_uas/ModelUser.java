/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo_uas;

/**
 *
 * @author BENJAMIN PC
 */
public class ModelUser {
    private int id;
    private String name;
    private String email;
    private String password;
    private int idCategory;
    private String photo;
    
    public ModelUser(){
    }
    
    public ModelUser(int id, String name, String email, String password, int idCategory, String photo){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.idCategory = idCategory;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "ModelUser{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", idCategory=" + idCategory + ", photo=" + photo + '}';
    }
    
    
}
