/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributosEstaticos;

/**
 *
 * @author Lab
 */
public class TesteCliente {
    
    public static void main(String[] args) {
        
        Cliente[] clientes = {
            new Cliente("Mauro"),
            new Cliente("Beatriz"),
            new Cliente("Thalyson"),
            new Cliente("Abel"),
            new Cliente("Aldo")
        };

        for (Cliente c: clientes)
            System.out.println(c);
    }
}
