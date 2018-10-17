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
public class Produto{
    
    protected String nome;
    protected String Descrição; 
    protected int quantidade; 
    protected int preço; 
    protected Fornecedor Fornecedor;

    public Produto(String nome,String Descrição, int quantidade, int preço, Fornecedor Fornecedor, ArrayList acc, ArrayList accName) {
        this.nome = nome;
        this.Descrição = Descrição;
        this.quantidade = quantidade;
        this.preço = preço;
        this.Fornecedor = Fornecedor;
        acc.add(this);
        accName.add(this.getNome());
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public Fornecedor getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(Fornecedor Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
