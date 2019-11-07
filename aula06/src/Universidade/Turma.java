/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Turma {
    
    private int semestre;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Disciplina disciplina;

    public Turma() {
    }

    public Turma(int semestre, Professor professor, Disciplina disciplina) {
        this.semestre = semestre;
        this.professor = professor;
        this.disciplina = disciplina;
    }
    
    public void matricular(Aluno a) {
        this.alunos.add(a);
    }

    /**
     * @return the semestre
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    /**
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public void imprimirAlunos() {
        System.out.println("--- ALUNOS DA TURMA ---");
        
        for (Aluno a: this.alunos)
            System.out.println(a);
        
        System.out.println("------");
    }
 
    public String toString() {
        
        String alunos = "";
        
        for (Aluno a: this.alunos)
            alunos += a.toString();
        
        return "--- TURMA ---\n" 
                + "Semestre: " + this.semestre + "\n"
                + this.professor.toString()
                + "Disciplina: " + this.disciplina.toString()
                + "--- ALUNOS ---\n" + alunos;
    }
}
