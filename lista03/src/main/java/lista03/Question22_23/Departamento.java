/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question22_23;

/**
 *
 * @author visitante
 */
class Departamento {
    
    private int id;
    private String nome;

    public Departamento() {
    }

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
    public Departamento setNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public Departamento setId(int id) {
        this.id = id;
        return this;
    }
    
    public Departamento getById(int id) {
        return this.id == id ? this: null;
    }
    
    @Override
    public String toString() {
        return this.id + " - " + this.nome + "\n";
    }
}
