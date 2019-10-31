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
public class Biblioteca {
    
    private String nomeBiblioteca;
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    public Biblioteca() {}
    
    public Biblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }
    
    public void imprimirEmprestimos() {
        System.out.println("LIVROS EMPRESTADOS\n");
        for (Emprestimo e: this.emprestimos) {
            System.out.println(e);
        }
        
        System.out.println("--------------");
    }
    
    public void imprimirLivros() {
        System.out.println("LIVROS DA BIBLIOTECA\n");
        
        for (Livro l: this.livros) {
            System.out.println(l);
        }

        System.out.println("--------------");
    }
    
    public void novoEmprestimo(Emprestimo e) {
        this.getEmprestimos().add(e);
    }
    
    public void novoLivro(Livro l) {
        this.getLivros().add(l);
    }

    /**
     * @return the nomeBiblioteca
     */
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    /**
     * @param nomeBiblioteca the nomeBiblioteca to set
     */
    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    /**
     * @return the livros
     */
    public ArrayList<Livro> getLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    /**
     * @return the emprestimos
     */
    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    /**
     * @param emprestimos the emprestimos to set
     */
    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }
}
