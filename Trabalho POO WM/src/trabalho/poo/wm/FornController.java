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
public interface FornController{
    
    public static void outArrayForn(ArrayList<Fornecedor> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i).getNome());
        }
        System.out.println("("+a.size()+") - Voltar");
    }
    
    public static void firstLoginForn(ArrayList acc){
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadForn(acc);
        }
    }
    
    public static int LoginForn(int usertype,ArrayList Ses, ArrayList<Fornecedor> acc){
        System.out.println("Escolha a conta:");
        if(acc.isEmpty()){
            firstLoginForn(acc);
        }
        System.out.println("Escolha a conta:");
        outArrayForn(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return usertype = -1;
        
        System.out.println("Senha:");
        String senha = s.next();
        
        if(acc.get(ind).compare(senha)){
            Ses.clear();
            Ses.add("User: Fornecedor");
            Ses.add(acc.get(ind).getNome());
            Ses.add(acc.get(ind));
            return usertype = 3;
        }else{
            System.out.println("Senha incorreta!");
            return usertype = -1;
        } 
    }
    
    public static void cadForn(ArrayList acc){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome");
        String n1 = s.next();
        System.out.println("Senha");
        String s1 = s.next();
        System.out.println("Razão Social");
        String rs = s.next();
        System.out.println("Telefone");
        String t1 = s.next();
        System.out.println("CNPJ:");
        String cnpj = s.next();
        System.out.println("E-Mail");
        String m1 = s.next();
        System.out.println("Endereço");
        String e1 = s.next();
        System.out.println("Cidade");
        String cid = s.next();
        System.out.println("Estado");
        String est = s.next();
        System.out.println("País");
        String p = s.next();
        System.out.println("Endereço");
        String end = s.next();
        System.out.println("Número");
        int num = s.nextInt();
        Fornecedor forn = new Fornecedor(n1,rs,cnpj,m1,t1,cid,est,p,end,num,DateAndTime.DateTime(),s1,acc);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    public static void editForn(ArrayList<Fornecedor> acc,ArrayList Ses,int ut){
       if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArrayForn(acc);
            int ind = s.nextInt();
            if(ind==acc.size())return;
            System.out.println("Qual campo deseja editar?");
            getFornData(acc.get(ind));
            System.out.println("(12)Senha");
            int d = s.nextInt();
            switch (d){
                case 1:
                    
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(ind).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 2:
                    
                    System.out.println("Nova Razão Social:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getRazaoSocial())){
                        System.out.println("Razão Social igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setRazaoSocial(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 3:
                    
                    System.out.println("Novo E-Mail:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEmail())){
                        System.out.println("E-Mail igual a anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setEmail(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 4:
                    
                    System.out.println("Novo Telefone:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getTelefone())){
                        System.out.println("Telefone igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setTelefone(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 5:
                    
                    System.out.println("Novo CNPJ:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCNPJ())){
                        System.out.println("CNPJ igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setCNPJ(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 6:
                    
                    System.out.println("Nova Cidade:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCidade())){
                        System.out.println("Cidade igual a anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setCidade(t);    
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 7:
                    
                    System.out.println("Novo Estado:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEstado())){
                        System.out.println("Estado igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setEstado(t); 
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 8:
                    
                    System.out.println("Novo País:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getPais())){
                        System.out.println("País igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setPais(t);   
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 9:
                    
                    System.out.println("Novo Endereço:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEndereço())){
                        System.out.println("Endereço igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setEndereço(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 10:
                    
                    System.out.println("Novo Número:");
                    int i = s.nextInt();
                    if(i==acc.get(ind).getNumero()){
                        System.out.println("Numero igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(ind).setNumero(i);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 12:
                    acc.get(ind).changePass();
            }
            
        }else if(ut==3){
            System.out.println("Qual campo deseja editar?");
            getFornData(acc.get(acc.indexOf(Ses.get(2))));
            System.out.println("(12)Senha");
            int d = s.nextInt();
            switch (d){
                case 1:
                    
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 2:
                    
                    System.out.println("Nova Razão Social:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getRazaoSocial())){
                        System.out.println("Razão Social igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setRazaoSocial(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 3:
                    
                    System.out.println("Novo E-Mail:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getEmail())){
                        System.out.println("E-Mail igual a anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setEmail(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 4:
                    
                    System.out.println("Novo Telefone:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getTelefone())){
                        System.out.println("Telefone igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setTelefone(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 5:
                    
                    System.out.println("Novo CNPJ:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getCNPJ())){
                        System.out.println("CNPJ igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setCNPJ(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 6:
                    
                    System.out.println("Nova Cidade:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getCidade())){
                        System.out.println("Cidade igual a anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setCidade(t);    
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 7:
                    
                    System.out.println("Novo Estado:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getEstado())){
                        System.out.println("Estado igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setEstado(t); 
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 8:
                    
                    System.out.println("Novo País:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getPais())){
                        System.out.println("País igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setPais(t);   
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 9:
                    
                    System.out.println("Novo Endereço:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getEndereço())){
                        System.out.println("Endereço igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setEndereço(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 10:
                    
                    System.out.println("Novo Número:");
                    int i = s.nextInt();
                    if(i==acc.get(acc.indexOf(Ses.get(2))).getNumero()){
                        System.out.println("Numero igual ao anterior!");
                        editForn(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setNumero(i);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 12:
                    acc.get(acc.indexOf(Ses.get(2))).changePass();
            }
            //acc.remove(acc.indexOf(Ses.get(2)));
            //cadForn(acc);
        }
    }
    
    public static void eraseForn(ArrayList<Fornecedor> acc,int usertype, int uo){
        
        System.out.println("Escolha o registro a ser apagado:");
        outArrayForn(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return;
        acc.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
    public static void getFornData(Fornecedor forn){
        System.out.println("Dados da conta:"
                + "\n(1)Nome:"+forn.getNome()
                + "\n(2)Razão Social:"+forn.getRazaoSocial()
                + "\n(3)E-Mail:"+forn.getEmail()
                + "\n(4)Telefone:"+forn.getTelefone()
                + "\n(5)CNPJ:"+forn.getCNPJ()
                + "\n(6)Cidade:"+forn.getCidade()
                + "\n(7)Estado:"+forn.getEstado()
                + "\n(8)País:"+forn.getPais()
                + "\n(9)Endereço:"+forn.getEndereço()
                + "\n(10)Número:"+forn.getNumero()
                + "\n(11)Data de cadastro:"+forn.getDataCadastro());
    }
}
