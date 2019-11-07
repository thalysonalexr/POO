/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universidade;

/**
 *
 * @author Lab
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno(1234, "048.181.131-00", 22, "Thalyson Rodrigues", "67 9 98535410");
        Aluno a2 = new Aluno(1235, "554.631.131-78", 22, "Cristina Vilhalba", "67 9 98774411");
        Aluno a3 = new Aluno(1236, "321.181.131-23", 22, "Rayeli Nascimento", "67 9 98557755");
        Aluno a4 = new Aluno(1237, "531.855.131-55", 22, "Maria Lourdes", "67 9 98875574");
        
        Professor p = new Professor("Sistemas de Informação", "Mestre", "588.447.487-48", 39, "Maycon", "66 988754887");
        
        Disciplina d = new Disciplina("Programação Orientada a Objetos");
        
        Turma t = new Turma(5, p, d);
        
        t.addAluno(a1);
        t.addAluno(a2);
        t.addAluno(a3);
        t.addAluno(a4);
        
        System.out.println(t);
    }
}
