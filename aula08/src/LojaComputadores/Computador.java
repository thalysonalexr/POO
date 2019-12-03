/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaComputadores;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Computador {
    
    private String cliente;
    private String descricao;
    private ArrayList<ComputadorItem> itens = new ArrayList<>();
    private double precoTotal;

    public Computador() {
    }

    public Computador(String cliente, String descricao) {
        this.cliente = cliente;
        this.descricao = descricao;
    }
    
    public void addItem(ComputadorItem e) {
        this.itens.add(e);
        this.precoTotal += e.getTotal();
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the itens
     */
    public ArrayList<ComputadorItem> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<ComputadorItem> itens) {
        this.itens = itens;
    }

    /**
     * @return the precoTotal
     */
    public double getPrecoTotal() {
        return precoTotal;
    }

    /**
     * @param precoTotal the precoTotal to set
     */
    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
    @Override
    public String toString() {
        String computador = "Cliente: " + this.cliente
                + "\nDescricao: " + this.descricao
                + "\nPreço total: " + this.precoTotal + "\n";
        
        for (ComputadorItem ci: this.itens)
            computador += ci;
        
        return computador;
    }
}
