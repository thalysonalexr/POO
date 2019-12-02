/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Animal {
    
    private String nome;
    private ArrayList<Procedimento> procedimentos;
    private String raca;
    private String tipo;

    public void adicionaProcedimento(Procedimento p) {
        this.getProcedimentos().add(p);
    }
    
    ArrayList<Procedimento> retornaProcedimentos() {
        return this.getProcedimentos();
    }

    public Animal() {
    }

    public Animal(String nome, ArrayList<Procedimento> procedimentos, String raca, String tipo) {
        this.nome = nome;
        this.procedimentos = procedimentos;
        this.raca = raca;
        this.tipo = tipo;
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
     * @return the procedimentos
     */
    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    /**
     * @param procedimentos the procedimentos to set
     */
    public void setProcedimentos(ArrayList<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
