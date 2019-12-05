/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question9;

/**
 *
 * @author visitante
 */
public class Hora extends Tempo {
    
    private int hora;
    private int minutos;
    private int segundos;
    public static final String DEFAULT = "HORA NÃO DEFINIDA";

    public Hora() {
        this.template = Hora.DEFAULT;
    }
    
    public Hora(String value) {
        String[] horas = value.split(":");
        
        this.hora = Integer.parseInt(horas[0]);
        this.minutos = Integer.parseInt(horas[1]);
        this.segundos = Integer.parseInt(horas[2]);
        this.template = value + " HRS";
    }

    public Hora(int hora, int minutos, int segundos) {
        super(hora + ":" + minutos + ":" + segundos + " HRS");
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
