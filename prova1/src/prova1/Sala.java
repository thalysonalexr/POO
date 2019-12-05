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
public class Sala extends Recurso {
    
    private int lugares;
    private String tipo;
    public static final String RECURSO = "Sala";

    public Sala() {
    }

    public Sala(int lugares, String tipo, int id, String nome, String setor) {
        super(id, nome, setor);
        this.lugares = lugares;
        this.tipo = tipo;
    }

    /**
     * @return the lugares
     */
    public int getLugares() {
        return lugares;
    }

    /**
     * @param lugares the lugares to set
     */
    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getTipoRecurso() {
        return Sala.RECURSO;
    }

    @Override
    public String toString() {
        return " - Lugares: " + this.lugares + "\n"
                + " - Tipo: " + this.tipo + "\n"
                + " - Id: " + this.getId() + "\n"
                + " - Nome: " + this.getNome() + "\n"
                + " - Setor: " + this.getSetor() + "\n";
    }
}
