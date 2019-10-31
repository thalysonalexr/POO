/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Lab
 */
public class Assunto {
    
    private String nomeDoAssunto;
    
    public Assunto() {}
    
    public Assunto(String nomeAssunto) {
        this.nomeDoAssunto = nomeAssunto;
    }

    /**
     * @return the nomeDoAssunto
     */
    public String getNomeDoAssunto() {
        return nomeDoAssunto;
    }

    /**
     * @param nomeDoAssunto the nomeDoAssunto to set
     */
    public void setNomeDoAssunto(String nomeDoAssunto) {
        this.nomeDoAssunto = nomeDoAssunto;
    }
    
    public String toString() {
        return " - " + this.nomeDoAssunto;
    }
}
