/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Carro {
    
    private String modelo;
    private int ano;
    private ArrayList<Opcional> opcionais = new ArrayList<>();
    
    public Carro() {}
    
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public Carro addOpcional(Opcional o) {
        this.getOpcionais().add(o);
        return this;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
     * @return the opcionais
     */
    public ArrayList<Opcional> getOpcionais() {
        return opcionais;
    }

    /**
     * @param opcionais the opcionais to set
     */
    public void setOpcionais(ArrayList<Opcional> opcionais) {
        this.opcionais = opcionais;
    }
}
