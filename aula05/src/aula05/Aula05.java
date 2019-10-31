/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Lab
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Assunto[] assuntos = {
            new Assunto("Programação"),
            new Assunto("Arquitetura"),
            new Assunto("Matemática"),
            new Assunto("Biologia"),
            new Assunto("Romance")
        };
        
        Livro l1 = new Livro(2011, "Thalyson R.", "Programando com Python");
        Livro l2 = new Livro(2012, "Thalyson R.", "Programando com PHP");
        Livro l3 = new Livro(1999, "Thalyson R.", "Como programar: para iniciantes");
        Livro l4 = new Livro(2000, "Thalyson R.", "Hello World!!!");
        
        l1.addAssunto(assuntos[0]);
        l1.addAssunto(assuntos[1]);
        l1.addAssunto(assuntos[2]);
        
        l2.addAssunto(assuntos[2]);
        l2.addAssunto(assuntos[3]);
        
        l3.addAssunto(assuntos[0]);
        
        l4.addAssunto(assuntos[2]);
        l4.addAssunto(assuntos[1]);
        l4.addAssunto(assuntos[3]);
        l4.addAssunto(assuntos[3]);
        
        Emprestimo e1 = new Emprestimo("Alexandre T.", new ItemEmprestimo("25/02/2020", l1));
        e1.addItemEmprestimo(new ItemEmprestimo("24/11/2019", l2));
        e1.addItemEmprestimo(new ItemEmprestimo("04/12/2020", l3));
        e1.addItemEmprestimo(new ItemEmprestimo("02/01/2020", l4));
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        biblioteca.novoLivro(l1);
        
        biblioteca.novoEmprestimo(e1);
        
        // biblioteca.imprimirLivros();
        biblioteca.imprimirEmprestimos();
    }
    
}
