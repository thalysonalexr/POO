/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01.Question14;

import java.util.ArrayList;
import java.util.Scanner;
import lista01.Question13.Produto;

/**
 *
 * @author visitante
 */
public class Question14 {
    
    public static void run() {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Produto> compra = new ArrayList<>();
        
        int op = -1;
        double total = 0;
        
        do {
            int codigo = Integer.parseInt(scan.nextLine());
            String produto = scan.nextLine();
            double preco = Double.parseDouble(scan.nextLine());
            
            produtos.add(new Produto(codigo, produto, preco));
            
            System.out.println("Produto cadastrado com sucesso! Sair: 0");
            op = Integer.parseInt(scan.nextLine());
            
        } while (op != 0);
        
        do {
            System.out.println("-- Compra --");
            op = Integer.parseInt(scan.nextLine());
            
            for (Produto p: produtos)
                if (p.getCodigo() == op) {
                    total += p.getPreco();
                    compra.add(p);
                    break;
                }
            
        } while (op != 0);
        
        for (Produto p: compra) {
            System.out.println(p);
        }
        
        System.out.println("Total: " + total);
    }
    
}
