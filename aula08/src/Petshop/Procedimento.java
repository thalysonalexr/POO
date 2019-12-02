/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

/**
 *
 * @author Lab
 */
abstract class Procedimento {
    
    private String nomeFuncionario;

    public Procedimento() {
    }

    public Procedimento(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    
    public abstract void imprimirDescricaoProcedimento();

    /**
     * @return the nomeFuncionario
     */
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    /**
     * @param nomeFuncionario the nomeFuncionario to set
     */
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
