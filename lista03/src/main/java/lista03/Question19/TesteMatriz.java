/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question19;

/**
 *
 * @author visitante
 */
public class TesteMatriz {
    
    public static void main(String[] args) throws InvalidDimensionException {
        
        Matriz m1 = new Matriz(new Integer[][]{{1,2},{3,4}});
        Matriz m2 = new Matriz(new Integer[][]{{1,1},{2,2}});
        
        Matriz mSoma = m1.soma(m2);
        Matriz m1Subm2 = m1.subtrai(m2);
        
        System.out.println(mSoma);
        System.out.println();
        System.out.println(m1Subm2);
    }
    
}
