/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question16;

import java.util.Scanner;

/**
 *
 * @author thalyson
 */
public class MenuOpcoes {

    private String[] opcoes;
    private int escolha;
    private Scanner scan = new Scanner(System.in);
    
    public MenuOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }
    
    public void imprimir() {
        for (int i =0; i < this.opcoes.length; i++) {
            System.out.println((i + 1) + " - " + this.opcoes[i]);
        }
        
        System.out.println("0 - Sair");
        System.out.print("Digite sua opcao: ");
        this.escolha = Integer.parseInt(this.scan.nextLine());
    }
    
    public int lerOpcao() {
        return this.escolha;
    }
}
