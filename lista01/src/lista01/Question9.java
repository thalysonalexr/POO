/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

/**
 *
 * @author visitante
 */
public class Question9 {
    
    public static void primos(int i, int j) {
        
        for (int begin = i; begin <= j; begin++) {
            if (Question8.primo(begin)) {
                System.out.print(begin + ", ");
            }
        }
        
    }
    
}
