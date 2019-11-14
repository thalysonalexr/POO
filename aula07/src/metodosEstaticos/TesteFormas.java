/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosEstaticos;

import aula07.*;
import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class TesteFormas {
    
    public static void imprimir(ArrayList<FormaGeometrica> formas) {
        for (FormaGeometrica f: formas) {
            System.out.println("-- " + f.quemSou() + " --");
            System.out.println("Área: " + f.calcularArea());
            System.out.println("Perímetro: " + f.calcularPerimetro());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // shape
        FormaGeometrica c1 = new Circulo(5.7);
        FormaGeometrica c2 = new Circulo(9.8);

        FormaGeometrica r1 = new Retangulo(6, 4);
        FormaGeometrica r2 = new Retangulo(8, 10);
        
        FormaGeometrica t1 = new TrianguloIsosceles(5, 3, 3);
        FormaGeometrica t2 = new TrianguloIsosceles(5.8, 3.3, 7);
        
        FormaGeometrica q1 = new Quadrado(25);
        FormaGeometrica q2 = new Quadrado(45);

        ArrayList<FormaGeometrica> formas = new ArrayList<>();
        
        formas.add(c1);
        formas.add(c2);
        formas.add(r1);
        formas.add(r2);
        formas.add(t1);
        formas.add(t2);
        formas.add(q1);
        formas.add(q2);
        
        TesteFormas.imprimir(formas);
    }
    
}
