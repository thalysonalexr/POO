/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

import java.util.ArrayList;

/**
 *
 * @author thalyson
 */
public class Equipe {
    
    private String nome;
    private String descricao;
    private ArrayList<Corretor> corretores = new ArrayList<>();
    private Gerente lider;

    public Equipe() {
    }

    public Equipe(String nome, String descricao, Gerente lider) {
        this.nome = nome;
        this.descricao = descricao;
        this.lider = lider;
    }
    
    public void addCorretor(Corretor corretor) {
        this.corretores.add(corretor);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @return the corretores
     */
    public ArrayList<Corretor> getCorretores() {
        return corretores;
    }

    /**
     * @param corretores the corretores to set
     */
    public void setCorretores(ArrayList<Corretor> corretores) {
        this.corretores = corretores;
    }
    
    /**
     * @return the lider
     */
    public Gerente getLider() {
        return lider;
    }

    /**
     * @param lider the lider to set
     */
    public void setLider(Gerente lider) {
        this.lider = lider;
    }
    
    public String toString() {
        String corretores = "";
        
        for (Corretor c: this.corretores) {
            corretores += c;
        }
        
        return "Equipe: " + this.nome + "\n"
               + "Descricao: " + this.descricao + "\n"
               + "Lider: " + this.lider + "\n"
               + "Corretores:\n"
               + corretores;
    }
}
