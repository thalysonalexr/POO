/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

/**
 *
 * @author Lab
 */
public class Vacina extends Procedimento {

    @Override
    public void imprimirDescricaoProcedimento() {
        System.out.println(
                "Procedimento: " 
                + Tosa.getPROCEDIMENTO() + "|" 
                + super.getNomeFuncionario() + "|"
                + this.tipoTosa);
    }
}
