package lista02.Question12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author visitante
 */
public class Telefone {
    
    private String operadora;
    private String numero;
    private String ddd;

    public Telefone() {
    }

    public Telefone(String operadora, String numero, String DDD) {
        this.operadora = operadora;
        this.numero = numero;
        this.ddd = DDD;
    }

    /**
     * @return the operadora
     */
    public String getOperadora() {
        return operadora;
    }

    /**
     * @param operadora the operadora to set
     */
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    
    @Override
    public String toString() {
        return  this.operadora + " (" + this.ddd + ") " + this.numero + "\n";
    }
}
