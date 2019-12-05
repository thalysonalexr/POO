/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question9;

/**
 *
 * @author visitante
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Data d1 = new Data();
        Data d2 = new Data("22/05/1995", "Segunda-feira");
        Data d3 = new Data(24, 2, 1997, "Quarta-feira");
        
        Hora h1 = new Hora();
        Hora h2 = new Hora("13:55:25");
        Hora h3 = new Hora(15, 25, 30);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
    
}
