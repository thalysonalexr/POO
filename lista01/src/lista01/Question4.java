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
public class Question4 {
    
    public static void print() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os intervalos: ");
        int i = Integer.parseInt(scan.nextLine());
        int j = Integer.parseInt(scan.nextLine());

        for (int count = i; count <= j; count++) {
            if (count % 2 == 0) {
                System.out.print(count + ", ");
            }
        }
    }
}
