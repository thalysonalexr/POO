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
public class Veiculo extends Recurso {
    
    private int ano;
    private int lugares;
    private String marca;
    public static final String RECURSO = "Veículo";

    public Veiculo() {
    }

    public Veiculo(int ano, int lugares, String marca, int id, String nome, String setor) {
        super(id, nome, setor);
        this.ano = ano;
        this.lugares = lugares;
        this.marca = marca;
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
        return Veiculo.RECURSO;
    }

    @Override
    public String toString() {
        return "Recurso:\n*" + Veiculo.RECURSO + "*\n"
                + " - Ano: " + this.ano + "\n"
                + " - Lugares: " + this.lugares + "\n"
                + " - Marca: " + this.marca + "\n"
                + " - Id: " + this.getId() + "\n"
                + " - Nome: " + this.getNome() + "\n"
                + " - Setor: " + this.getSetor() + "\n";
    }
}
