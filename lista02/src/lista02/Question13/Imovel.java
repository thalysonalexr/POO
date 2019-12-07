/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

/**
 *
 * @author visitante
 */
public class Imovel {
    
    private String endereco;
    private double valor;

    public Imovel() {
    }

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
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
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String toString() {
        return "Endereco: " + this.endereco +  "\n"
               + "Valor: " + this.valor + "\n";
    }
}
