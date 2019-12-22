package medical.helpers;

import java.util.Scanner;
import medical.controllers.EspecialidadeController;
import medical.models.Especialidade;
import medical.models.Medico;
import medical.models.Paciente;

/**
 *
 * @author thalyson
 */
public class Factory {
    
    public static Especialidade createEspecialidade() {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Especialidade: ");
        String nome = reader.nextLine();
        System.out.print("Descricao: ");
        String desc = reader.nextLine();
        
        return new Especialidade(nome, desc);
    }
    
    public static Medico createMedico(EspecialidadeController especialidade) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = reader.nextLine();
        System.out.print("CPF: ");
        String cpf = reader.nextLine();
        System.out.print("CRM: ");
        String crm = reader.nextLine();
        System.out.print("Salario: ");
        double salario = Double.parseDouble(reader.nextLine());
        
        Medico medico = new Medico(nome, cpf, crm, salario);
        
        if ( ! especialidade.getEspecialidades().isEmpty()) {
            
            String option = "s";
            
            do {

                especialidade.listar();
                System.out.print("Selecione a especialidade pelo ID: ");
                int esp = Integer.parseInt(reader.nextLine());
                
                // verificar se ja contem a especialidade no registro do medico
                boolean exists = false;
                
                for (Especialidade e: medico.getEspecialidades()) {
                    if (esp == e.getId())
                        exists = true;
                }
                
                if (exists)
                    continue;
                
                // registrar a escolha caso exista
                for (Especialidade e: especialidade.getEspecialidades()) {
                    if (esp == e.getId()) {
                        medico.adicionarEspecialidade(e);
                        break;
                    }
                }
                
                System.out.print("Continuar? (s)im, (n)ao: ");
                option = reader.nextLine().toLowerCase();
            } while ( ! "n".equals(option));
        }
        
        return medico;
    }
    
    public static Paciente createPaciente() {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Nome: ");
        String nome = reader.nextLine();
        System.out.print("CPF: ");
        String cpf = reader.nextLine();
        System.out.print("Endereco: ");
        String endereco = reader.nextLine();
        System.out.print("Telefone: ");
        String telefone = reader.nextLine();
        System.out.print("Data de nasc: ");
        String dataNasc = reader.nextLine();
        
        return new Paciente(nome, cpf, endereco, telefone, dataNasc);
    }
}
