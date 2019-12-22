package medical.helpers;

import java.util.Scanner;
import medical.controllers.EspecialidadeController;
import medical.controllers.MedicoController;
import medical.controllers.PacienteController;
import medical.models.Agendamento;
import medical.models.Especialidade;
import medical.models.Medico;
import medical.models.Paciente;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public abstract class Factory {
    
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
    
    public static Agendamento createAgendamento(MedicoController medicoControl, PacienteController pacienteControl) {
        
        // verifica se tem ao minimo um medico e paciente registrado
        if (medicoControl.getMedicos().isEmpty() || pacienteControl.getPacientes().isEmpty()) {
            System.out.println("Deve realizar primeiro o cadastro de medicos ou pacientes");
            return null;
        }
        
        Scanner reader = new Scanner(System.in);
        Paciente paciente = null;
        
        while (true) {
            pacienteControl.listar();
            
            System.out.print("Selecione o paciente pelo ID: ");
            int idPaciente = Integer.parseInt(reader.nextLine());
            
            paciente = pacienteControl.search(idPaciente);
            
            if (paciente == null) {
                System.out.println("Paciente nao encontrado. Tente novamente.");
                continue;
            } else {
                break;
            }
        }
        
        Medico medico = null;
        
        while (true) {
            medicoControl.listar();
            
            System.out.print("Selecione o medico pelo ID: ");
            int idMedico = Integer.parseInt(reader.nextLine());
            
            medico = medicoControl.search(idMedico);
            
            if (medico == null) {
                System.out.println("Medico nao encontrado. Tente novamente.");
                continue;
            } else {
                break;
            }
        }
        
        System.out.print("Data: ");
        String data = reader.nextLine();
        System.out.print("Hora: ");
        String hora = reader.nextLine();
        System.out.print("Observacoes: ");
        String observacoes = reader.nextLine();
        
        return new Agendamento(paciente, medico, data, hora, observacoes, true);
    }
}
