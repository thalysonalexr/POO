/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

/**
 *
 * @author Lab
 */
public class Aula01 {
    
    private int idade;
    
    private String nome;

    public static int soma(int a, int b) {
        return a + b;
    }
    
    public void hello() {
        System.out.println(
                "Hello World " + this.nome.toUpperCase() + " idade > " + this.idade
        );
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        
        // definição de variáveis
        int var = 1;
        var = 100;
        
        String vars = "Hello!";
        
        // tipos primitivos x classes de tipos
        // int, float, double / String, Integer, Float
        
        int valorInteiro = 0;
        // variável de 8 bits
        byte valorByte = 0;
        float valorFloat = 0f;
        // dobro do float
        double valorDouble = 0f;
        // dobro do inteiro
        long valorLong = 0;
        boolean valorBoolean = false;
        String valorString = "Thalyson!";
        
        // operações com inteiros
        
        valorInteiro = 100;
        valorInteiro = 100 * 2;
        valorInteiro = 100 / 2;
        valorInteiro = 100 % 3;
        valorInteiro = 100 + 2;
        valorInteiro = 100 - 2;
        
        // operações de incremento e decremento
        valorInteiro++;
        valorInteiro--;
        ++valorInteiro;
        --valorInteiro;
        
        // Operações bitwise - bit a bit
        valorInteiro = 1024;
        valorInteiro = valorInteiro | 1;
        valorInteiro |= 1;
        valorInteiro = valorInteiro & 1;
        valorInteiro &= 1;
        // shift right
        valorInteiro = valorInteiro >> 2;
        // shift left
        valorInteiro = valorInteiro << 1;
        valorInteiro = valorInteiro ^ 1;
        valorInteiro = ~ 1;
        
        // Operações com Float
        valorFloat = 100 * .999f;
        valorFloat = Math.round(valorFloat);
        
        // Operações com Double
        valorDouble = 5;
        valorDouble = Math.pow(2, 5); // 2 elevado a 5
        valorDouble = Math.min(5, 50);
        valorDouble = Math.max(5, 50);
        valorDouble = Math.sqrt(81);
        valorDouble = Math.round(81.85);
        
        // Operações lógicas
        valorBoolean = true;
        valorBoolean = false;
        valorBoolean = 100 == 10;
        valorBoolean = 100 != 10;
        valorBoolean = 100 > 10;
        valorBoolean = 100 >= 10;
        valorBoolean = 100 < 10;
        valorBoolean = 100 <= 10;
        valorBoolean = (100 >= 10) && (10 < 20);
        valorBoolean = (100 >= 10) || (10 < 20);
        valorBoolean = ! (100 >= 10) && (10 < 20);
        
        // Operações com String
        valorString = "Minha String";
        valorString = valorString + " Texto ";
        valorString = valorString + valorDouble;
        System.out.println(valorString);
        valorString = "Minha String";
        
        System.out.println(valorString);
        System.out.println(valorString.substring(1, 8));
        System.out.println(valorString.equalsIgnoreCase("minha string"));
        
        valorString.toUpperCase();
        valorString.toLowerCase();
        
        System.out.println(valorString.contains("tring"));
        System.out.println(valorString.startsWith("Minha"));
        System.out.println(valorString.endsWith("Minha"));
        System.out.println(valorString.replace("Minha", "Tua"));
        
        valorString = "   MINHA STRING    ";
        System.out.println(valorString);
        
        System.out.println(valorString.trim());
        System.out.println("Tamanho da String: " + valorString.length());
        
        // estruturas de Seleção
        if (valorInteiro > 5) {
            System.out.println("MAIOR QUE 5");
        } else if (valorInteiro < 5) {
            System.out.println("MENOR QUE 5");
        } else {
            System.out.println("IGUAL!");
        }
        
        valorInteiro = 213;
        
        switch (valorInteiro) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Sei la");
                break;
        }
        
        Aula01 aula01 = new Aula01();
        Aula01 aula02 = new Aula01();
        
        aula01.nome = "Thayson";
        aula01.idade = 22;
        
        aula02.nome = "Alexandre";
        aula02.idade = 23;
        
        aula01.hello();
        aula02.hello();
    }
    
    
}
