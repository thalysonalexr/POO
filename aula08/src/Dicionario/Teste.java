/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dicionario;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Dicionario d = new Dicionario();

        d.insert("numeros pares", 2);
        d.insert("numeros pares", 4);
        d.insert("numeros divisiveis por 10", 10);
        d.insert("numeros divisiveis por 10", 20);
        d.insert("numeros divisiveis por 10", 30);
        d.print("numeros pares");
        d.print("numeros quaisquer");
        d.print("numeros divisiveis por 10");

        ArrayList<Integer> l = d.get("numeros divisiveis por 10"); // retorna: [ 10, 20, 30 ]
        
        System.out.println(l);
    }
}
