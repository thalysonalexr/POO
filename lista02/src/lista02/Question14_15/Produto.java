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
public class Produto {
    
    private int id;
    private double preco;
    private String descricao;
    private Fornecedor fornecedor;
    private Departamento departamento;

    public Produto() {
    }

    public Produto(int id, double preco, String descricao, Fornecedor fornecedor, Departamento departamento) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.departamento = departamento;
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
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
        /**
     * @return the fornecedor
     */
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    /**
     * @return the departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return " - Id: " + this.id + "\n"
               + " - Preco: " + String.format("%.2f R$", this.preco) + "\n"
               + " - Descricao: " + this.descricao + "\n";
    }
}
