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
public interface ClientController{
    
    public static void outArrayClt(ArrayList<Cliente> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i).getNome());
        }
        System.out.println("("+a.size()+") - Voltar");
    }
    
    public static void firstLoginCLT(ArrayList acc){
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadClt(acc);
        }
    }
    
    public static int LoginClt(int usertype,ArrayList Ses, ArrayList<Cliente> acc){

        if(acc.isEmpty()){
            firstLoginCLT(acc);
        }
        
        System.out.println("Escolha a conta:");
        outArrayClt(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return usertype = -1;
        
        System.out.println("Senha:");
        String senha = s.next();
        
        if(acc.get(ind).compare(senha)){
            Ses.clear();
            Ses.add("User: Cliente");
            Ses.add(acc.get(ind).getNome());
            Ses.add(acc.get(ind));
            return usertype = 0; 
        }else{
            System.out.println("Senha incorreta! Retornando à tela de Login");
            return usertype = -1;
        }
        
    }
    
    public static void cadClt(ArrayList acc){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome:");
        String n1 = s.next();
        System.out.println("Senha:");
        String s1 = s.next();
        System.out.println("Sobrenome:");
        String sn = s.next();
        System.out.println("Data de nascimento:");
        String bd = s.next();
        System.out.println("Telefone:");
        String t1 = s.next();
        System.out.println("CPF:");
        String cpf = s.next();
        System.out.println("Cidade:");
        String c1 = s.next();
        System.out.println("Endereço:");
        String e1 = s.next();
        System.out.println("Número:");
        int num = s.nextInt();
        System.out.println("Estado:");
        String es = s.next();
        System.out.println("País:");
        String pa = s.next();
        
        Cliente clt = new Cliente(n1,sn,bd,t1,cpf,c1,es,pa,e1,num,DateAndTime.DateTime(),s1,acc);
        System.out.println("Usuário cadastrado com sucesso!\n");
        getCltData(clt);
        
    }
    
    public static void editClt(ArrayList<Cliente> acc,ArrayList Ses,int ut){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArrayClt(acc);
            int ind = s.nextInt();
            if(ind==acc.size())return;
            
            System.out.println("Qual campo deseja editar?");
            getCltData(acc.get(ind));
            System.out.println("(12)Senha");
            int d = s.nextInt();
            switch (d){
                case 1:
                    
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(ind).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 2:
                    
                    System.out.println("Novo Sobrenome:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getSobrenome())){
                        System.out.println("Sobrenome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setSobrenome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 3:
                    
                    System.out.println("Nova data de nascimento:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getDataNascimento())){
                        System.out.println("Data igual a anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setDataNascimento(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 4:
                    
                    System.out.println("Novo Telefone:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getTelefone())){
                        System.out.println("Sobrenome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setSobrenome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 5:
                    
                    System.out.println("Novo CPF:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCPF())){
                        System.out.println("CPF igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setCPF(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 6:
                    
                    System.out.println("Nova Cidade:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCidade())){
                        System.out.println("Cidade igual a anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setCidade(t);    
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 7:
                    
                    System.out.println("Novo Estado:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEstado())){
                        System.out.println("Estado igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setEstado(t); 
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 8:
                    
                    System.out.println("Novo País:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getPais())){
                        System.out.println("País igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setPais(t);   
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 9:
                    
                    System.out.println("Novo Endereço:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEndereço())){
                        System.out.println("Endereço igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setEndereço(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 10:
                    
                    System.out.println("Novo Número:");
                    int i = s.nextInt();
                    if(i==acc.get(ind).getNumero()){
                        System.out.println("Numero igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(ind).setNumero(i);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 12:
                    acc.get(ind).changePass();
            }
            //acc.remove(ind);
            //cadClt(acc);
        }else if(ut==0){
            System.out.println("Qual campo deseja editar?");
            getCltData(acc.get(acc.indexOf(Ses.get(2))));
            System.out.println("(12)Senha");
            int d = s.nextInt();
            switch (d){
                case 1:
                    
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 2:
                    
                    System.out.println("Novo Sobrenome:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getSobrenome())){
                        System.out.println("Sobrenome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setSobrenome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 3:
                    
                    System.out.println("Nova data de nascimento:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getDataNascimento())){
                        System.out.println("Data igual a anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setDataNascimento(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 4:
                    
                    System.out.println("Novo Telefone:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getSobrenome())){
                        System.out.println("Sobrenome igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setSobrenome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 5:
                    
                    System.out.println("Novo CPF:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getCPF())){
                        System.out.println("CPF igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setCPF(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 6:
                    
                    System.out.println("Nova Cidade:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getCidade())){
                        System.out.println("Cidade igual a anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setCidade(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 7:
                    
                    System.out.println("Novo Estado:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getEstado())){
                        System.out.println("Estado igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setEstado(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 8:
                    
                    System.out.println("Novo País:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getPais())){
                        System.out.println("País igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setPais(t); 
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 9:
                    
                    System.out.println("Novo Endereço:");
                    t = s.next();
                    if(t.equals(acc.get(acc.indexOf(Ses.get(2))).getEndereço())){
                        System.out.println("Endereço igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setEndereço(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 10:
                    
                    System.out.println("Novo Número:");
                    int i = s.nextInt();
                    if(i==acc.get(acc.indexOf(Ses.get(2))).getNumero()){
                        System.out.println("Numero igual ao anterior!");
                        editClt(acc,Ses,ut);
                    }
                    acc.get(acc.indexOf(Ses.get(2))).setNumero(i);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 12:
                    acc.get(acc.indexOf(Ses.get(2))).changePass();
            }
            //acc.remove(acc.indexOf(Ses.get(2)));
            //cadClt(acc);
        }
        
    }
    
    public static void eraseClt(ArrayList<Cliente> acc,int usertype, int uo){
        
        System.out.println("Escolha o registro a ser apagado:");
        outArrayClt(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return;
        acc.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
    public static void getCltData(Cliente clt){
        System.out.println("Dados da conta:"
                + "\n(1)Nome:"+clt.getNome()
                + "\n(2)Sobrenome:"+clt.getSobrenome()
                + "\n(3)Data de Nascimento:"+clt.getDataNascimento()
                + "\n(4)Telefone:"+clt.getTelefone()
                + "\n(5)CPF:"+clt.getCPF()
                + "\n(6)Cidade:"+clt.getCidade()
                + "\n(7)Estado:"+clt.getEstado()
                + "\n(8)País:"+clt.getPais()
                + "\n(9)Endereço:"+clt.getEndereço()
                + "\n(10)Número:"+clt.getNumero()
                + "\n(11)Data de cadastro:"+clt.getDataCadastro());
    }
}
