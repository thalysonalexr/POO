/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Cliente {
    
    private ArrayList<Animal> animais = new ArrayList<Animal>();
    private String endereco;
    private String nome;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String endereco, String nome, String telefone) {
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void adicionarAnimal(Animal a) {
        this.getAnimais().add(a);
    }
    
    public Animal buscaAnimal(String nome) {
        for (Animal a: this.animais) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Animal> retornaAnimais() {
        return this.animais;
    }

    /**
     * @return the animais
     */
    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    /**
     * @param animais the animais to set
     */
    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
