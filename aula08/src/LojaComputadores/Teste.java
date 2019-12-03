/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaComputadores;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Teste {
    
    public static void main(String[] args) {

        ArrayList<Peca> pecas = new ArrayList<Peca>();

        pecas.add(new Peca("Intel", "Processador Intel I7", 1050.68));
        pecas.add(new Peca("Intel", "Processador Intel I5", 799.80));
        pecas.add(new Peca("Asus", "Placa Mãe Asus", 560.90));
        pecas.add(new Peca("Sandisk", "Memória 16GB DDR4 Sandisk", 230.99));
        pecas.add(new Peca("Galax", "Placa de Vídeo GTX960", 980.80));
        pecas.add(new Peca("Western Digital", "HD Western Digital 250GB", 360.99));
        pecas.add(new Peca("Sandisk", "SSD Plus SanDisk 250GB", 580.99));
        pecas.add(new Peca("Corsair", "Memória DDR4 8GB Corsair", 190.99));
        pecas.add(new Peca("Corsair", "Fonte ATX 1020 Corsair", 500.87));

        ArrayList<Computador> computadores = new ArrayList<Computador>();
        
        computadores.add(new Computador("Thalyson Rodrigues", "PC Gamer"));
        computadores.add(new Computador("Aldo Riboli", "PC Escritório"));
        computadores.add(new Computador("Rayli Nascimento", "PC Biblioteca"));
        computadores.add(new Computador("Maria Lourdes", "PC Laboratório"));

        // pc1
        computadores.get(0).addItem(new ComputadorItem(pecas.get(0), 3));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(1), 2));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(2), 6));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(3), 5));
        
        // pc2
        computadores.get(0).addItem(new ComputadorItem(pecas.get(4), 4));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(3), 1));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(2), 3));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(1), 6));
        
        // pc3
        computadores.get(0).addItem(new ComputadorItem(pecas.get(2), 1));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(4), 4));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(3), 3));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(6), 3));
        
        // pc4
        computadores.get(0).addItem(new ComputadorItem(pecas.get(0), 2));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(0), 2));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(0), 2));
        computadores.get(0).addItem(new ComputadorItem(pecas.get(0), 2));

        Teste.listarCompras(computadores);
    }
    
    public static void listarCompras(ArrayList<Computador> computadores) {
        
        for (Computador c: computadores) {
            System.out.println("***** NOVA ENCOMENDA *****");
            System.out.println(c);
            System.out.println("***** -------------- *****");
        }
    }
}
