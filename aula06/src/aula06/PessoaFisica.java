/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Lab
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String nomeConjuge;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String cpf, String nomeConjuge) {
        this.cpf = cpf;
        this.nomeConjuge = nomeConjuge;
    }

    public PessoaFisica(String cpf, String nomeConjuge, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.nomeConjuge = nomeConjuge;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nomeConjuge
     */
    public String getNomeConjuge() {
        return nomeConjuge;
    }

    /**
     * @param nomeConjuge the nomeConjuge to set
     */
    public void setNomeConjuge(String nomeConjuge) {
        this.nomeConjuge = nomeConjuge;
    }
    
    @Override
    public String toString() {
        return "--- Pessoa Fisica ---\nCPF: " 
                + this.cpf + "\n" 
                + "Conjuge: " + this.nomeConjuge + "\n"
                + super.toString();
    }
}
