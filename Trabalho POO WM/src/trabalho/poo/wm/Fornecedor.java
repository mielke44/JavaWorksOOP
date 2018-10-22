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
    private String senha;

    public Fornecedor(String Nome,String RS, String CNPJ, String email, String telefone, String cid, String estado, String pais, String endereço, int num,String dataCadastro
            ,String senha,ArrayList acc) {
        
        this.Nome = Nome;
        this.RazaoSocial = RS;
        this.cidade = cid;
        this.CNPJ = CNPJ;
        this.email = email;
        this.telefone = telefone;
        this.estado = estado;
        this.pais = pais;
        this.numero = num;
        this.endereço = endereço;
        this.dataCadastro = dataCadastro;
        this.senha = senha;
        acc.add(this);
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
    
    public boolean compare(String senha){
        return this.senha.equals(getSenha());
    }

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void changePass(){
        System.out.println("Entre com a senha atual:");
        String t = s.next();
        if(compare(t)){
            System.out.println("Senha atual correta!\nEntre com a nova senha!");
            t = s.next();
            this.setSenha(t);
        }else{
            System.out.println("Senha atual incorreta!");
            changePass();
        }
        
    }
    
}
