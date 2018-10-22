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
public interface Usefull{
    
    public static Scanner s = new Scanner(System.in);

    public static void returnSession(ArrayList Ses){
        System.out.println("Sessão atual:\n");
        for(int i = 0; i<(Ses.size()-1); i++){
            System.out.println(Ses.get(i));
        }
        
    }
    
    public static int actionPicker(int ut){
        switch (ut) {
            
            case 0:
                System.out.println("Olá cliente! Deseja: "
                        + "\n(1): Cadastrar novo usuário"
                        + "\n(3): Editar seu usuário"
                        + "\n(4): Comprar produtos!"
                        + "\n(6): Visualizar Minha Sessão."
                        + "\n(8): Log-off");
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
                        + "\n(1): Cadastrar novo usuário/produto"
                        + "\n(3): Editar produto ou este usuário"
                        + "\n(6): Visualizar Minha Sessão."
                        + "\n(8): Log-off");
                break;
            default:
                break;
        }
        int opt2;
        return opt2 = s.nextInt();
        
    }
    
    public static void logoff(ArrayList Ses){
        Ses.clear();
        System.out.println("Sessão finalizada!");
    }
    
}
