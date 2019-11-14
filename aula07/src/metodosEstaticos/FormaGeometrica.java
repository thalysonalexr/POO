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
abstract public class FormaGeometrica {
    
    abstract public double calcularArea();
    
    abstract public double calcularPerimetro();
    
    public String quemSou() {
        return "FormaGeometrica";
    }
}
