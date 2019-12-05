/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question7_8;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
class Departamento {
    
    private String nome;
    private String descricao;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Departamento() {
    }

    public Departamento(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public void addProduto(Produto produto) {
        this.produtos.add(produto);
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the produtos
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    @Override
    public String toString() {
        
        String produtos = "";
        
        for (Produto p: this.produtos)
            produtos += p;
        
        return "Departamento: " + this.nome + "\n"
                + "Descrição: " + this.descricao + "\n"
                + "Produtos: " + produtos;
    }
}
