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
public class Question5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Para parametro = ");
        int parametro = Integer.parseInt(scan.nextLine());
        
        String result = "  * |";
        
        for (int i = 1; i <= parametro; i++) {
            result += String.format("%3d", i) + " ";
        }
        
        result += "\n" + buildString('-', parametro * 4) + "\n";
        
        for (int i = 1; i <= parametro; i++) {
            
            result += String.format("%3d", i) + " |";
            
            for (int j = 1; j <= parametro; j++) {
                result += String.format("%3d", (j * i)) + " ";
            }
            
            result += "\n";
        }
        
        System.out.println(result);
    }
    
    public static String buildString(char c, int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, c);
        return new String(arr);
    }
}
