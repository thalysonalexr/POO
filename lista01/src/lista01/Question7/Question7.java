/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01.Question7;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Question7 {
    
    public static void print() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("N: ");
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<Produto> produtos = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            produtos.add(
                new Produto(
                    scan.nextLine(),
                    Double.parseDouble(scan.nextLine()),
                    Integer.parseInt(scan.nextLine()),
                    Double.parseDouble(scan.nextLine())
                )
            );
        }
        
        double totalCompra = 0;
        
        for (Produto p: produtos) {
            totalCompra += p.getTotal();
            System.out.println(p);
        }
        
        System.out.println("Total da compra: " + totalCompra);
    }
    
}
