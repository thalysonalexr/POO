/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

/**
 *
 * @author thalyson
 */
class Gerente extends Funcionario {

    public Gerente() {
    }
    
    public Gerente(String nome, String cargo, String setor) {
        super(nome, cargo, setor);
        this.setSalario(6500);
        this.setComissao(0.25);
    }
}
