package medical.models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import medical.helpers.ScanInterface;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Especialidade implements Serializable, ScanInterface {
    
    private int id;
    private static int nextId = 1;
    private String nome;
    private String descricao;
    
    public Especialidade() {
        this.id = Especialidade.nextId++;
    }
    
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        Especialidade.nextId = this.id + 1;
    }

    public Especialidade(String nome, String descricao) {
        this.id = Especialidade.nextId++;
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

    @Override
    public String[] getAtributos() {
        return new String[]{"nome", "descricao"};
    }

    @Override
    public String[] getTipos() {
        return new String[]{"s", "s"};
    }

    @Override
    public void setValores(ArrayList<Object> valores) {
        this.nome = (String) valores.get(0);
        this.descricao = (String) valores.get(1);
    }
}
