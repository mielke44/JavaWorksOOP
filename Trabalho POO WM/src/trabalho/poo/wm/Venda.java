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
public class Venda implements VendaController{
    
    protected Cliente client;
    protected ArrayList item;
    protected String pgto;
    protected double valor;
    public Venda(Cliente client, ArrayList item, String pgto,double valor, ArrayList vendas) {
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
