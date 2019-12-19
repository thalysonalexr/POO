/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.ArrayList;

/**
 *
 * @author Lab
 * @param <T>
 */
public class Pilha<T> {
    
    private ArrayList<T> dados = new ArrayList<>();

    public Pilha() {}
    
    public void push(T valor) {
        this.dados.add(valor);
    }
    
    public T pop() {
        int i = this.dados.size() - 1;
        
        if (i >= 0)
            return this.dados.remove(i);
        return null;
    }
    
    @Override
    public String toString() {
        return this.dados.toString();
    }
}
