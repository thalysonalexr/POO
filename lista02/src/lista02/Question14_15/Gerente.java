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
public class Gerente extends Funcionario {
    
    public Gerente(String nome, String cargo, String setor) {
        super(nome, cargo, setor);
        this.setComissao(0.25);
        this.setSalario(4500);
    }

}
