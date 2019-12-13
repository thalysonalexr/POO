/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question22_23;

/**
 *
 * @author visitante
 */
public class Produto {
    
    private String nome;
    private Departamento departamento;
    private double preco;

    public Produto() {
    }

    public Produto(String nome, Departamento departamento, double preco) {
        this.nome = nome;
        this.departamento = departamento;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @return 
     */
    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     * @return 
     */
    public Produto setDepartamento(Departamento departamento) {
        this.departamento = departamento;
        return this;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     * @return 
     */
    public Produto setPreco(double preco) {
        this.preco = preco;
        return this;
    }
    
    @Override
    public String toString() {
        return "Produto: " + this.nome + "\n"
               + "Departamento: " + this.departamento
               + "Preco: " + this.preco + "\n";
    }
}
