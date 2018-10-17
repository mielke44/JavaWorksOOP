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
public class Fornecedor{
    protected String Nome; 
    protected String RazaoSocial;
    protected String CNPJ; 
    protected String email;
    protected String telefone; 
    protected String cidade; 
    protected String estado; 
    protected String pais;
    protected String endereço;
    protected int numero; 
    protected String dataCadastro;

    public Fornecedor(String NomeFantasia, String CNPJ, String email, String telefone, String endereço, String dataCadastro
            ,ArrayList acc, ArrayList accName) {
        this.Nome = NomeFantasia;
        this.CNPJ = CNPJ;
        this.email = email;
        this.telefone = telefone;
        this.endereço = endereço;
        this.dataCadastro = dataCadastro;
        acc.add(this);
        accName.add(this.getNome());
    }
    
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String NomeFantasia) {
        this.Nome = NomeFantasia;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    protected String getCNPJ() {
        return CNPJ;
    }

    protected void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public boolean compare(String cnpj){
        return this.CNPJ.equals(cnpj);
    }
    
}
