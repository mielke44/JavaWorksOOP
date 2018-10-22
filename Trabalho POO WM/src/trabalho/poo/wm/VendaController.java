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
public interface VendaController extends Usefull{
    
        public static void venda(ArrayList<Cliente> clt,ArrayList<Produto> prod , ArrayList venda, float saldoDeb, float saldoDin,int ut){
        if(clt.isEmpty()){
            System.out.println("Para fazer uma venda, deve antes cadastrar um cliente!");
            return;
        }else if(prod.isEmpty()){
            System.out.println("Para fazer uma venda, deve antes cadastrar um produto!");
            return;
        }
        ArrayList<Integer> quant = new ArrayList<>();
        for(int i =0; i<prod.size();i++)quant.add(prod.get(i).getQuantidade());
        ArrayList prodVend = new ArrayList<>();
        int ind = 0;
        if(ut !=0){
            System.out.println("Entre com os seguintes dados de venda:");
            System.out.println("Cliente:");
            ClientController.outArrayClt(clt);
            ind = s.nextInt();
            if(ind==clt.size())return;
        }
        int p;
        double preço = 0;
        int q;
        int c;
        while(true){
            System.out.println("produto e quantidade:");
            ProdController.outArrayProduto(prod);
            p = s.nextInt();
            if(p==prod.size()){
               break;
            }
            System.out.println("Quantidade (max:"+prod.get(p).getQuantidade()+") :");
            q = s.nextInt();
            
            while(q>prod.get(p).getQuantidade()){
                System.out.println("Quantidade acima do disponível em estoque!");
                System.out.println("Quantidade (max:"+prod.get(p).getQuantidade()+") :");
                q = s.nextInt();
            }
            
            if(prodVend.contains(prod.get(p).getNome())){
                
                
                int quantAnt =(Integer) prodVend.get(prodVend.indexOf(prod.get(p))+2);
                prodVend.set(prodVend.indexOf(prod.get(p).getNome())+1, quantAnt+q);
                preço += prod.get(p).getPreço()*q;
                prod.get(p).setQuantidade(prod.get(p).getQuantidade()-q);
                
            }else{
                prodVend.add(prod.get(p).getNome());
                prodVend.add(q);
                preço += prod.get(p).getPreço()*q;
                prod.get(p).setQuantidade(prod.get(p).getQuantidade()-q);
            }
            
        }
        for(int i = 0; i<prodVend.size(); i += 2){
            System.out.println("("+i+")-"+"Produto: "+prodVend.get(i) +"\n Quantidade: " +prodVend.get(i+1));
        }
        System.out.println("Preço final: R$"+preço);
        
        System.out.println("Deseja confirmar a compra?:"
                + "\n(1): Sim!"
                + "\n(2): Não!");
        c = s.nextInt();
        if(c==2){
            System.out.println("Compra cancelada!");
            System.out.println(quant.get(0));
            for(int i = 0; i<prod.size(); i++){
                prod.get(i).setQuantidade(quant.get(i));
            }
            System.out.println(prod.get(0).getQuantidade());
            
            prodVend.clear();
            return;
        }else if(c<=0 || c>2){
            System.out.println("Entre com um número válido! Cancelando a compra!");
            prodVend.clear();
            prod.clear();
            return;
        }
        
        System.out.println("Escolha a forma de pagamento (crédito, débito ou dinheiro):");
        String pgto = s.next();
        int par = 0;
        if(pgto.equalsIgnoreCase("crédito")||pgto.equalsIgnoreCase("credito")){
            
            if(preço > 1000){
                System.out.println("Parcelado em quantas vezes? (máximo 10x;"
                        + " Acima de 5x, terá acréscimo de juros de 5%)");
                par = s.nextInt();
                System.out.println("Pagamento será efetuado em "+par+"x, totalizando "+par+"Parcelas de R$"+(preço/par)
                        + "Deseja confirmar?"
                        + "(1) Sim"
                        + "(2) Não");
                ind = s.nextInt();
                if(ind!=1||ind!=2){
                    System.out.println("Opcão inválida!");
                }else if(ind==2){
                }else if(ind==1){
                    System.out.println("Compra concluída!");
                    Venda v = new Venda((Cliente) clt.get(ind),prodVend,pgto,preço,venda);
                }
                
            }else{
                System.out.println("Compra abaixo de R$1000,00, sem parcelamento permitido!");
                System.out.println("Compra concluída!");
                par = 1;
                Venda v = new Venda((Cliente) clt.get(ind),prodVend,pgto,preço,venda);
            }
        }else if(pgto.equalsIgnoreCase("débito")||pgto.equalsIgnoreCase("debito")){
            
            System.out.println("Compra concluída!");
            Venda v = new Venda((Cliente) clt.get(ind),prodVend,pgto,preço,venda);
            
        }else if(pgto.equalsIgnoreCase("dinheiro")||pgto.equalsIgnoreCase("vista")){
            
            System.out.println("Compra concluída!");
            Venda v = new Venda((Cliente) clt.get(ind),prodVend,pgto,preço,venda);
            
        }else System.out.println("Método de pagamento inválido!");
    }
    
    public static void outVenda(ArrayList<Venda> a){
        if(a.isEmpty()){
            System.out.println("Não há vendas registradas!");
            return;
        }
        for(int i = 0; i<a.size(); i ++){
            System.out.println("("+i+") - "+"Cliente:"+a.get(i).getClient().getNome()+", Produto:"+a.get(i).getItem().get(i) 
                    +", quantidade: " +a.get(i).getItem().get(i+1)+", Forma de pagamento:"+a.get(i).getPgto()+", Valor final: R$"
                    +a.get(i).getValor());
        }
    }
    
    public static void fechamDia(ArrayList<Venda> v){
        double saldoDeb = 0;
        double saldoVista = 0;
        for(int i = 0; i<v.size(); i++){
            if(v.get(i).getPgto().equalsIgnoreCase("crédito")||v.get(i).getPgto().equalsIgnoreCase("credito")){
                return;
            }else if(v.get(i).getPgto().equalsIgnoreCase("débito")||v.get(i).getPgto().equalsIgnoreCase("debito")){
                saldoDeb += v.get(i).getValor();
            }else if(v.get(i).getPgto().equalsIgnoreCase("a vista")||v.get(i).getPgto().equalsIgnoreCase("dinheiro")){
                saldoVista += v.get(i).getValor();
            }
        }
        System.out.println("Fechamento do dia:"
                + "\n Saldo Débito:"+saldoDeb
                + "\n Saldo Dinheiro:"+saldoVista
                + "\n Saldo total:"+(saldoVista+saldoDeb));
    }
}
