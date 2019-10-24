/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lab
 */
public class TesteVenda {
    
    public static void main(String[] args) {
        
        Produto[] produtos = {
            new Produto("Feijão", 10.90f),
            new Produto("Arroz", 15.10f),
            new Produto("Macarrão", 5.60f),
            new Produto("Sabão em Po", 12.99f),
            new Produto("Pão", 4.65f),
            new Produto("Abacaxi", 6.50f)
        };
        
        ArrayList<Venda> vendas = new ArrayList<>();
        
        Venda v1 = new Venda("João");
        
        v1
                .addItemVenda( new VendaItem(produtos[0], 5, 5 ))
                .addItemVenda( new VendaItem(produtos[1], 3, 3 ))
                .addItemVenda( new VendaItem(produtos[2], 4, 4 ));
        
        Random r = new Random();
        
        for (int i = 0; i < 5; i++) {
            Venda v = new Venda(" Cliente " + (i + 1));
            
            for (int j = 0; j < 3; j++) {
                int index = r.nextInt(produtos.length);
                Produto produto = produtos[index];
                int quantidade = r.nextInt(5);
                
                v.addItemVenda(
                    new VendaItem(produto, quantidade, index)
                );
            }
            
            vendas.add(v);
        }
        
        for (Venda v: vendas) {
            System.out.println("Cliente: " + v.getCliente());
            System.out.println("Preço total: " + v.getTotal());
            System.out.println("Itens da Venda");
            
            for (VendaItem vi: v.getItens()) {
                System.out.println(" - " + vi.getProduto().getNome() + " - " +
                " R$ " + vi.getProduto().getPreco() + " - " +
                " Total: " + vi.getTotal());
            }
            
            System.out.println("-------------------------------------");
        }
    }
}
