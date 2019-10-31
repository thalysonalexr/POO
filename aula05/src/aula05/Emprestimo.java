/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Emprestimo {
    
    private String nomePessoa;
    private int quantidadeLivros;
    private ArrayList<ItemEmprestimo> itensEmprestimo = new ArrayList<>();
    
    public Emprestimo() {}
    
    public Emprestimo(String nomePessoa, ItemEmprestimo itemEmprestimo) {
        this.nomePessoa = nomePessoa;
        this.addItemEmprestimo(itemEmprestimo);
    }
    
    public void addItemEmprestimo(ItemEmprestimo ie) {
        this.getItensEmprestimo().add(ie);
        this.quantidadeLivros++;
    }

    /**
     * @return the nomePessoa
     */
    public String getNomePessoa() {
        return nomePessoa;
    }

    /**
     * @param nomePessoa the nomePessoa to set
     */
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    /**
     * @return the quantidadeLivros
     */
    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }

    /**
     * @param quantidadeLivros the quantidadeLivros to set
     */
    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }

    /**
     * @return the itensEmprestimo
     */
    public ArrayList<ItemEmprestimo> getItensEmprestimo() {
        return itensEmprestimo;
    }

    /**
     * @param itensEmprestimo the itensEmprestimo to set
     */
    public void setItensEmprestimo(ArrayList<ItemEmprestimo> itensEmprestimo) {
        this.itensEmprestimo = itensEmprestimo;
    }
    
    public String toString() {
        String emprestimo = "* Para: " + this.nomePessoa + "\n" +
                "* Quantidade: " + this.quantidadeLivros + "\n";
        
        emprestimo += "* Itens do empréstimo\n";
        
        for (ItemEmprestimo ie: this.itensEmprestimo) {
            emprestimo += ie + "\n";
        }
        
        return emprestimo;
    }
}
