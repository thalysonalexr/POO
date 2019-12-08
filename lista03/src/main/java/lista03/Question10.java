package lista03;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thalyson
 */
public class Question10 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        
        array1.add(1);
        array1.add(2);
        array1.add(3);
        
        array2.add(1);
        array2.add(1);
        array2.add(3);
        
        System.out.println(compareArraysInt(array1, array2));
        
    }
    
    public static boolean compareArraysInt(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        return array1.equals(array2);
    }
}
