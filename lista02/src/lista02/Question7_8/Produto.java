/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question7_8;

/**
 *
 * @author visitante
 */
public class Produto {
    
    
    private String nome;
    private double preco;
    private Departamento departamento;

    public Produto() {
    }

    public Produto(String nome, double preco, Departamento departamento) {
        this.nome = nome;
        this.preco = preco;
        this.departamento = departamento;
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
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }
    
    @Override
    public String toString() {
        return "Produto: " + this.nome + "\n"
                + "Preço: " + this.preco + " R$\n";
    }
}
