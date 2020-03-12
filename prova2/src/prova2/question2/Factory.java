package prova2.question2;

import java.util.ArrayList;
import java.util.Random;

/**
 * Fabrica de Objetos
 */
public class Factory {
    
    public static Departamento createDepartamento() {
        Random r = new Random();
        return new Departamento.Builder()
                .id(r.nextInt(1000))
                .nome("Departamento " + r.nextLong())
                .build();
    }
    
    public static Produto createProduto() {
        Random r = new Random();
        Produto p= new Produto.Builder()
                .estoque(r.nextInt(100))
                .id(r.nextInt(1000))
                .preco(r.nextDouble())
                .nome("Produto " + r.nextLong())
                .build();
        
        RepositorioDepartamento.getInstance()
                .getRandomObjects(5)
                .forEach(d -> p.addDepartamento(d));
        
        return p;                
    }
    
    public static ArrayList<Departamento> createDepartamentos(int n) {
        ArrayList<Departamento> v = new ArrayList<>();
        for (int i=0; i<n; i++)
            v.add( createDepartamento() );
        return v;
    }
    
    public static ArrayList<Produto> createProdutos(int n) {
        ArrayList<Produto> v = new ArrayList<>();
        for (int i=0; i<n; i++)
            v.add( createProduto() );
        return v;
    }
}
