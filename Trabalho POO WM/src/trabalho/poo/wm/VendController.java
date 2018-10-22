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
public interface VendController extends Usefull{
    
    public static void outArrayVend(ArrayList<Vendedor> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i).getNome());
        }
        System.out.println("("+a.size()+") - Voltar");
    }
                
    public static void firstLoginVend(ArrayList acc){
                
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadVend(acc);
            
        }
    }
    
    public static int LoginVendor(int usertype, ArrayList<Vendedor> acc,ArrayList Ses){
        
        System.out.println("Escolha a conta:");
        if(acc.isEmpty()){
            firstLoginVend(acc);
        }
        
        System.out.println("Escolha a conta:");
        outArrayVend(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return usertype = -1;
        
        System.out.println("Entre com a senha:\n");
        String pass = s.next();
        
        if(acc.get(ind).Auth(pass)){

            System.out.println("Acesso permitido!");
            Ses.clear();
            Ses.add("User: vendedor");
            Ses.add(acc.get(ind).getNome());
            Ses.add(acc.get(ind));
            return usertype = 1;

        }else{

            System.out.println("Senha incorreta!");
            return usertype = -1;
        }
    }
    
    public static void cadVend(ArrayList acc){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome:");
        String n1 = s.next();
        System.out.println("Sobrenome:");
        String sn = s.next();
        System.out.println("Data de nascimento:");
        String bd = s.next();
        System.out.println("Telefone");
        String t1 = s.next();
        System.out.println("CPF:");
        String cpf = s.next();
        System.err.println("Cidade:");
        String c1 = s.next();
        System.out.println("Estado:");
        String es = s.next();
        System.out.println("País:");
        String pa = s.next();
        System.out.println("Endereço:");
        String end = s.next();
        System.out.println("Número:");
        int num = s.nextInt();
        System.err.println("login:");
        String l1 = s.next();
        System.err.println("Senha:");
        String s1 = s.next();
        Vendedor vend1 = new Vendedor(n1,sn,bd,t1,cpf,c1,es,pa,end,num,DateAndTime.DateTime(),l1,s1,acc);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    public static void editVend(ArrayList<Vendedor> acc,int ut){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArrayVend(acc);
            int ind = s.nextInt();
            if(ind==acc.size())return;
            
            System.out.println("Qual campo deseja editar?");
            getVendData(acc.get(ind));
            System.out.println("(12)Senha");
            int d = s.nextInt();
            switch (d){
                case 1:
                    
                    System.out.println("Novo Nome:");
                    String t = s.next();
                    if(t.equals(acc.get(ind).getNome())){
                        System.out.println("Nome igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setNome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 2:
                    
                    System.out.println("Nova Data de nascimento:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getNasc())){
                        System.out.println("Data de nascimento igual a anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setDataNasc(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 3:
                    
                    System.out.println("Novo Sobrenome:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getSobre())){
                        System.out.println("Sobrenome igual a anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setSobrenome(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 4:
                    
                    System.out.println("Novo Telefone:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getPhone())){
                        System.out.println("Telefone igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setPhone(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 5:
                    
                    System.out.println("Novo CPF:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCPF())){
                        System.out.println("CPF igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setCPF(t);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 6:
                    
                    System.out.println("Nova Cidade:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getCid())){
                        System.out.println("Cidade igual a anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setCidade(t);    
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 7:
                    
                    System.out.println("Novo Estado:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEst())){
                        System.out.println("Estado igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setEstado(t); 
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 8:
                    
                    System.out.println("Novo País:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getPais())){
                        System.out.println("País igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setPais(t);   
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 9:
                    
                    System.out.println("Novo Endereço:");
                    t = s.next();
                    if(t.equals(acc.get(ind).getEnd())){
                        System.out.println("Endereço igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setEndereco(t);  
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 10:
                    
                    System.out.println("Novo Número:");
                    int i = s.nextInt();
                    if(i==acc.get(ind).getNumero()){
                        System.out.println("Numero igual ao anterior!");
                        editVend(acc,ut);
                    }
                    acc.get(ind).setNumero(i);
                    System.out.println("Campo alterado com sucesso!");
                    break;
                    
                case 12:
                    acc.get(ind).changePass();
            }
            
            //acc.remove(ind);
            //cadVend(acc);
        }
    }
    
    public static void eraseVend(ArrayList<Vendedor> acc,int usertype, int uo){
        
        System.out.println("Escolha o registro a ser apagado:");
        outArrayVend(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return;
        acc.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
    public static void getVendData(Vendedor vend){
        System.out.println("Dados da conta:"
                + "\n(1)Nome:"+vend.getNome()
                + "\n(2)Data de Nascimento:"+vend.getNasc()
                + "\n(3)Sobrenome:"+vend.getSobre()                
                + "\n(4)Telefone:"+vend.getPhone()
                + "\n(5)CPF:"+vend.getCPF()
                + "\n(6)Cidade:"+vend.getCid()
                + "\n(7)Estado:"+vend.getEst()
                + "\n(8)País:"+vend.getPais()
                + "\n(9)Endereço:"+vend.getEnd()
                + "\n(10)Número:"+vend.getNumero()
                + "\n(11)Data de cadastro:"+vend.getCreate());
    }
}
