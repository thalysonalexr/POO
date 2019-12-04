/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Question10 {
    
    public static void print() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("N: ");
        int n = Integer.parseInt(scan.nextLine());
        
        switch (n) {
            case 1:
                System.out.println("Azul");
                break;
            case 2:
                System.out.println("Verde");
                break;
            case 3:
                System.out.println("Amarelo");
                break;
            case 4:
                System.out.println("Preto");
                break;
            case 5:
                System.out.println("Vermelho");
                break;
            case 6:
                System.out.println("Marrom");
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }
    
}
