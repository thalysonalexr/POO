/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosEstaticos;

/**
 *
 * @author Lab
 */
public class CalculoArea {
    
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
    
    public static double calcularAreaTriIsosceles(double base, double altura) {
        return base * altura / 2;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
}
