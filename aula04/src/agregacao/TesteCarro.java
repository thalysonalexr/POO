/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class TesteCarro {
    
    public static void main(String[] args) {

        Opcional[] opcionais = {
            new Opcional("Vidros Elétricos"),
            new Opcional("Teto Solar"),
            new Opcional("Farol de Xenon"),
            new Opcional("Kit Multimidia"),
            new Opcional("Ar Condicionado")
        };

        ArrayList<Carro> carros = new ArrayList<>();

        Carro corcel = new Carro("Corcel", 1980);
        corcel.addOpcional( opcionais[3] );
        corcel.addOpcional( opcionais[0] );
        carros.add(corcel);

        Carro opala = new Carro("Opala", 1982);
        opala.addOpcional( opcionais[1] );
        opala.addOpcional( opcionais[2] );
        opala.addOpcional( opcionais[4] );
        carros.add(opala);

        Carro maverick = new Carro("Maverick", 1987);
        maverick.addOpcional( opcionais[0] );
        maverick.addOpcional( opcionais[3] );
        carros.add(maverick);
        
        Carro comodoro = new Carro("Comodoro", 1987);
        comodoro
                .addOpcional( opcionais[0] )
                .addOpcional( opcionais[1] )
                .addOpcional( opcionais[2] );

        carros.add(comodoro);
        
        Carro chevete = new Carro("Chevete", 1987);
        chevete
                .addOpcional( opcionais[2] )
                .addOpcional( opcionais[3] );

        carros.add(chevete);

        for (Carro c: carros) {
            System.out.println("Carro: " + c.getModelo());
            
            for (Opcional o: c.getOpcionais()) {
                System.out.println("---- Opcionais: " + o.getNomeOpcional());
            }
        }
    }
}
