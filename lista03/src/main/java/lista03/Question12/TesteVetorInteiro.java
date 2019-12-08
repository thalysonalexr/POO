/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question12;

/**
 *
 * @author thalyson
 */
public class TesteVetorInteiro {
    
    public static void main(String[] args) {
        
        VetorInteiro vetor = new VetorInteiro();
        
        vetor.add(8);
        vetor.add(4);
        vetor.add(3);
        vetor.add(6);
        vetor.add(9);
        
        System.out.println(vetor.get(0)); // retorna 8
        System.out.println(vetor.get(2, 4)); // retorna [4, 5, 6]
        
        Integer[] array = new Integer[]{1, 2, 3};
        
        vetor.add(new VetorInteiro(array)); // [8, 4, 3, 6, 9, 1, 2, 3]
        
        System.out.println(vetor.reverse()); // retorna VetorInteiro([3, 2, 1, 9, 6, 3, 4, 8])
    }
    
}
