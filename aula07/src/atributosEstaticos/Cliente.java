/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosEstaticos;

/**
 *
 * @author Lab
 */
public class Cliente {
    
    private int id;
    private static int nextId = 0;
    private String nome;

    public static final String NOMECLASSE = "Cliente";

    public Cliente() {
    }

    public Cliente(String nome) {
        this.id = Cliente.nextId++;
        this.nome = nome;
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
    public void setId(int id) {
        this.id = id;
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
        return "ID: " + this.id + "\nNOME: " + this.nome + "\n";
    }
}
