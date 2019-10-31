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
public class Livro {
    
    private int ano;
    private String autor;
    private String nome;
    private ArrayList<Assunto> assuntos = new ArrayList<>();

    public Livro() {}
    
    public Livro(int ano, String autor, String nome) {
        this.ano = ano;
        this.autor = autor;
        this.nome = nome;
    }
    
    public void addAssunto(Assunto a) {
        this.getAssuntos().add(a);
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
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
     * @return the assuntos
     */
    public ArrayList<Assunto> getAssuntos() {
        return assuntos;
    }

    /**
     * @param assuntos the assuntos to set
     */
    public void setAssuntos(ArrayList<Assunto> assuntos) {
        this.assuntos = assuntos;
    }
    
    @Override
    public String toString() {
        String livro = "* Ano: " + this.ano + 
                "\n" + "* Autor: " + this.autor +
                "\n" + "* Nome: " + this.nome;

        livro += "\n* Assunto(s) *\n";

        for (Assunto a: this.assuntos) {
            livro += a + "\n";
        }

        return livro;
    }
}
