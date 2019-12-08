/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question14;

/**
 *
 * @author thalyson
 */
public class Hora {
    
    private double horas;
    private double segundos;
    private double minutos;
    private String template;

    public Hora() {
    }

    public Hora(double horas, double minutos, double segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
        this.template = String.format("%02d", (int) horas)
                + "hrs " + String.format("%02d", (int) minutos)
                + "min " + String.format("%02d", (int) segundos)
                + "seg";
    }
    
    @Override
    public String toString() {
        return this.template;
    }

    /**
     * @return the horas
     */
    public double getHoras() {
        return horas;
    }

    /**
     * @return the segundos
     */
    public double getSegundos() {
        return (this.horas * 60 * 60) + (this.minutos * 60) + (this.segundos);
    }

    /**
     * @return the minutos
     */
    public double getMinutos() {
        return (this.horas * 60) + this.minutos;
    }
}
