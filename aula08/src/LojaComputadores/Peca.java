/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaComputadores;

/**
 *
 * @author Lab
 */
public class Peca {
    
    private String fabricante;
    private String nome;
    private double preco;

    public Peca() {
    }

    public Peca(String fabricante, String nome, double preco) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
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
    
    @Override
    public String toString() {
        return " * Fabricante: " 
                + this.fabricante 
                + "\n * Nome: " + this.nome
                + "\n * Preço: " + this.preco;
    }
}
