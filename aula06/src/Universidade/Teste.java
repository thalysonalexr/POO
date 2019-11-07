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
        Aluno a2 = new Aluno(1235, "554.631.131-78", 20, "Cristina Vilhalba", "67 9 98774411");
        Aluno a3 = new Aluno(1236, "321.181.131-23", 25, "Rayeli Nascimento", "67 9 98557755");
        Aluno a4 = new Aluno(1237, "531.855.131-55", 32, "Maria Lourdes", "67 9 98875574");
        
        Aluno[] alunos = {
            new Aluno(0001, "487.999.777-88", 18, "Rosa", "67 9 98875574"),
            new Aluno(0002, "487.999.777-88", 17, "Holt", "67 9 98875574"),
            new Aluno(0003, "487.999.777-88", 18, "Emme", "67 9 98875574"),
            new Aluno(0004, "487.999.777-88", 15, "Gina", "67 9 98875574"),
            new Aluno(0005, "487.999.777-88", 23, "Peralta", "67 9 98875574")
        };
        
        Professor p = new Professor("Sistemas de Informação", "Mestre", "588.447.487-48", 39, "Maycon", "66 988754887");
        Professor p2 = new Professor("Sistemas de Informação", "Doutor", "355.321.487-32", 39, "Waine", "66 988754887");
        
        Disciplina d = new Disciplina("Programação Orientada a Objetos");
        Disciplina d2 = new Disciplina("Projeto de Software");
        
        Turma t = new Turma(5, p, d);
        Turma t2 = new Turma(5, p2, d2);
        
        t.matricular(a1);
        t.matricular(a2);
        t.matricular(a3);
        t.matricular(a4);
        
        for (Aluno a: alunos)
            t2.matricular(a);
        
        System.out.println(t2);
    }
}
