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
public final class Circulo extends FormaGeometrica {

    private final double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String quemSou() {
        return "Circulo";
    }
}
