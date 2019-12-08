/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question13;

/**
 *
 * @author thalyson
 */
public class TesteCliente {
    
    public static void main(String[] args) {
        
        Cliente c1 = Cliente.newCliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente(1, "Thalyson Rodrigues");
        Cliente c4 = new Cliente(1, "Alexandre Sousa", "Av. Wilson", "67 99998855");
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
    
}
