/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question14_15;

/**
 *
 * @author thalyson
 */
abstract public class Funcionario {
    
    private String nome;
    private String cargo;
    private String setor;
    private double salario;
    private double comissao = 0;

    public Funcionario(String nome, String cargo, String setor) {
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
    }    
    
    
    @Override
    public String toString() {
        return "Funcionario: " + this.getNome() + "\n"
               + "Cargo: " + this.cargo + "\n"
               + "Setor: " + this.setor + "\n"
               + "Salario: " + this.salario + "R$\n"
               + "Comissao: " + (this.comissao * 100) + "%\n";
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the comissao
     */
    public double getComissao() {
        return comissao;
    }

    /**
     * @param comissao the comissao to set
     */
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
