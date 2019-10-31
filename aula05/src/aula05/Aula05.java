/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // estático
        Assunto[] assuntos = {
            new Assunto("Programação"),
            new Assunto("Arquitetura"),
            new Assunto("Matemática"),
            new Assunto("Biologia"),
            new Assunto("Romance")
        };
        
        Livro[] livros = {
            new Livro(2011, "Thalyson R.", "Programando com Python"),
            new Livro(2012, "Thalyson R.", "Programando com PHP"),
            new Livro(1999, "Thalyson R.", "Como programar: para iniciantes"),
            new Livro(2000, "Thalyson R.", "Hello World!!!")
        };
        
        livros[0].addAssunto(assuntos[0]);
        livros[0].addAssunto(assuntos[1]);
        livros[0].addAssunto(assuntos[2]);
        
        livros[1].addAssunto(assuntos[2]);
        livros[1].addAssunto(assuntos[3]);
        
        livros[2].addAssunto(assuntos[0]);
        
        livros[3].addAssunto(assuntos[2]);
        livros[3].addAssunto(assuntos[1]);
        livros[3].addAssunto(assuntos[3]);
        livros[3].addAssunto(assuntos[3]);
        
        Emprestimo e1 = new Emprestimo("Alexandre T.", new ItemEmprestimo("25/02/2020", livros[0]));
        e1.addItemEmprestimo(new ItemEmprestimo("24/11/2019", livros[1]));
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        biblioteca.novoLivro(livros[0]);
        biblioteca.novoLivro(livros[1]);
        biblioteca.novoLivro(livros[2]);
        biblioteca.novoLivro(livros[3]);

        biblioteca.novoEmprestimo(e1);
 
        // biblioteca.imprimirLivros();
        biblioteca.imprimirEmprestimos();

        // dinamico
        /*
        Scanner scan = new Scanner(System.in);
        
        String opcao = "";
        
        while (!(opcao.equals("x") || opcao.equals("X"))) {
            System.out.print(Aula05.menu());
            opcao = scan.nextLine();
            
            switch(opcao) {
                case "1":
                    biblioteca.novoLivro(Aula05.addLivro());
                    break;
            }
        }
        */
    }
    
    private static String menu() {
        return "1 - Inserir novo livro" +
                "\nx - Sair" +
                "\n>> ";
    }
    
    private static Assunto getAssunto(int index) {
        Assunto[] assuntos = {
            new Assunto("Programação"),
            new Assunto("Arquitetura"),
            new Assunto("Matemática"),
            new Assunto("Biologia"),
            new Assunto("Romance")
        };

        return assuntos[index];
    }
    
    private static Livro addLivro() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scan.nextLine());
        
        System.out.print("Autor: ");
        String autor = scan.nextLine();
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        
        return new Livro(ano, autor, nome);
    }
}

