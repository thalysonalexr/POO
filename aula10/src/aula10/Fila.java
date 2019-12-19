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
public class Fila<T> {
    
    private ArrayList<T> dados = new ArrayList<>();

    public Fila() {}
    
    public void enqueue(T valor) {
        this.dados.add(valor);
    }
    
    public T dequeue() {
        if (this.dados.size() > 0)
            return this.dados.remove(0);
        
        return null;
    }
    
    @Override
    public String toString() {
        return this.dados.toString();
    }
}
