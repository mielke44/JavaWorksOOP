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
public interface AdminController{

    public static void firstLoginAdm(ArrayList<Admin> acc){
        if(acc.isEmpty()){
            System.out.println("Nenhuma conta admin detectada, gerando uma nova!");
            cadAdm(acc);
        }
    }
    
    public static int LoginAdm(int usertype, ArrayList<Admin> acc,ArrayList Ses){
        if(acc.isEmpty()){
            firstLoginAdm(acc);
        }
        System.out.println("Escolha a conta:");
        outArrayAdm(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return usertype = -1;
        
        System.out.println("Entre com a senha:\n");
        String pass = s.next();
        
        if(acc.get(ind).Auth(pass)){

            System.out.println("Acesso permitido!");
            Ses.clear();
            Ses.add("User: Admin");
            Ses.add(acc.get(ind).getNome());
            Ses.add(acc.get(ind));
            return usertype = 2;

        }else{

            System.out.println("Senha incorreta!");
            return usertype = -1;
        }
    }
    
    public static void outArrayAdm(ArrayList<Admin> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i).getNome());
        }
        System.out.println("("+a.size()+") - Voltar");
    }
    
    public static void cadAdm(ArrayList<Admin> acc){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome:");
        String name = s.next();
        System.out.println("Senha:");
        String senha = s.next();
        Admin adm = new Admin(name,senha,acc);
        System.out.println("Usuário cadastrado com sucesso!");
        
    }
    
    public static void eraseAdm(ArrayList<Admin> acc,int usertype, int uo){
        
        System.out.println("Escolha o registro a ser apagado:");
        outArrayAdm(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return;
        acc.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
    public static void editAdmin(ArrayList<Admin> acc,int ut){
        if(ut==2){
            System.out.println("Escolha o registro que deseja alterar");
            outArrayAdm(acc);
            int ind = s.nextInt();
            if(ind==acc.size())return;
            
            System.out.println("Qual campo deseja editar?");
            getAdmData(acc.get(ind));
            System.out.println("(2)Senha");
            int d = s.nextInt();
            if(d==1){
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(ind).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editAdmin(acc,ut);
                    }
                    acc.get(ind).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
            }else if(d==2){
                acc.get(ind).changePass();
            }
        }
    }
    
    public static void getAdmData(Admin adm){
        System.out.println("Dados da conta:"
                + "\n(1)Nome:"+adm.getNome());
    }
    
}
