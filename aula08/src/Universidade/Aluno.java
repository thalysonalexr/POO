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
    
    private String curso;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String curso, String matricula, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.curso = curso;
        this.matricula = matricula;
    }
    
    @Override
    public String toString() {
        return "--- ALUNO ---\n"
                + "Nome: " + super.getNome() + "\n"
                + "CPF: " + super.getCpf() + "\n"
                + "Telefone: " + super.getTelefone() + "\n"
                + "Curso: " + this.curso + "\n"
                + "Matricula: " + this.matricula + "\n";
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
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
