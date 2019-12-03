/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01.Question7;

/**
 *
 * @author visitante
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;
    // desconto em porcentagem
    private double desconto;
    private double total;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.desconto = desconto * preco * quantidade;
        this.total = (quantidade * preco) - this.desconto;
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
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString() {
        return "\nProduto: " + this.nome + "\n"
                + "Preço: " + this.preco + "\n"
                + "Quantidade: " + this.quantidade + "\n"
                + "Desconto: " + this.desconto + "\n"
                + "Total: " + this.total + "\n";
    }
}
