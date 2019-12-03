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
public class Question5 {
    
    public static Integer[] print() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("N: ");
        
        int n = Integer.parseInt(scan.nextLine());
        Integer[] valores = new Integer[n];
        
        for (int i = 0; i < n; i++)
            valores[i] = Integer.parseInt(scan.nextLine());
        
        int menor = valores[0];
        int maior = 0, media = 0;
        
        for (int i = 0; i < n; i++) {
            if (valores[i] > maior)
                maior = valores[i];
            
            if (valores[i] < menor)
                menor = valores[i];
            
            media += valores[i];
        }

        media = media / n;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
        
        return valores;
    }
}
