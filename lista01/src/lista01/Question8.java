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
public class Question8 {
    
    public static boolean primo(int valor) {
        
        int divisoes = 0;
        
        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                divisoes++;
            }
        }

        return divisoes == 2;
    }

}
