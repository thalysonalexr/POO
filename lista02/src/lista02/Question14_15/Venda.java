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
public class Venda extends Transacao {
    
    private Cliente cliente;
    private Vendedor vendedor;
    private int mes;

    public Venda(Cliente cliente, Vendedor vendedor, int mes) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.mes = mes;
    }

    @Override
    public void transacao(ItemProduto produto) {
        this.total += produto.getTotal();
        this.vendedor.addComissao(total);
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "--- VENDA DE PRODUTOS ---\n"
               + this.getCliente()
               + this.getProdutosString()
               + "\nTotal da Compra: " + String.format("%.2f R$", this.total);
    }
    
    public void setProdutos(ArrayList<ItemProduto> produtos) {
        produtos.forEach((p) -> {
            this.transacao(p);
        });
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
}
