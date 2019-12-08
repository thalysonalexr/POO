/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Random;

/**
 *
 * @author thalyson
 */
public class Question3 {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Integer[] array1 = new Integer[5];
        Integer[] array2 = new Integer[5];
        
        for (int i = 0; i < 5; i++) {
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
        }
        
        String soma = "| ";
        
        for (int j = 0; j < 5; j++) {
            soma += (array1[j] + array2[j]) + " | ";
        }
        
        System.out.println(soma);
    }
    
}
