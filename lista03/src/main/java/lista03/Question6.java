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
public class Question6 {
    
    public static void main(String[] args) {
        
        // declaracao de variaveis
        Scanner scan = new Scanner(System.in);
        
        // leitura
        System.out.print("Texto: ");
        String texto = scan.nextLine().toLowerCase();
        
        int totalVogais = Question6.countVogais(texto);
        int totalConsoantes = texto.length() - totalVogais;
        
        System.out.println("Total de vogais: " + totalVogais + " (" + 100 / texto.length() * totalVogais + "%)");
        System.out.println("Total de consoantes: " + totalConsoantes + " (" + 100 / texto.length() * totalConsoantes + "%)");
    }
    
    public static int countVogais(String texto) {
        char[] vogais = new char[]{'a', 'e', 'i', 'o', 'u'};
        int totalVogais = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (vogais[j] == texto.charAt(i)) {
                    totalVogais++;
                    break;
                }
            }
        }
        
        return totalVogais;
    }
}
