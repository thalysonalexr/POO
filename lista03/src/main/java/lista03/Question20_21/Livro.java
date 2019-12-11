/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question20_21;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Livro {
    
    private String titulo;
    private ArrayList<String> autores = new ArrayList<>();
    private String editora;
    private int anoPublicacao;
    private double preco;

    public Livro() {
    }

    public Livro(String titulo, String editora, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }
    
    public void addAutor(String autor) {
        this.autores.add(autor);
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     * @return 
     */
    public Livro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    /**
     * @return the autores
     */
    public ArrayList<String> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     * @return 
     */
    public Livro setAutores(ArrayList<String> autores) {
        this.autores = autores;
        return this;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     * @return 
     */
    public Livro setEditora(String editora) {
        this.editora = editora;
        return this;
    }

    /**
     * @return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     * @return 
     */
    public Livro setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        return this;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     * @return 
     */
    public Livro setPreco(double preco) {
        this.preco = preco;
        return this;
    }
    
    @Override
    public String toString() {
        String autores = "";
        
        autores = this.autores.stream().map((autor) -> autor + " ").reduce(autores, String::concat);
        
        return "Titulo: " + this.titulo + "\n"
                + "Autores: " + autores + "\n"
                + "Editora: " + this.editora + "\n"
                + "Ano pub: " + this.anoPublicacao + "\n"
                + "Preço: " + String.format("%.2f R$", this.preco) + "\n";
    }
}
