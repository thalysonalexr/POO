/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14_15;

import java.util.ArrayList;

/**
 *
 * @author thalyson
 */
abstract public class Transacao {
    
    protected ArrayList<ItemProduto> produtos = new ArrayList<>();
    protected double total = 0;
    
    abstract public void transacao(ItemProduto produto);
    
    public String getProdutosString() {
        String statement = "--- PRODUTOS ---\n";
        
        for (ItemProduto p: this.produtos) {
            statement +=
                    "Produto:\n" + p.getProduto() + "\n" +
                    "Quantidade: " + p.getQuantidade() + " UN\n" +
                    "Preco total: " + String.format("%.2f R$", p.getTotal()) + "\n";
        }
        
        return statement;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }
    
    public ArrayList<ItemProduto> getProdutos() {
        return this.produtos;
    }
    
    @Override
    abstract public String toString();
}
