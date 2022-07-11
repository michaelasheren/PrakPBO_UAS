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
public class ModelCategoryUser {
    private int id;
    private String name;
    
    public ModelCategoryUser(){
    }
    
    public ModelCategoryUser(int id, String name){
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "ModelCategoryUser{" + "id=" + id + ", name=" + name + '}';
    }
  
}
