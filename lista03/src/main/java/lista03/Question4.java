/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thalyson
 */
public class Question4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Largura: ");
        int largura = Integer.parseInt(scan.nextLine());
        
        System.out.println("Formato 1");
        Question4.formato1(largura);
        System.out.println("Formato 2");
        Question4.formato2(largura);
    }
    
    public static void formato1(int largura) {
        for (int i = 0; i < largura; i++) {
            for (int j = 0; j < largura; j++) {
                if (i == j) {
                    System.out.println(Question4.buildString('#', i + 1));
                }
            }
        }
    }
    
    public static void formato2(int largura) {
        for (int i = largura; i >= 1; i--) {
            for (int j = largura; j >= 1; j--) {
                if (i == j) {
                    System.out.println(Question4.buildString('#', i));
                }
            }
        }
    }
    
    public static String buildString(char c, int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, c);
        return new String(arr);
    }
}
