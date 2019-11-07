/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteHeranca;

import aula06.*;

/**
 *
 * @author Thalyson Rodrigues
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p = new Pessoa("Marcio", "Av. Brasil",
                "66 91874 5878");
        PessoaJuridica pj = new PessoaJuridica("02.123.321.0001-45",
                "Eletronicos Ltda", "Rodovia Rod", "11 5998 5445");
        PessoaFisica pf = new PessoaFisica("113.555.879-78", "Cristina Vilhalba", "Thalyson Rodrigues", "Av. Wilson Barbosa Martins, 148", "67 99855 3364");
        
        System.out.println(p);
        System.out.println(pj);
        System.out.println(pf);
    }
    
}
