package prova2.question2;

import java.util.ArrayList;
import java.util.Random;

public class Repositorio <T> {
    
    private ArrayList<T> list = new ArrayList<>();
    private Repositorio<T> rep = null;
    
    void add(T n) {
        this.list.add(n);
    }
    
    void printAll() {
        System.out.println();
        this.list.forEach(o -> System.out.println(o));
        System.out.println("----------------------");
    }
    
    void addAll(T[] v) {
        for(T e: v) 
            this.list.add(e);
    }
    
    ArrayList<T> getRandomObjects(int max) {
        // escolho a menor quantidade entre o max e o tamanho do array
        // para evitar que o algoritmo tente escolher uma quantidade maior
        // que a existente no array
        int menor = max > this.list.size() ? this.list.size() : max; 
        Random r = new Random();
        int size = r.nextInt(menor); // escolho a qde de elementos do novo array
        ArrayList<T> randomList = new ArrayList<>();
        int i = 0, next = 0;
        T randomObj;
        do {
            next = r.nextInt(this.list.size());
            randomObj = this.list.get(next);
            // Soh escolho objetos que ainda não foram escolhidos
            if (!randomList.contains(randomObj)) {
                randomList.add(randomObj);
                i++;
            }
        } while (i<size);
        return randomList;
    }
}
