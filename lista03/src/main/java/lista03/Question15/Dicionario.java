/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question15;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Dicionario {
    
    private ArrayList<Item> itens = new ArrayList<>();

    public Dicionario() {
    }

    public void insert(String key, int value) {
        this.itens.add(new Item(key, value));
    }

    public void print(String key) {
        
        ArrayList<Item> aux = new ArrayList<Item>();
        
        for (Item item: this.itens) {
            if (item.getKey().equals(key)) {
                aux.add(item);
            }
        }
        
        if (aux.isEmpty()) {
            System.out.println("(não existe)");
        }
        
        System.out.println(this.toString(aux));
    }
    
    public String toString(ArrayList<Item> itens) {
        String aux = "";
        
        for (Item item: itens) {
            aux += item.getValue() + ", ";
        }
        
        return aux;
    }
    
    public ArrayList<Integer> get(String key) {
        
        ArrayList<Integer> aux = new ArrayList<Integer>();
        
        for (Item item: this.itens) {
            if (item.getKey().equals(key)) {
                aux.add(item.getValue());
            }
        }

        return aux;
    }
}