/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14;

import java.util.ArrayList;

/**
 *
 * @author thalyson
 */
public class Venda extends Transacao {
    
    private Cliente cliente;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void transacao(ItemProduto produto) {
        this.total += produto.getTotal();
        this.produtos.add(produto);
    }
    
    @Override
    public String toString() {
        return "--- VENDA DE PRODUTOS ---\n"
               + this.cliente
               + this.getProdutosString()
               + "\nTotal da Compra: " + String.format("%.2f R$", this.total);
    }
    
    public void setProdutos(ArrayList<ItemProduto> produtos) {
        produtos.forEach((p) -> {
            this.transacao(p);
        });
    }
}
