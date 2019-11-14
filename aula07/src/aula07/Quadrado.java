/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author Lab
 */
public class Quadrado extends FormaGeometrica {
    
    public double lado;

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }

    @Override
    public String quemSou() {
        return "Quadrado";
    }
}
