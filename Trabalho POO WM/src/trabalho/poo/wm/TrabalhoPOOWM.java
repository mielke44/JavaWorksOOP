/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        To be implemented
        */
        
        Scanner s = new Scanner(System.in);
        
        ArrayList<Admin> admin = new ArrayList<>();
        ArrayList<Vendedor> vend = new ArrayList<>();
        ArrayList<Cliente> client = new ArrayList<>();
        ArrayList<Fornecedor> forn = new ArrayList<>();
        ArrayList<Produto> prod = new ArrayList<>();
        ArrayList<Venda> venda = new ArrayList<>();
        ArrayList<String> Ses = new ArrayList<>();
        
        
        Cliente clt = new Cliente("clt","1","","","","","","","",1,"","1",client);
        Fornecedor forne = new Fornecedor("forn","1","","","","","","","",1,"","",forn);
        Produto prod0 = new Produto("prod","prod",100,10.50,forne,prod);
        Produto prod1 = new Produto("prod1","prod1",100,1.50,forne,prod);
        Produto prod2 = new Produto("prod2","prod2",100,100.50,forne,prod);
        
        float saldoDeb = 0;
        float saldoDin = 0;
        
        Ses.add("unassagined");
        
        int usertype = -1;
        int opt = 0;
        int useropt = 0;
        
        while(true){
            while(true){//login
                System.out.println("Bem vindo!\nDeseja:"
                        + "\n(1): Entrar em uma conta de administrador?"
                        + "\n(2): Entrar em uma conta de Vendedor?"
                        + "\n(3): Entrar como cliente?"
                        + "\n(4): Entrar como fornecedor?"
                        + "\n(5): Terminar");
                
                opt = s.nextInt();
                
                if(opt>5 || opt == 0)System.out.println("Opção inválida!");
                else{
                    switch(opt){

                        case 1://(admin)
                            usertype = AdminController.LoginAdm(usertype,admin,Ses);
                            break;
                        case 2://(vendedor)
                            usertype = VendController.LoginVendor(usertype,vend,Ses);
                            break;
                        case 3://(cliente)
                            usertype = ClientController.LoginClt(usertype,Ses, client);
                            break;
                        case 4://(fornecedor)
                            usertype = FornController.LoginForn(usertype,Ses, forn);
                            break;
                        case 5:
                            break;
                    }
                    if(opt==5)break;
                    if(usertype != -1)break;
                }
            }
            while(true){//utilidades
                if(opt==5){
                    break;
                }
                int opt2 = Usefull.actionPicker(usertype);
                switch(opt2){
                    case 1:
                        if(usertype == 0){
                            System.out.println("Qual tipo de registro deseja cadastrar?"
                                + "\n(3) Cliente"
                                + "\n(6) Voltar");
                        }else{
                            System.out.println("Qual tipo de registro deseja cadastrar?"
                                    + "\n(1) Admin"
                                    + "\n(2) Vendedor"
                                    + "\n(3) Cliente"
                                    + "\n(4) Fornecedor"
                                    + "\n(5) Produto"
                                    + "\n(6) Voltar");
                        }
                        useropt = s.nextInt();
                        switch(useropt){
                            case 1:
                                AdminController.cadAdm(admin);
                                break;
                            case 2:
                                VendController.cadVend(vend);
                                break;
                            case 3:
                                ClientController.cadClt(client);
                                break;
                            case 4:
                                FornController.cadForn(forn);
                                break;
                            case 5:
                                ProdController.cadProd(prod,forn);
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
                                AdminController.eraseAdm(admin, usertype, useropt);
                                break;
                            case 2:
                                VendController.eraseVend(vend, usertype, useropt);
                                break;
                            case 3:
                                ClientController.eraseClt(client, usertype, useropt);
                                break;
                            case 4:
                                FornController.eraseForn(forn, usertype, useropt);
                                break;
                            case 5:
                                ProdController.eraseProd(prod, usertype, useropt);
                                break;
                            case 6:
                                break;
                        }
                        break;
                    case 3:
                        
                        if(usertype==2|| usertype==1){
                            System.out.println("Qual tipo de registro deseja editar?");
                            System.out.println("\n(1) Admin"
                                + "\n(2) Vendedor"
                                + "\n(3) Cliente"
                                + "\n(4) Fornecedor"
                                + "\n(5) Produto"
                                + "\n(6) Voltar");
                            useropt = s.nextInt();
                        }else if(usertype == 0){
                            useropt = 3;
                        }else if(usertype == 3){
                            System.out.println("Qual tipo de registro deseja editar?");
                            System.out.println("\n(4) Fornecedor"
                                + "\n(5) Produto"
                                + "\n(6) Voltar");
                            useropt = s.nextInt();
                        }
                        switch(useropt){
                            case 1:
                                AdminController.editAdmin(admin,usertype);
                                break;
                            case 2:
                                VendController.editVend(vend,usertype);
                                break;
                            case 3:
                                ClientController.editClt(client,Ses,usertype);
                                break;
                            case 4:
                                FornController.editForn(forn,Ses,usertype);
                                break;
                            case 5:
                                ProdController.editProd(prod,usertype,forn);
                                break;
                            case 6:
                                break;
                        }
                        break;
                    case 4:
                        if(prod.isEmpty()){
                            System.out.println("Para registrar uma compra, deve antes registrar os produtos!");
                            break;
                        }
                        VendaController.venda(client,prod , venda, saldoDeb, saldoDin, usertype);
                        break;
                    case 5:
                        VendaController.outVenda(venda);
                        break;
                    case 6: 
                        Usefull.returnSession(Ses);
                        break;

                    case 7:
                        VendaController.fechamDia(venda);
                        break;
                    case 8: break;   
                }    
                if(opt2 == 8){
                    Usefull.logoff(Ses);
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

