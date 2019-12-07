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
class Vendedor extends Funcionario {
    
    public Vendedor(String nome, String cargo, String setor) {
        super(nome, cargo, setor);
        this.setComissao(0.10);
        this.setSalario(2500);
    }
    
    public void addComissao(double valor) {
        this.setSalario(this.getSalario() + (valor * this.getComissao()));
    }
}
