/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;
import static trabalho.poo.wm.Usefull.s;

/**
 *
 * @author wilsonmielke
 */
public class Admin implements AdminController{
    
    protected String nome;
    protected String user;
    protected String password;
    
    Admin(String name, String senha, ArrayList<Admin> acc) {
        this.user = name;
        this.password = senha;
        this.nome = name;
        acc.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean Auth(String pass){
        return this.password.equals(pass);
    }
    
    public void changePass(){
        System.out.println("Entre com a senha atual:");
        String t = s.next();
        if(Auth(t)){
            System.out.println("Senha atual correta!\nEntre com a nova senha!");
            t = s.next();
            this.setPassword(t);
        }else{
            System.out.println("Senha atual incorreta!");
            changePass();
        }
        
    }
}
