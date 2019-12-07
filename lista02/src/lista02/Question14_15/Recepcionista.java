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
public class Recepcionista extends Funcionario {
    
    public Recepcionista(String nome, String cargo, String setor) {
        super(nome, cargo, setor);
        this.setSalario(1800);
    }
    
}
