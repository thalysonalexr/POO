/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question13;

/**
 *
 * @author thalyson
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente() {
    }
    
    public static Cliente newCliente() {
        return new Cliente();
    }
    
    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(int id, String nome, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "ID: " + this.id + "\n"
               + "Nome: " + this.nome + "\n"
               + "Endereco: " + this.endereco + "\n"
               + "Telefone: " + this.telefone + "\n";
    }
}
