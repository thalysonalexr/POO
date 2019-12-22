package medical.models;

import java.io.Serializable;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Especialidade implements Serializable {
    
    private int id;
    private static int nextId = 1;
    private String nome;
    private String descricao;

    public Especialidade() {
    }

    public Especialidade(String nome, String descricao) {
        this.id = this.nextId++;
        this.nome = nome;
        this.descricao = descricao;
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
     * @return 
     */
    public Especialidade setNome(String nome) {
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
    public Especialidade setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
    
    @Override
    public String toString() {
        return "\n - ID: " + this.getId() + "\n"
               + " - Esp: " + this.nome + "\n"
               + " - Descricao: " + this.descricao + "\n";
    }
}
