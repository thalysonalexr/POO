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
public class Tecnico extends Pessoa {
    
    private String setor;

    public Tecnico() {
    }

    public Tecnico(String setor, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.setor = setor;
    }
    
    @Override
    public String toString() {
        return "--- TÉCNICO ---\n"
                + "Nome: " + super.getNome() + "\n"
                + "CPF: " + super.getCpf() + "\n"
                + "Telefone: " + super.getTelefone() + "\n"
                + "Setor: " + this.getSetor() + "\n";
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
