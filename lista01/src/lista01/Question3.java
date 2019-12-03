/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class Question3 {
    
    public static void read() {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(scan.nextLine());
        System.out.print("Salário: ");
        double salario = Double.parseDouble(scan.nextLine());
        System.out.print("Sexo: ");
        String sexo = scan.nextLine();
        System.out.print("Estado Civil: ");
        String estado = scan.nextLine();
        
        if (Question3.validateNome(nome))
            System.out.println("Nome: OK");
        else
            System.out.println("Nome incorreto");
        
        if (Question3.validateIdade(idade))
            System.out.println("Idade: OK");
        else
            System.out.println("Idade incorreta");
        
        if (Question3.validateSalario(salario))
            System.out.println("Salário: OK");
        else
            System.out.println("Salário incorreto");
        
        if (Question3.validateSexo(sexo))
            System.out.println("Sexo: OK");
        else
            System.out.println("Sexo incorreto");
        
        if (Question3.validateEstadoCivil(estado))
            System.out.println("Estado Civil: OK");
        else
            System.out.println("Estado civil incorreto");       
    }

    public static boolean validateNome(String nome) {
        return nome.length() > 3;
    }

    public static boolean validateIdade(int idade) {
        return idade >= 0 && idade <= 200;
    }

    public static boolean validateSalario(double salario) {
        return salario > 0;
    }
    
    public static boolean validateSexo(String sexo) {
        return sexo.equals("Masculino") || sexo.equals("Feminino");
    }
    
    public static boolean validateEstadoCivil(String status) {
        String[] allStatus = new String[]{"Solteiro", "Casado", "Viuvo", "Divorciado"};

        List<String> list = Arrays.asList(allStatus);
        
        return list.contains(status);
    }
}
