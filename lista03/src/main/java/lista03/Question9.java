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
public class Question9 {
    
    public static void main(String[] args) {
        
        char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u'};
        char[] consoantes = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        
        System.out.print("N: ");
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            String palavra = "";
            for (int j = 0; j < 8; j++) {
                int iConsoante = (int) (Math.random() * consoantes.length);
                int iVogal = (int) (Math.random() * vogais.length);
                palavra += String.valueOf(consoantes[iConsoante]) + String.valueOf(vogais[iVogal]);
            }
            System.out.println(palavra);
        }
    }
    
}
