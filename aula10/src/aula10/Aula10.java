/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Lab
 */
public class Aula10 {
    // Template | retorno | parametro
    public static <T> T getFirst(T v[]) {
        if (v.length > 0)
            return v[0];
        return null;
    }
    
    // criar metodo
    // * retorno void
    // * receber um array de alguma coisa
    // * imprimir elemento a elemento do array
    public static <Arr> void imprimir(Arr array[]) {
        for (Arr el: array)
            System.out.println("El: " + el);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vs[] = {"um", "dois", "tres"};
        Integer vi[] = {1, 2, 3};
        
        System.out.println("Primeiro vs: " + getFirst(vs));
        System.out.println("Segundo vi: " + getFirst(vi));
        
        imprimir(vi);
        
        Pilha p = new Pilha();
        
        p.push("Thalyson");
        p.push(1);
        p.push(true);
        p.push(0.90);
        p.push(new Pessoa("Thalyson", 22));
        
        System.out.println(p);
        System.out.println(p.pop());
        System.out.println(p);
        
        Object s;
        
        while ((s = p.pop()) != null) {
            System.out.println(s);
        }
        
        Fila f = new Fila();
        
        f.enqueue(1);
        f.enqueue(0.84);
        f.enqueue("Alberto");
        f.enqueue(new Pessoa("Rodrigues", 12));
        
        while ((s = f.dequeue()) != null) {
            System.out.println(s);
        }
    }
    
}

