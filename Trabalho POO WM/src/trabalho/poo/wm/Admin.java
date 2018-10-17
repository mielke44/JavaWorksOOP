/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;

/**
 *
 * @author wilsonmielke
 */
public class Admin{
    
    private String nome;
    private String user;
    //user sempre igual ao nome do objeto!
    private String password;
    

    Admin(String name, String senha, ArrayList<Admin> acc, ArrayList<String> accName) {
        this.user = name;
        this.password = senha;
        this.nome = name;
        acc.add(this);
        accName.add(this.getNome());
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }
    
    public boolean compare(String pass){
        return this.password.equals(pass);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
