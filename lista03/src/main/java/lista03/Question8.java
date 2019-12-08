/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thalyson
 */
public class Question8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sobrenomes = new ArrayList<>();
        
        int n = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes.add(scan.nextLine());
            System.out.print("Sobrenome " + (i + 1) + ": ");
            sobrenomes.add(scan.nextLine());
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(nomes.get(i) + " " + sobrenomes.get(j));
            }
        }
    }
    
}
