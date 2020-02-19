package medical;

import java.util.Scanner;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class Operations {
    
    public static int read() {
        
        Scanner reader = new Scanner(System.in);

        int option = -1;

        try {
            System.out.print(menu());
            option = Integer.parseInt(reader.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Digite um numero inteiro!");
        }
        
        return option;
    }

    private static String menu() {
        
        return "---------------------------------\n"
               + "01 - Cadastrar nova especialidade\n"
               + "02 - Listar especialidades\n"
               + "03 - Deletar especialidade\n"
               + "04 - Cadastrar novo medico\n"
               + "05 - Listar medicos\n"
               + "06 - Deletar medico\n"
               + "07 - Relatorio de atendimentos por medico\n"
               + "08 - Cadastrar novo paciente\n"
               + "09 - Listar pacientes\n"
               + "10 - Deletar paciente\n"
               + "11 - Relatorio de consultas por paciente\n"
               + "12 - Cadastrar novo agendamento de consulta\n"
               + " 0 - Sair do Sistema\n>> ";
    }
}
