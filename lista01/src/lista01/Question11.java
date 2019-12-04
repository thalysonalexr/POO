/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Question11 {

    public Question11() {
    }
    
    public void run() {
        
        Scanner scan = new Scanner(System.in);
        double r = 0;
        
        System.out.println("Operações: +, -, /, *, p");
        
        System.out.print("Valor 1: ");
        double valor1 = Double.parseDouble(scan.nextLine());
        
        System.out.print("Valor 2: ");
        double valor2 = Double.parseDouble(scan.nextLine());
        
        System.out.print("Op: ");
        String op = scan.nextLine();

        switch (op) {
            case "*":
                r = this.multiplicacao(valor1, valor2);
                break;
            case "+":
                r = this.soma(valor1, valor2);
                break;
            case "/":
                r = this.divisao(valor1, valor2);
                break;
            case "-":
                r = this.subtracao(valor1, valor2);
                break;
            case "p":
                r = this.potencia(valor1, valor2);
                break;
            default:
                System.out.println("Erro");
                break;
        }
        
        System.out.println("Resultado: " + r);
    }

    public double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }
    
    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    public double divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }
    
    public double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }
    
    public double potencia(double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
}
