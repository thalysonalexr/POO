/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question22_23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author visitante
 */
public class TesteProduto {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Departamento> departamentos = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        
        System.out.print("Digite o total de departamentos: ");
        int x = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < x; i++) {
            System.out.print("Departamento " + (i + 1) + ": ");
            String nome = scan.nextLine();
            departamentos.add(new Departamento((i + 1), nome));
        }
        
        System.out.print("Digite o total de produtos: ");
        int y = Integer.parseInt(scan.nextLine());
        
        for (int i = 0; i < y; i++) {
            System.out.print("Produto: ");
            String produto = scan.nextLine();
            
            System.out.print("Preco: ");
            double preco = Double.parseDouble(scan.nextLine());
            
            System.out.println("-- Departamentos --");
            departamentos.forEach((d) -> { System.out.println(d); });
            System.out.print("Escolha: ");
            int idDepartamento = Integer.parseInt(scan.nextLine());
            
            Departamento departamento = null;
            
            for (Departamento d: departamentos) {
                departamento = d.getById(idDepartamento);
                if (departamento instanceof Departamento)
                    break;
            }
            
            produtos.add(new Produto(produto, departamento, preco));
        }
        
        TesteProduto.imprimir(produtos);
    }
    
    public static void imprimir(ArrayList<Produto> produtos) {
        for (Produto p: produtos) {
            System.out.println(p);
        }
    }
}
