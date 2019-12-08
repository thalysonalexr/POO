/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question12;

import java.util.ArrayList;

/**
 *
 * @author thalyson
 */
public class VetorInteiro {
    
    private ArrayList<Integer> vetor = new ArrayList<>();

    public VetorInteiro() {
    }
    
    public VetorInteiro(Integer[] array) {
        for (int i = 0; i < array.length; i++)
            this.vetor.add(array[i]);
    }
    
    public void add(VetorInteiro vetor) {
        this.vetor.addAll(vetor.getVetor());
    }

    public void add(int valor) {
        this.getVetor().add(valor);
    }
    
    public int get(int index) {
        return this.vetor.get(index);
    }
    
    public VetorInteiro get(int i, int j) {
        Integer[] array = new Integer[(j - i) + 1];
        int index2 = 0;
        
        for (int index = i; index <= j; index++) {
            array[index2] = this.vetor.get(index);
            index2++;
        }
        
        return new VetorInteiro(array);
    }
    
    public VetorInteiro reverse() {
        Integer[] array = new Integer[this.vetor.size()];
        int j = 0;
        
        for (int i = (this.vetor.size() - 1); i >= 0; i--) {
            array[j] = this.vetor.get(i);
            j++;
        }
        
        return new VetorInteiro(array);
    }

    /**
     * @return the vetor
     */
    public ArrayList<Integer> getVetor() {
        return vetor;
    }
    
    @Override
    public String toString() {
        return this.vetor.toString();
    }
}
