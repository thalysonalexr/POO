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
public class Funcionario {
    
    private String cargo;
    private int matricula;
    private String nome;

    public Funcionario() {
    }

    public Funcionario(String cargo, int matricula, String nome) {
        this.cargo = cargo;
        this.matricula = matricula;
        this.nome = nome;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return " - Cargo: " + this.cargo + "\n"
                + " - Matricula: " + this.matricula + "\n"
                + " - Nome: " + this.nome + "\n";
    }
}
