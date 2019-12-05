/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lab
 */
public class Teste {

    public static void main(String[] args) {
        
        Teste.imprimir(Teste.getAlocacoes());
        
    }
    
    
    public static ArrayList<Recurso> getRecursos() {
        
        ArrayList<Recurso> recursos = new ArrayList<>();
        
        // salas
        recursos.add(new Sala(20, "Reunião", 1, "Sala Bulgária", "Prédio 1"));
        recursos.add(new Sala(10, "Reunião", 2, "Sala Argentina", "Prédio 2"));
        recursos.add(new Sala(50, "Vídeo Conferência", 3, "Sala Conferência", "Prédio 1"));
        
        // veiculos
        recursos.add(new Veiculo(2018, 5, "Volks", 4, "Gol 1.6", "Garagem"));
        recursos.add(new Veiculo(2019, 7, "Chevrolet", 5, "Spin", "Garagem"));
        recursos.add(new Veiculo(2019, 5, "Honda", 6, "Civic", "Garagem"));
        
        // portateis
        recursos.add(new Portatil(true, "Asus", 7, "Laptop Asus i7 16GB", "Almoxarifado"));
        recursos.add(new Portatil(true, "Epson", 8, "Projetor Multimídia", "Almoxarifado"));
        recursos.add(new Portatil(false, "Tramontina", 9, "Escada 4 metros", "Almoxarifado"));
        recursos.add(new Portatil(true, "Bosch", 10, "Furadeira 700W", "Almoxarifado"));
        
        return recursos;
    }
    
    public static ArrayList<Funcionario> getFuncionarios() {
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("Desenvolvedor Web", 101, "Thalyson Rodrigues"));
        funcionarios.add(new Funcionario("Professor", 102, "Maikon Bueno"));
        funcionarios.add(new Funcionario("Bibliotecário", 103, "Antonio João da Silva"));
        funcionarios.add(new Funcionario("Enfermeira", 104, "Rochelle das Dores"));
        funcionarios.add(new Funcionario("Analista de Sistemas", 105, "Ana Beatriz Guttemberg"));
        
        return funcionarios;
    }
    
    public static ArrayList<Alocacao> getAlocacoes() {
        
        ArrayList<Alocacao> alocacoes = new ArrayList<>();
        
        Random random = new Random();
        ArrayList<Recurso> recursos = Teste.getRecursos();
        ArrayList<Funcionario> funcionarios = Teste.getFuncionarios();

        for (int i = 0; i < 20; i++) {
            
            alocacoes.add(
                new Alocacao(
                    "27/09/2019",
                    "11/10/2019",
                    true,
                    recursos.get(random.nextInt(recursos.size())),
                    funcionarios.get(random.nextInt(funcionarios.size()))
                )
            );
        }
        
        return alocacoes;
    }
    
    public static void imprimir(ArrayList<Alocacao> alocacoes) {
        
        for (Alocacao a: alocacoes) {
            System.out.println(a);
        } 
    }
}
