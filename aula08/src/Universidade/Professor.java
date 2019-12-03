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

    private String disciplinas;

    public Professor() {
    }

    public Professor(String disciplinas, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.disciplinas = disciplinas;
    }
    
    @Override
    public String toString() {
        return "--- PROFESSOR ---\n"
                + "Nome: " + super.getNome() + "\n"
                + "CPF: " + super.getCpf() + "\n"
                + "Telefone: " + super.getTelefone() + "\n"
                + "Disciplinas: " + this.disciplinas + "\n";
    }

    /**
     * @return the disciplinas
     */
    public String getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }
}
