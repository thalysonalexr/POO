/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Venda {
    
    private String cliente;
    private double total;
    private ArrayList<VendaItem> itens = new ArrayList<>();
    
    public Venda() {}
    
    public Venda(String cliente) {
        this.cliente = cliente;
    }
    
    public Venda(String cliente, double total) {
        this.cliente = cliente;
        this.total = 0;
    }
    
    public Venda addItemVenda(VendaItem v) {
        this.itens.add(v);
        this.total += v.getTotal();
        return this;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    /**
     * @return the itens
     */
    public ArrayList<VendaItem> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<VendaItem> itens) {
        this.itens = itens;
    }
}
