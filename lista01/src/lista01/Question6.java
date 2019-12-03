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
public class Question6 {
    
    public static void print(Integer[] valores) {
        
        boolean crescente = false;
        
        for (int i = 0; i < (valores.length - 1); i++) {   
            if (valores[i] <= valores[i + 1]) { // [1,2,3,4]
                crescente = true;
            } else {
                crescente = false;
                break;
            }
        }
        
        boolean aleatorio = false;
        
        if (!crescente) {
            for (int i = 0; i < (valores.length - 1); i++) {
                if (valores[i] >= valores[i + 1]) { // [4,3,2,1]
                    crescente = false;
                } else {
                    aleatorio = true;
                    break;
                }
            }
        }
        
        if (aleatorio) {
            System.out.println("Ordem aleatória");
        } else if (crescente) {
            System.out.println("Ordem crescente");
        } else {
            System.out.println("Ordem decrescente");
        }
    }
    
}
