/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wilsonmielke
 */
public class TrabalhoPOOWM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        codigo com GUI fica muito diferente para um trabalho simples;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        */
        Scanner s = new Scanner(System.in);
        
        ArrayList<Admin> admin = new ArrayList<>();
        ArrayList<String> admName = new ArrayList<>();
        ArrayList<Vendedor> vend = new ArrayList<>();
        ArrayList<String> vendName = new ArrayList<>();
        ArrayList<Cliente> client = new ArrayList<>();
        ArrayList<String> cltName = new ArrayList<>();
        ArrayList<Fornecedor> forn = new ArrayList<>();
        ArrayList<String> forName = new ArrayList<>();
        ArrayList<Produto> prod = new ArrayList<>(); 
        ArrayList<String> prodName = new ArrayList<>(); 
        ArrayList<Venda> venda = new ArrayList<>();
        ArrayList<String> Ses = new ArrayList<>();
        
        float saldoDeb = 0;
        float saldoDin = 0;
        
        Ses.add("unassagined");
        
        int usertype = -1;
        int opt;
        while(true){
            while(true){//login
                System.out.println("Bem vindo!\nDeseja:"
                        + "\n(1): Entrar em uma conta de administrador?"
                        + "\n(2): Entrar em uma conta de Vendedor?"
                        + "\n(3): Entrar como cliente?"
                        + "\n(4): Entrar como fornecedor?"
                        + "\n(5): Terminar");
                opt = s.nextInt();

                switch(opt){

                    case 1://(admin)
                        usertype = Usefull.LoginAdm(usertype,admin,admName,Ses);
                        break;
                    case 2://(vendedor)
                        usertype = Usefull.LoginVendor(usertype,vend, vendName,Ses);
                        break;
                    case 3://(cliente)
                        usertype = Usefull.LoginClt(usertype,Ses,cltName, client);
                        break;
                    case 4://(fornecedor)
                        usertype = Usefull.LoginForn(usertype,Ses, forn, forName);
                        break;
                    case 5:
                        break;
                }
                if(opt==5)break;
                if(usertype != -1)break;
            }
            while(true){//utilidades
                if(opt==5){
                    break;
                }
                int opt2 = Usefull.actionPicker(usertype);
                switch(opt2){
                    case 1:
                        System.out.println("Qual tipo de registro deseja cadastrar?"
                                + "\n(1) Admin"
                                + "\n(2) Vendedor"
                                + "\n(3) Cliente"
                                + "\n(4) Fornecedor"
                                + "\n(5) Produto"
                                + "\n(6) Voltar");
                        int useropt = s.nextInt();
                        switch(useropt){
                            case 1:
                                Usefull.cadAdm(admin, admName);
                                break;
                            case 2:
                                Usefull.cadVend(vend, vendName);
                                break;
                            case 3:
                                Usefull.cadClt(client, cltName);
                                break;
                            case 4:
                                Usefull.cadForn(forn, forName);
                                break;
                            case 5:
                                Usefull.cadProd(prod, prodName, forName, forn);
                                break;
                            case 6:
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("Qual tipo de registro deseja apagar?"
                                + "\n(1) Admin"
                                + "\n(2) Vendedor"
                                + "\n(3) Cliente"
                                + "\n(4) Fornecedor"
                                + "\n(5) Produto"
                                + "\n(6) Voltar");
                        useropt = s.nextInt();
                        switch(useropt){
                            case 1:
                                Usefull.erase(admin, admName, usertype, useropt);
                                break;
                            case 2:
                                Usefull.erase(vend, vendName, usertype, useropt);
                                break;
                            case 3:
                                Usefull.erase(client, cltName, usertype, useropt);
                                break;
                            case 4:
                                Usefull.erase(forn, forName, usertype, useropt);
                                break;
                            case 5:
                                Usefull.erase(prod, prodName, usertype, useropt);
                                break;
                            case 6:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Qual tipo de registro deseja editar?"
                                + "\n(1) Admin"
                                + "\n(2) Vendedor"
                                + "\n(3) Cliente"
                                + "\n(4) Fornecedor"
                                + "\n(5) Produto"
                                + "\n(6) Voltar");
                        useropt = s.nextInt();
                        switch(useropt){
                            case 1:
                                Usefull.editAdmin(admin, admName,usertype);
                                break;
                            case 2:
                                Usefull.editVend(vend, vendName,usertype);
                                break;
                            case 3:
                                Usefull.editClt(client, cltName,usertype);
                                break;
                            case 4:
                                Usefull.editForn(forn, forName,usertype);
                                break;
                            case 5:
                                Usefull.editProd(prod, prodName,usertype, forn,forName);
                                break;
                            case 6:
                                break;
                        }
                        break;
                    case 4:
                        if(prod.isEmpty()){
                            System.out.println("Para registrar uma conta, deve antes registrar os produtos!");
                            break;
                        }
                        Usefull.venda(cltName, client, prodName,prod , venda, saldoDeb, saldoDin);
                        break;
                    case 5:
                        Usefull.outVenda(venda);
                    case 6: Usefull.returnSession(Ses);
                    break;

                    case 7:
                        System.out.println("Saldo total do dia:"+(saldoDin+saldoDeb)+"\nSaldo de dinheiro físico:"+saldoDin+""
                                + "\nSaldo de débito:"+saldoDeb);
                    case 8: break;   
                }    
                if(opt2 == 8){
                    System.out.println("Sessão finalizada!");
                    break;
                }
            }
            if(opt==5){
                    System.out.println("Terminando o programa!");
                    break;
            }
        }
    }
}
//Implementar controladores