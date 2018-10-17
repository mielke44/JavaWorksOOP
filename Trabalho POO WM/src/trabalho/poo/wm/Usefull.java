/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author wilsonmielke
 */
public class Usefull{
    
    public static Scanner s = new Scanner(System.in);
    
    public static void outArray(ArrayList a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i));
        }
        System.out.println("("+a.size()+") - Voltar");
    }
    
    public static void firstLoginAdm(ArrayList acc,ArrayList accname){
        if(acc.isEmpty()){
            System.out.println("Nenhuma conta admin detectada, gerando uma nova!");
            cadAdm(acc, accname);
        }
    }
                
    public static void firstLoginVend(ArrayList acc, ArrayList accname){
                
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadVend(acc,accname);
            
        }
    }
    
    public static void firstLoginCLT(ArrayList acc, ArrayList accname){
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadClt(acc,accname);
        }
    }
    
    public static void firstLoginForn(ArrayList acc, ArrayList accname){
        if(acc.isEmpty()){        
            System.out.println("Nenhuma conta vendedor detectada, gerando uma nova");
            cadForn(acc,accname);
        }
    }
    
    public static int LoginAdm(int usertype, ArrayList<Admin> acc, ArrayList accName,ArrayList Ses){
        System.out.println("Escolha a conta:");
        if(accName.isEmpty()){
            Usefull.firstLoginAdm(acc,accName);
        }
        
        System.out.println("Escolha a conta:");
        Usefull.outArray(accName);
        int ind = s.nextInt();
        if(ind==accName.size())return usertype = -1;
        
        System.out.println("Entre com a senha:\n");
        String pass = s.next();
        
        if(acc.get(ind).compare(pass)){

            System.out.println("Acesso permitido!");
            Ses.clear();
            Ses.add("User: Admin");
            Ses.add(acc.get(ind).getNome());
            return usertype = 2;

        }else{

            System.out.println("Senha incorreta!");
            return usertype = -1;
        }
    }
    
    public static int LoginVendor(int usertype, ArrayList<Vendedor> acc,ArrayList accName,ArrayList Ses){
        
        System.out.println("Escolha a conta:");
        if(accName.isEmpty()){
            Usefull.firstLoginVend(acc,accName);
        }
        
        System.out.println("Escolha a conta:");
        Usefull.outArray(accName);
        int ind = s.nextInt();
        if(ind==accName.size())return usertype = -1;
        
        System.out.println("Entre com a senha:\n");
        String pass = s.nextLine();
        
        if(acc.get(ind).compare(pass)){

            System.out.println("Acesso permitido!");
            Ses.clear();
            Ses.add("User: vendedor");
            Ses.add(acc.get(ind).getNome());
            return usertype = 1;

        }else{

            System.out.println("Senha incorreta!");
            return usertype = -1;
        }
    }
    
    public static int LoginClt(int usertype,ArrayList Ses, ArrayList accName, ArrayList<Cliente> acc){
        
        System.out.println("Escolha a conta:");
        if(accName.isEmpty()){
            Usefull.firstLoginCLT(acc,accName);
        }
        
        System.out.println("Escolha a conta:");
        Usefull.outArray(accName);
        int ind = s.nextInt();
        if(ind==accName.size())return usertype = -1;
        
        System.out.println("Entre com o seu CPF:");
        String cpf = s.next();
        
        if(acc.get(ind).compare(cpf)){
            Ses.clear();
            Ses.add("User: Cliente");
            Ses.add(acc.get(ind).getNome());
            return usertype = 0; 
        }else{
            System.out.println("CPF incorreto!");
            return usertype = -1;
        }
        
    }
    
    public static int LoginForn(int usertype,ArrayList Ses, ArrayList<Fornecedor> acc, ArrayList accName){
        System.out.println("Escolha a conta:");
        if(accName.isEmpty()){
            Usefull.firstLoginForn(acc,accName);
        }
        System.out.println("Escolha a conta:");
        Usefull.outArray(accName);
        int ind = s.nextInt();
        if(ind==accName.size())return usertype = -1;
        
        System.out.println("Entre com o seu CNPJ:");
        String cnpj = s.next();
        
        if(acc.get(ind).compare(cnpj)){
            Ses.clear();
            Ses.add("User: Fornecedor");
            Ses.add(acc.get(ind).getNome());
            return usertype = 3;
        }else{
            System.out.println("CNPJ incorreto!");
            return usertype = -1;
        } 
    }
    
    public static void cadAdm(ArrayList acc, ArrayList accName){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome");
        String name = s.next();
        System.out.println("Senha");
        String senha = s.next();
        Admin adm = new Admin(name,senha, acc, accName);
        System.out.println("Usuário cadastrado com sucesso!");
        
    }
    
    public static void cadVend(ArrayList acc, ArrayList accName){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome");
        String n1 = s.next();
        System.out.println("Telefone");
        String t1 = s.next();
        System.err.println("Cidade");
        String c1 = s.next();
        System.err.println("login");
        String l1 = s.next();
        System.err.println("Senha");
        String s1 = s.next();
        Vendedor vend1 = new Vendedor(n1,t1,c1,DateAndTime.DateTime(),l1,s1,acc,accName);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    public static void cadClt(ArrayList acc, ArrayList accName){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome");
        String n1 = s.next();
        System.out.println("Telefone");
        String t1 = s.next();
        System.out.println("CPF:");
        String cpf = s.next();
        System.out.println("Cidade");
        String c1 = s.next();
        System.out.println("Endereço");
        String e1 = s.next();
        Cliente clt = new Cliente(n1,t1,cpf,c1,e1,DateAndTime.DateTime(),acc,accName);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    public static void cadForn(ArrayList acc, ArrayList accName){
        System.out.println("Entre com os seguintes dados:");
        System.out.println("Nome");
        String n1 = s.next();
        System.out.println("Telefone");
        String t1 = s.next();
        System.out.println("CNPJ:");
        String cnpj = s.next();
        System.out.println("E-Mail");
        String m1 = s.next();
        System.out.println("Endereço");
        String e1 = s.next();
        Fornecedor forn = new Fornecedor(n1,t1,cnpj,m1,e1,DateAndTime.DateTime(),acc,accName);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    public static void cadProd(ArrayList acc, ArrayList accName,ArrayList fornName,ArrayList forn){
        if(fornName.isEmpty()){
            System.out.println("Para cadastrar um produto, deve antes cadastrar um fornecedor!");
            return;
        }
        System.out.println("Entre com os seguintes dados:");
        System.out.println("nome:");
        String nome = s.next();
        System.out.println("Descrição:");
        String desc = s.next();
        System.out.println("Quantidade:");
        int quant = s.nextInt();
        System.out.println("Preço:");
        int preco = s.nextInt();
        System.out.println("Indique o fornecedor:");
        outArray(fornName);
        int ind = s.nextInt();
        
        Produto prod = new Produto(nome,desc, quant, preco, (Fornecedor) forn.get(ind), acc, accName);
                
    }
    
    public static void returnSession(ArrayList Ses){
        for(int i = 0; i<Ses.size(); i++){
            System.out.println(Ses.get(i));
        }
        
    }

    public static void erase(ArrayList acc, ArrayList accName,int usertype, int uo){
        if(usertype!=2){
            System.out.println("Seu usuário não tem permissão para deletar registros!");
        }
        System.out.println("Escolha o registro a ser apagado:");
        outArray(accName);
        int ind = s.nextInt();
        if(ind==accName.size())return;
        acc.remove(ind);
        accName.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
    public static void editAdmin(ArrayList acc, ArrayList accName,int ut){
        if(ut==2){
            System.out.println("Escolha o registro que deseja alterar");
            outArray(accName);
            int ind = s.nextInt();
            if(ind==accName.size())return;
            acc.remove(ind);
            accName.remove(ind);
            cadAdm(acc, accName);
        }
    }
    
    public static void editVend(ArrayList acc, ArrayList accName,int ut){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArray(accName);
            int ind = s.nextInt();
            if(ind==accName.size())return;
            acc.remove(ind);
            accName.remove(ind);
            cadVend(acc, accName);
        }
    }
    
    public static void editClt(ArrayList acc, ArrayList accName,int ut){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArray(accName);
            int ind = s.nextInt();
            if(ind==accName.size())return;
            acc.remove(ind);
            accName.remove(ind);
            cadForn(acc,accName);
        }
        
    }
    
    public static void editForn(ArrayList acc, ArrayList accName,int ut){
       if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArray(accName);
            int ind = s.nextInt();
            if(ind==accName.size())return;
            acc.remove(ind);
            accName.remove(ind);
            cadForn(acc,accName); 
        }
    }
    
    public static void editProd(ArrayList acc, ArrayList accName,int ut, ArrayList forn,ArrayList forName){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArray(accName);
            int ind = s.nextInt();
            if(ind==accName.size())return;
            acc.remove(ind);
            accName.remove(ind);
            cadProd(acc, accName, forn,forName);
        }
    }
    
    public static void venda(ArrayList cltName, ArrayList clt, ArrayList prodName, 
        ArrayList<Produto> prod , ArrayList venda, float saldoDeb, float saldoDin){
        if(cltName.isEmpty()){
            System.out.println("Para fazer uma venda, deve antes cadastrar um cliente!");
            return;
        }else if(prod.isEmpty()){
            System.out.println("Para fazer uma venda, deve antes cadastrar um produto!");
        }
        ArrayList prodVend = new ArrayList<>();
        System.out.println("Entre com os seguintes dados de venda:");
        System.out.println("Cliente:");
        outArray(cltName);
        int ind = s.nextInt();
        if(ind==cltName.size())return;
        int p = 0;
        float preço = 0;
        int q = 0;
        while(true){
            System.out.println("produto e quantidade:");
            System.out.println("(-1) - Terminar a compra!");
            outArray(prodName);
            p = s.nextInt();
            if(p==prodName.size())return;
            if(p == -1)break;
            System.out.println("Quantidade (max:"+prod.get(p).getQuantidade()+") :");
            q = s.nextInt();
            while(q>prod.get(p).getQuantidade()){
                System.out.println("Quantidade acima do disponível em estoque!");
                System.out.println("Quantidade (max:"+prod.get(p).getQuantidade()+") :");
                q = s.nextInt();
            }
            prodVend.add(prodName.get(p));
            prodVend.add(q);
            preço += prod.get(p).getPreço()*q;
            prod.get(p).setQuantidade(prod.get(p).getQuantidade()-q);
        }
        for(int i = 0; i<prodVend.size(); i += 2){
            System.out.println("("+i+") - "+" Produto: "+prodVend.get(i) +"\n Quantidade: " +prodVend.get(i+1));
        }
        System.out.println("Preço final: R$"+preço);
        System.out.println("Escolha a forma de pagamento:");
        String pgto = s.next();
        int par = 0;
        if(pgto.equalsIgnoreCase("crédito")||pgto.equalsIgnoreCase("credito")){   
            if(preço > 1000){
                System.out.println("Parcelado em quantas vezes? (máximo 10;"
                        + " Acima de 5 vezes, terá acréscimo de juros de 5%)");
                par = s.nextInt();
            }
            
        }else if(pgto.equalsIgnoreCase("débito")||pgto.equalsIgnoreCase("debito")){
            saldoDeb += preço;
        }else if(pgto.equalsIgnoreCase("dinheiro")||pgto.equalsIgnoreCase("a vista")){
            saldoDin += preço;
        }else System.out.println("Método de pagamento inválido!");
        System.out.println("Compra concluída!");
        Venda v = new Venda((Cliente) clt.get(ind),prodVend,pgto,preço,venda);
        
        
    }
    
    public static void outVenda(ArrayList<Venda> a){
        for(int i = 0; i<a.size(); i ++){
            System.out.println("("+i+") - "+"Cliente:"+a.get(i).getClient().getNome()+", Produto:"+a.get(i).getItem().get(i) 
                    +", quantidade: " +a.get(i).getItem().get(i+1)+", Forma de pagamento:"+a.get(i).getPgto()+", Valor final: R$"
                    +a.get(i).getValor());
        }
    }
    
    public static int actionPicker(int ut){
        switch (ut) {
            case 0:
                System.out.println("Olá cliente! Deseja: "
                        + "\n(4): Comprar produtos!"
                        + "\n(6): Visualizar Minha Sessão."
                        + "\n(7): Log-off");
                break;
            case 1:
                System.out.println("Olá Vendedor! Deseja: "
                        + "\n(1): Cadastrar novo usuário/produto"
                        + "\n(3): Editar usuário/produto"
                        + "\n(4): Registrar venda"
                        + "\n(5): Listar Vendas"
                        + "\n(6): Visualizar Minha Sessão."
                        + "\n(7): Verificar fechamento do dia"
                        + "\n(8): Log-off");
                break;
            case 2:
                System.out.println("Olá admin! Deseja: "
                    + "\n(1): Cadastrar novo usuário/produto"
                    + "\n(2): Apagar usuário/produto"
                    + "\n(3): Editar usuário/produto"
                    + "\n(4): Registrar venda"
                    + "\n(5): Listar Vendas"
                    + "\n(6): Visualizar Minha Sessão."
                    + "\n(7): Verificar fechamento do dia"    
                    + "\n(8): Log-off");
                break;
            case 3:
                System.out.println("Olá Fornecedor! Deseja: "
                        + "\n(3): Editar produto"
                        + "\n(6): Visualizar Minha Sessão."
                        + "\n(7): Log-off");
                break;
            default:
                break;
        }
            int opt2;
            return opt2 = s.nextInt();
    }
    
}
