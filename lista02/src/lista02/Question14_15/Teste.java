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
public class Teste {
    
    public static void main(String[] args) {
        
        Departamento[] departamentos = {
            new Departamento("Eletronicos"),
            new Departamento("Alimenticios"),
            new Departamento("Calcados")
        };
        
        Fornecedor[] fornecedores = {
            new Fornecedor("001258638-88", 1, "DELL"),
            new Fornecedor("001258638-90", 2, "Nestle"),
            new Fornecedor("001225877-85", 3, "Netshoes")
        };
        
        Produto[] produtos = {
            new Produto(
                1, 1880.50, "Notebook DELL 8GB",
                fornecedores[0],
                departamentos[0]
            ),
            new Produto(
                2, 5.50, "Barra de Chocolate KitKat",
                fornecedores[1],
                departamentos[1]
            ),
            new Produto(
                3, 259.80, "Tenis Nike Shox",
                fornecedores[2],
                departamentos[2]
            )
        };
        
        CompraFornecedor compraFornecedor = new CompraFornecedor();
        
        compraFornecedor.transacao(new ItemProduto(300, produtos[0]));
        compraFornecedor.transacao(new ItemProduto(500, produtos[1]));
        compraFornecedor.transacao(new ItemProduto(300, produtos[2]));
        
        Venda venda1 = new Venda(
            new Cliente("04818013165", 1, "Thalyson Rodrigues"),
            new Vendedor("Maria de Paula", "Vendedora", "Vendas"),
            10 // mes 11 novembro
        );
        
        Venda venda2 = new Venda(
            new Cliente("04818013165", 1, "Thalyson Rodrigues"),
            new Vendedor("Maria de Paula", "Vendedora", "Vendas"),
            10 // mes 11 novembro
        );
        
        Venda venda3 = new Venda(
            new Cliente("04818013165", 1, "Thalyson Rodrigues"),
            new Vendedor("Joao Paulo", "Vendedor", "Vendas"),
            11 // mes 12 dezembro
        );
        
        Venda venda4 = new Venda(
            new Cliente("04818013165", 1, "Thalyson Rodrigues"),
            new Vendedor("Maria de Paula", "Vendedora", "Vendas"),
            11 // mes 11 novembro
        );
        
        Venda venda5 = new Venda(
            new Cliente("04818013165", 1, "Thalyson Rodrigues"),
            new Vendedor("Maria de Paula", "Vendedora", "Vendas"),
            12 // mes 11 novembro
        );
        
        venda1.transacao(new ItemProduto(2, compraFornecedor.getProdutos().get(0).getProduto()));
        venda1.transacao(new ItemProduto(3, compraFornecedor.getProdutos().get(1).getProduto()));
        venda1.transacao(new ItemProduto(1, compraFornecedor.getProdutos().get(2).getProduto()));
        
        venda2.transacao(new ItemProduto(5, compraFornecedor.getProdutos().get(0).getProduto()));
        venda2.transacao(new ItemProduto(7, compraFornecedor.getProdutos().get(1).getProduto()));
        
        venda3.transacao(new ItemProduto(3, compraFornecedor.getProdutos().get(1).getProduto()));
        venda3.transacao(new ItemProduto(4, compraFornecedor.getProdutos().get(0).getProduto()));
        venda3.transacao(new ItemProduto(6, compraFornecedor.getProdutos().get(2).getProduto()));
        venda3.transacao(new ItemProduto(8, compraFornecedor.getProdutos().get(1).getProduto()));
        
        venda4.transacao(new ItemProduto(10, compraFornecedor.getProdutos().get(0).getProduto()));
        venda4.transacao(new ItemProduto(2, compraFornecedor.getProdutos().get(1).getProduto()));
        venda4.transacao(new ItemProduto(5, compraFornecedor.getProdutos().get(2).getProduto()));
        
        venda5.transacao(new ItemProduto(4, compraFornecedor.getProdutos().get(2).getProduto()));
        venda5.transacao(new ItemProduto(4, compraFornecedor.getProdutos().get(1).getProduto()));
        venda5.transacao(new ItemProduto(6, compraFornecedor.getProdutos().get(0).getProduto()));
        venda5.transacao(new ItemProduto(3, compraFornecedor.getProdutos().get(0).getProduto()));
        venda5.transacao(new ItemProduto(2, compraFornecedor.getProdutos().get(2).getProduto()));
        
        ArrayList<Venda> vendas = new ArrayList<>();
        
        vendas.add(venda1);
        vendas.add(venda2);
        vendas.add(venda3);
        vendas.add(venda4);
        vendas.add(venda5);
        
        Gerente gerente = new Gerente("Natanael", "Gerente", "Vendas");
        
        Teste.fechamento(vendas, gerente);
    }
    
    public static void fechamento(ArrayList<Venda> vendas, Gerente gerente) {
        
        double total = 0;
        
        for (int i = 1; i <= 12; i++) {
            
            double totalMes = 0;
            
            System.out.println("MES: " + i + "\n");
            
            for (Venda v: vendas) {
                if (v.getMes() == i) {
                    System.out.println(
                        "CLIENTE:\n" + v.getCliente() + "\n" +
                        "VENDEDOR\n" + v.getVendedor() + "\n" +
                        "TOTAL: " + String.format("%.2f R$", v.getTotal()) + "\n"
                    );
                    
                    totalMes += v.getTotal();
                }
            }
            
            total += totalMes;
            System.out.println("TOTAL MES: " + String.format("%.2f R$", totalMes) + "\n");
        }
        
        System.out.println(
            "GERENTE: " + gerente.getNome() + "\n" +
            "SALARIO: " + String.format("%.2f R$", (gerente.getSalario() + (gerente.getComissao() * total)))
        );
        
        System.out.println("\nTOTAL ANUAL: " + total + "\n");
    }
}
