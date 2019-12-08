/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author thalyson
 */
public class Question2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Integer[] valores = new Integer[10];
        
        System.out.println("Digite:");
        
        for (int i = 0; i < 10; i++) {
            int valor = Integer.parseInt(scan.nextLine());
            valores[i] = valor;
        }
        
        for (int j = (valores.length - 1); j >= 0; j--) {
            System.out.println(valores[j]);
        }
    }
}
