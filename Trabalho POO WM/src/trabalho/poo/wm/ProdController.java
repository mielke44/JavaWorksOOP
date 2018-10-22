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
public interface ProdController{
    
    public static void outArrayProduto(ArrayList<Produto> a){
        for(int i = 0; i<a.size(); i++){
            System.out.println("("+i+") - "+a.get(i).getNome());
        }
        System.out.println("("+a.size()+") - Voltar");
    }
    
    
    public static void cadProd(ArrayList acc,ArrayList forn){
        if(forn.isEmpty()){
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
        Double preco = s.nextDouble();
        System.out.println("Indique o fornecedor:");
        FornController.outArrayForn(forn);
        int ind = s.nextInt();
        
        Produto prod = new Produto(nome,desc, quant, preco, (Fornecedor) forn.get(ind), acc);
                
    }
    
    
    
    public static void editProd(ArrayList acc,int ut, ArrayList forn){
        if(ut==2 || ut==1){
            System.out.println("Escolha o registro que deseja alterar");
            outArrayProduto(acc);
            int ind = s.nextInt();
            if(ind==acc.size())return;
            acc.remove(ind);
            cadProd(acc, forn);
        }
    }
    
    public static void eraseProd(ArrayList<Produto> acc,int usertype, int uo){
        
        System.out.println("Escolha o registro a ser apagado:");
        outArrayProduto(acc);
        int ind = s.nextInt();
        if(ind==acc.size())return;
        acc.remove(ind);
        System.out.println("Registro apagado com sucesso!");
    }
    
}
