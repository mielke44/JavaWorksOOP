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
public class Cliente{
    protected String Nome; 
    protected String sobrenome; 
    protected String dataNascimento; 
    protected String telefone; 
    protected String CPF; 
    protected String cidade; 
    protected String estado; 
    protected String pais; 
    protected String endereço; 
    protected int numero; 
    protected String dataCadastro;

    public Cliente(String Nome, String telefone, String CPF, String cidade, 
            String endereço, String dataCadastro, ArrayList acc, ArrayList accName) {
        this.Nome = Nome;
        this.telefone = telefone;
        this.CPF = CPF;
        this.cidade = cidade;
        this.endereço = endereço;
        this.dataCadastro = dataCadastro;
        acc.add(this);
        accName.add(this.getNome());
    }

    

    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected String getCPF() {
        return CPF;
    }

    protected void setCPF(String CPF) {
        this.CPF = CPF;
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
    
    public boolean compare(String cpf){
        return this.CPF.equals(cpf);
    }
}
