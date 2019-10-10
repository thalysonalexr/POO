package aula02;

import java.util.Scanner;

public class Aula02 {

    public static void main(String[] args) {
        String s; int i; float f;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        s = reader.nextLine();
        System.out.println("Seu nome eh: " + s);
        
        System.out.println("Digite sua idade: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Sua idade eh: " + i);
        
        System.out.println("Digite o preco: ");
        f = Float.parseFloat(reader.nextLine());
        System.out.println("O preco eh: " + f);
        System.out.printf("Preco: %.2f",f );
    }
}
