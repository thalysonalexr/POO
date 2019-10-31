/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Date;

/**
 *
 * @author Lab
 */
public class ItemEmprestimo {
    
    private String dataDevolucao;
    private Livro livro;

    public ItemEmprestimo() {}
    
    public ItemEmprestimo(String dataDevolucao, Livro livro) {
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
    }

    /**
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.setDataDevolucao(dataDevolucao);
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public String toString() {
        return "Data de devolução: " + this.dataDevolucao + "\n" +
                "-- Livro --" + this.livro + "\n";
    }
}
