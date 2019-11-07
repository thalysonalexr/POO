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
public class Professor extends Pessoa {
    
    private String curso;
    private String titulacao;

    public Professor() {
        super();
    }

    public Professor(String curso, String titulacao) {
        this.curso = curso;
        this.titulacao = titulacao;
    }

    public Professor(String curso, String titulacao, String cpf, int idade, String nome, String telefone) {
        super(cpf, idade, nome, telefone);
        this.curso = curso;
        this.titulacao = titulacao;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the titulacao
     */
    public String getTitulacao() {
        return titulacao;
    }

    /**
     * @param titulacao the titulacao to set
     */
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    @Override
    public String toString() {
        return "Curso: " 
                + this.curso + "\n"
                + "Titulacao: " + this.titulacao + "\n"
                + super.toString();
    }
}
