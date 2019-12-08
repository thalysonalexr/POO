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
public class Question1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Tabuada do: ");
        int valor = Integer.parseInt(scan.nextLine());
        System.out.print("De: ");
        int inicio = Integer.parseInt(scan.nextLine());
        System.out.print("Ate: ");
        int fim = Integer.parseInt(scan.nextLine());
        
        System.out.println(Question1.tabuada(valor, inicio, fim));
    }
    
    public static String tabuada(int valor, int inicio, int fim) {
        
        String resultado = "| ";
    
        for (int i = inicio; i <= fim; i++) {
            resultado += valor + "*" + i + "=" + (valor*i) + " | "; 
        }
        
        return resultado;
    }
}
