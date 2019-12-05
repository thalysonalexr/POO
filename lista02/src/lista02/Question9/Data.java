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
public class Data extends Tempo {
    
    private int dia;
    private int mes;
    private int ano;
    private String diaSemana;
    public static final String DEFAULT = "DATA NÃO DEFINIDA";

    public Data() {
        this.template = Data.DEFAULT;
    }
    
    public Data(String value, String diaSemana) {
        String[] data = value.split("/");
        
        this.dia = Integer.parseInt(data[0]);
        this.mes = Integer.parseInt(data[1]);
        this.ano = Integer.parseInt(data[2]);
        this.template = (value + " - " + diaSemana);
    }

    public Data(int dia, int mes, int ano, String diaSemana) {
        super(dia + "/" + mes + "/" + ano + " - " + diaSemana);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaSemana = diaSemana;
    }

    /**
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
