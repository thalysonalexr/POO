/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Teste {

    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        // cliente 1
        clientes.add(new Cliente("Rua Mato Grosso, 15, Rondonopolis", "João Silva", "66 98744-5474"));
        clientes.get(0).adicionarAnimal(new Animal("Rex", "Pastor alemão", "Cachorro"));
        clientes.get(0)
                .buscaAnimal("Rex")
                .adicionaProcedimento(new Vacina("Anti Rábica", "12/08/2017", "Fátima"));
        clientes.get(0)
                .buscaAnimal("Rex")
                .adicionaProcedimento(new Banho("Anti Rugas", "Rodrigo"));
        clientes.get(0)
                .buscaAnimal("Rex")
                .adicionaProcedimento(new Banho("Anti Carrapatos", "Rodrigo"));
        clientes.get(0)
                .buscaAnimal("Rex")
                .adicionaProcedimento(new Tosa("Geral", "Marcela"));
        
        clientes.get(0).adicionarAnimal(new Animal("Bidu", "Schnauzer", "Cachorro"));
        clientes.get(0)
                .buscaAnimal("Bidu")
                .adicionaProcedimento(new Vacina("Anti Carrapatos", "08/12/2018", "Fátima"));
        
        // cliente 2
        clientes.add(new Cliente("Av. Brasil, 400 – Rondonopolis", "Mariana Ferraz", "66 3235-9879"));
        clientes.get(1).adicionarAnimal(new Animal("Pingo", "Persa", "Gato"));
        clientes.get(1)
                .buscaAnimal("Pingo")
                .adicionaProcedimento(new Banho("Anti Pulgas", "Rodrigo"));
        
        clientes.get(1).adicionarAnimal(new Animal("Tigo", "Shitzu", "Cachorro"));
        clientes.get(1)
                .buscaAnimal("Tigo")
                .adicionaProcedimento(new Tosa("HigiênciaPersa", "Marcela"));
        
        clientes.get(1)
                .buscaAnimal("Tigo")
                .adicionaProcedimento(new Vacina("Anti Rábica", "01/01/2018", "Fátima"));
        
        // cliente 3
        clientes.add(new Cliente("Rua Dom Pedro, 2344 – Rondonópolis", "Gabriela Brito", "66 3235-9879"));
        clientes.get(2).adicionarAnimal(new Animal("Binga", "Poodle", "Cachorra"));
        clientes.get(2)
                .buscaAnimal("Binga")
                .adicionaProcedimento(new Banho("Anti Pulgas", "Rodrigo"));
        clientes.get(2)
                .buscaAnimal("Binga")
                .adicionaProcedimento(new Vacina("Anti Rábica", "12/08/2017", "Fátima"));
        clientes.get(2)
                .buscaAnimal("Binga")
                .adicionaProcedimento(new Tosa("Geral", "Marcela"));
        
        Teste.imprimir(clientes);
    }
    
    public static void imprimir(ArrayList<Cliente> clientes) {
        for (Cliente c: clientes) {
            System.out.println("* Cliente: " + c.getNome() + "|" + c.getEndereco() + "|" + c.getTelefone());
            for (Animal a: c.getAnimais()) {
                System.out.println(" - Animal: " + a.getNome() + "|" + a.getRaca() + "|" + a.getTipo());
                for (Procedimento p: a.getProcedimentos()) {
                    p.imprimirDescricaoProcedimento();
                }
            }
        }
    }
}
