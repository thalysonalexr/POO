/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03.Question18;

/**
 *
 * @author visitante
 */
public class TesteCurso {
    
    public static void main(String[] args) {
        
        Curso cInformatica = new Curso();
        
        cInformatica.setNome("Informatica basica")
                .setDescricao("Curso de Windows, word e powerpoint")
                .setHoras(100)
                .setInstrutor("Horácio Ludivico");
        
        System.out.println(cInformatica);
    }
    
}
