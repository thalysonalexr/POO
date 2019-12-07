/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14;

/**
 *
 * @author thalyson
 */
public class Cliente extends Pessoa {

    private String cpf;

    public Cliente() {
        super(0, null);
    }

    public Cliente(String cpf, int id, String nome) {
        super(id, nome);
        this.cpf = cpf;
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
    
    @Override
    public String toString() {
        return super.toString() + "CPF: " + this.cpf + "\n";
    }
}
