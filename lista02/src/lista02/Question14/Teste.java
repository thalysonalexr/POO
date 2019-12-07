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
public class Teste {
    
    public static void main(String[] args) {
        
        Produto[] produtos = {
            new Produto(1, 8.50, "Arroz", new Fornecedor("001258638-88", 1, "Fornecedor 1")),
            new Produto(2, 5.50, "Feijao", new Fornecedor("001258638-90", 1, "Fornecedor 2")),
            new Produto(3, 3.60, "Macarrao", new Fornecedor("001258638-44", 1, "Fornecedor 3")),
            new Produto(4, 4.50, "Abobora", new Fornecedor("001258638-60", 1, "Fornecedor 4"))
        };
        
        CompraFornecedor compraFornecedor = new CompraFornecedor();
        
        compraFornecedor.transacao(new ItemProduto(300, produtos[0]));
        compraFornecedor.transacao(new ItemProduto(500, produtos[1]));
        compraFornecedor.transacao(new ItemProduto(300, produtos[2]));
        compraFornecedor.transacao(new ItemProduto(200, produtos[3]));
        
        Venda novaVenda = new Venda(new Cliente("04818013165", 1, "Thalyson Rodrigues"));
        
        novaVenda.transacao(new ItemProduto(2, compraFornecedor.getProdutos().get(0).getProduto()));
        novaVenda.transacao(new ItemProduto(3, compraFornecedor.getProdutos().get(1).getProduto()));
        novaVenda.transacao(new ItemProduto(1, compraFornecedor.getProdutos().get(2).getProduto()));
        
        System.out.println(compraFornecedor);
        System.out.println(novaVenda);
    }
    
}
