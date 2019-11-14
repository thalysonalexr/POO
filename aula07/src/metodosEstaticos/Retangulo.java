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
public final class Retangulo extends FormaGeometrica {
    
    double largura;
    double altura;

    public Retangulo(double largura, double altura) {
        super();
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return CalculoArea.calcularAreaRetangulo(this.largura, this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return (this.altura * this.largura) * 2;
    }

    @Override
    public String quemSou() {
        return "Retangulo";
    }
}
