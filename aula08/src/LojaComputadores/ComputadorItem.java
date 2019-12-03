/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaComputadores;

/**
 *
 * @author Lab
 */
public class ComputadorItem {
    
    private Peca peca;
    private int quantidade;
    private double total;

    public ComputadorItem() {
    }

    public ComputadorItem(Peca peca, int quantidade) {
        this.peca = peca;
        this.quantidade = quantidade;
        this.total = quantidade * peca.getPreco();
    }

    /**
     * @return the peca
     */
    public Peca getPeca() {
        return peca;
    }

    /**
     * @param peca the peca to set
     */
    public void setPeca(Peca peca) {
        this.peca = peca;
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
    
    @Override
    public String toString() {
        return "\nITENS DA COMPRA\n - Quantidade: " 
                + this.quantidade + "\n"
                + " - Valor total: " + this.total + "\n"
                + " --- PEÇA ESCOLHIDA ---\n" + this.peca.toString();
    }
}
