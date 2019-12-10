/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question16_17;

/**
 *
 * @author thalyson
 */
public class TesteMenuOpcoes {
    
    public static void main(String[] args) {
        String[] data = new String[]{"Primeira opcao", "Segunda opcao", "Terceira opcao"};
        
        
        MenuOpcoes m = new MenuOpcoes(data);
        
        int op;
        
        do {
            m.imprimir();
            op = m.lerOpcao(); 
            System.out.println("A opção escolhida foi: " + m.lerOpcao());
        } while (op != 0);
    }
    
}
