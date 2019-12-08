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
public class Question7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Binario: ");
        String binario = scan.nextLine();
        
        if (isBinario(binario)) {
            
            int decimal = 0;
            
            binario = reversed(binario);
            
            for (int i = 0; i < binario.length(); i++)
                decimal += Integer.parseInt(String.valueOf(binario.charAt(i))) * (int) Math.pow(2, i);
            
            System.out.println("Decimal: " + decimal);
            
        } else {
            System.out.println("O valor informado deve ser binario!");
        }
    } 
    
    public static boolean isBinario(String binario) {
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) != '1' && binario.charAt(i) != '0') {
                return false;
            }
        }
        
        return true;
    }
    
    public static String reversed(String texto) {
        char[] arr = new char[texto.length()];
        int j = 0;
        
        for (int i = (texto.length() - 1); i >= 0; i--) {
            arr[j] = texto.charAt(i);
            j++;
        }

        return new String(arr);
    }
}
