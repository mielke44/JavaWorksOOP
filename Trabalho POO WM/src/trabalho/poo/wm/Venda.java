/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo.wm;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author wilsonmielke
 */
public class Venda {
    //cliente (Cliente); item (arrayList<Produto e qtde>); tipoPagamento (crédito, débito ou dinheiro);
    
    protected Cliente client;
    protected ArrayList item;
    protected String pgto;
    protected Float valor;
    public Venda(Cliente client, ArrayList item, String pgto,Float valor, ArrayList vendas) {
        this.client = client;
        this.item = item;
        this.pgto = pgto;
        this.valor = valor;
        vendas.add(this);
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public ArrayList getItem() {
        return item;
    }

    public void setItem(ArrayList item) {
        this.item = item;
    }

    public String getPgto() {
        return pgto;
    }

    public void setPgto(String pgto) {
        this.pgto = pgto;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    
    
}
