/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosEstaticos;

import aula07.*;

/**
 *
 * @author Lab
 */
public class TrianguloIsosceles extends FormaGeometrica {
    
    private double base;
    private double altura;
    private double lado;

    public TrianguloIsosceles(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = Math.sqrt(
            Math.pow(base/2, 2) +
            Math.pow(altura/2, 2)
        );
    }

    @Override
    public double calcularArea() {
        return CalculoArea.calcularAreaTriIsosceles(this.base, this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return this.lado + this.base;
    }

    @Override
    public String quemSou() {
        return "Triangulo Isosceles";
    }
}
