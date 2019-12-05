/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author Lab
 */
public class Portatil extends Recurso {
    
    private boolean isEletronico;
    private String marca;
    public static final String RECURSO = "Portátil";

    public Portatil() {
    }

    public Portatil(boolean isEletronico, String marca, int id, String nome, String setor) {
        super(id, nome, setor);
        this.isEletronico = isEletronico;
        this.marca = marca;
    }

    /**
     * @return the isEletronico
     */
    public boolean isIsEletronico() {
        return isEletronico;
    }

    /**
     * @param isEletronico the isEletronico to set
     */
    public void setIsEletronico(boolean isEletronico) {
        this.isEletronico = isEletronico;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipoRecurso() {
        return Portatil.RECURSO;
    }

    @Override
    public String toString() {
        return " - Eletrônico: " + (this.isEletronico ? "SIM": "NÃO") + "\n"
                + " - Marca: " + this.marca + "\n"
                + " - Id: " + this.getId() + "\n"
                + " - Nome: " + this.getNome() + "\n"
                + " - Setor: " + this.getSetor() + "\n";
    }
}
