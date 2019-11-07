/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

/**
 *
 * @author Lab
 */
public class Aluno extends Pessoa {
    
    private int matricula;

    public Aluno() {
        super();
    }

    public Aluno(int matricula) {
        this.matricula = matricula;
    }

    public Aluno(int matricula, String cpf, int idade, String nome, String telefone) {
        super(cpf, idade, nome, telefone);
        this.matricula = matricula;
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
    
    @Override
    public String toString() {
        return " - Matricula: " 
                + this.matricula + "\n" + super.toString() + "\n";
    }
}
