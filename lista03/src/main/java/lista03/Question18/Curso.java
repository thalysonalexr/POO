/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question18;

/**
 *
 * @author visitante
 */
public class Curso {
    
    private String nome;
    private String descricao;
    private int horas;
    private String instrutor;

    public Curso() {
    }

    public Curso(String nome, String descricao, int horas, String instrutor) {
        this.nome = nome;
        this.descricao = descricao;
        this.horas = horas;
        this.instrutor = instrutor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     * @return 
     */
    public Curso setNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     * @return 
     */
    public Curso setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     * @return 
     */
    public Curso setHoras(int horas) {
        this.horas = horas;
        return this;
    }

    /**
     * @return the instrutor
     */
    public String getInstrutor() {
        return instrutor;
    }

    /**
     * @param instrutor the instrutor to set
     * @return 
     */
    public Curso setInstrutor(String instrutor) {
        this.instrutor = instrutor;
        return this;
    }
    
    @Override
    public String toString() {
        return "Curso: " + this.nome + "\n"
                + "Descricao: " + this.descricao + "\n"
                + "Horas: " + this.horas + "\n"
                + "Instrutor: " + this.instrutor + "\n";
    }
}
