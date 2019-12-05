/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question7_8;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Teste {
    
    public static void main(String[] args) {
        
        ArrayList<Departamento> departamentos = new ArrayList<>();
        
        Departamento eletronicos = new Departamento("Eletronicos", "Departamento de eletronicos");
        Departamento informatica = new Departamento("Informática", "Departamento de informática");
        Departamento calcados = new Departamento("Calçados", "Departamento de calçados");
        
        departamentos.add(eletronicos);
        departamentos.add(informatica);
        departamentos.add(calcados);

        eletronicos.addProduto(new Produto("Monitor 14' LED SAMSUNG", 890.99, eletronicos));
        eletronicos.addProduto(new Produto("TV 55' LCD PANASONIC", 2560.99, eletronicos));
        informatica.addProduto(new Produto("Mouse 1000dpi Corsair", 120.99, informatica));
        informatica.addProduto(new Produto("Teclado Mecanico Razer", 350.99, informatica));
        calcados.addProduto(new Produto("Tênis Nike 50GB", 150.99, calcados));
        calcados.addProduto(new Produto("Tênis New Balance", 260.99, calcados));
        
        Teste.listar(departamentos);
        
        double[] soma = Teste.soma(departamentos);
        
        for (int i = 0; i < soma.length; i++) {
            System.out.println("Total DP" + (i + 1) + ": " + soma[i]);
        }
    }
    
    public static void listar(ArrayList<Departamento> departamentos) {
        
        for (Departamento d: departamentos) {
            System.out.println(d);
        }
    }
    
    // question 08
    public static double[] soma(ArrayList<Departamento> departamentos) {
        
        int i = 0;
        double[] total = new double[departamentos.size()];
        
        for (Departamento d: departamentos) {
            double aux = 0;
            
            for (Produto p: d.getProdutos())
                aux += p.getPreco();
            
            total[i] = aux;
            i++;
        }
        
        return total;
    } 
}
