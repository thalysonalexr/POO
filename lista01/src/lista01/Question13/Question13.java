/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01.Question13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Question13 {
    
    public static void run() {
        
        Scanner scan = new Scanner(System.in);
        
        int op = -1;
        double total = 0;

        Produto[] cardapio = {
            new Produto(100, "Bauru", 2.00),
            new Produto(101, "Cachorro Quente", 5.00),
            new Produto(102, "Refrigerante", 4.00),
            new Produto(103, "Cheeseburger", 5.00)
        };
        
        ArrayList<Produto> compra = new ArrayList<>();

        do {
            op = Integer.parseInt(scan.nextLine());
            
            for (Produto p: cardapio)
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
