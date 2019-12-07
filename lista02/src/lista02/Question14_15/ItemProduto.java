/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14_15;

/**
 *
 * @author thalyson
 */
public class ItemProduto {
    
    private int quantidade;
    private Produto produto;
    private final double total;

    public ItemProduto(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.total = quantidade * produto.getPreco();
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
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
}
