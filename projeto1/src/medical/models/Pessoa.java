package medical.models;

import java.io.Serializable;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public abstract class Pessoa implements Serializable, ModelInterface {
    
    protected String nome;
    protected String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getFormatData() {
        return "Nome: " + this.nome + "\n"
            + "CPF: " + this.cpf + "\n";
    }
    
    @Override
    abstract public String toString();
}
