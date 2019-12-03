/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class Teste {
    
    public static void main(String[] args) {
        
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        pessoas.add(new Aluno("Sistemas de Informação", "201521640026", "Thalyson Rodrigues", "04818011122", "67 9 99898855"));
        pessoas.add(new Professor("Programação Orientada a Objetos", "Maikon", "00052863988", "66 9 88998788"));
        pessoas.add(new Tecnico("ICEN", "Magda", "88585478966", "66 9 99665588"));
        
        for (Pessoa p: pessoas) {
            System.out.println(p);
        }
    }
    
}
