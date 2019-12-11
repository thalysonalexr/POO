/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question20_21;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class TesteLivro {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        
        System.out.print("N: ");
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            String titulo = scan.nextLine();
            Livro livro = new Livro();

            int parar = -1;
                
            do {
                String autor = scan.nextLine();
                livro.addAutor(autor);
                
                System.out.print("Parar 0: ");
                parar = Integer.parseInt(scan.nextLine());
            } while (parar != 0);
            
            String editora = scan.nextLine();
            int anoPub = Integer.parseInt(scan.nextLine());
            double preco = Double.parseDouble(scan.nextLine());
            
            livro.setTitulo(titulo).setEditora(editora).setAnoPublicacao(anoPub).setPreco(preco);
            
            livros.add(livro);
        }
        
        System.out.print("Porcentagem: ");
        Double porc = Double.parseDouble(scan.nextLine()) / 100;
        
        for (Livro l: livros) {
            l.setPreco(l.getPreco() * porc);
            System.out.println(l);
        }
    }
    
}
