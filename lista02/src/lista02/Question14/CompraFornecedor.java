/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14;

/**
 *
 * @author thalyson
 */
public class CompraFornecedor extends Transacao {

    private static final double LUCRO = 0.40;

    @Override
    public void transacao(ItemProduto produto) {
        this.total += produto.getTotal();
        
        produto.getProduto().setPreco(
            produto.getProduto().getPreco() +
            (CompraFornecedor.LUCRO * produto.getProduto().getPreco())
        );
        
        this.produtos.add(produto);
    }
    
    @Override
    public String toString() {
        return "--- COMPRA COM FORNECEDOR ---\n"
                + this.getProdutosString()
                + "\nTotal da transacao: "
                + String.format("%.2f R$", this.getTotal()) + "\n";
    }
}
