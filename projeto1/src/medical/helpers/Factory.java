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
        Especialidade e = new Especialidade();
        PreencheObjeto.preencher(e);
        
        return e;
    }
    
    public static Medico createMedico(EspecialidadeController especialidade) {
        
        Medico m = new Medico();
        PreencheObjeto.preencher(m);
        
        Scanner reader = new Scanner(System.in);
        
        if ( ! especialidade.getEspecialidades().isEmpty()) {
            
            String option = "s";
            
            do {
                especialidade.listar();
                System.out.print("Selecione a especialidade pelo ID: ");
                int esp = Integer.parseInt(reader.nextLine());
                
                // verificar se ja contem a especialidade no registro do medico
                boolean exists = false;
                
                for (Especialidade e: m.getEspecialidades()) {
                    if (esp == e.getId())
                        exists = true;
                }
                
                if (exists) {
                    System.out.println("Especialidade ja cadastrada. Tente novamente.");
                    continue;
                }
                    
                
                // registrar a escolha caso exista
                for (Especialidade e: especialidade.getEspecialidades()) {
                    if (esp == e.getId()) {
                        m.adicionarEspecialidade(e);
                        break;
                    }
                }
                
                System.out.print("Continuar? (s)im, (n)ao: ");
                option = reader.nextLine().toLowerCase();
            } while ( ! "n".equals(option));
        }
        
        return m;
    }
    
    public static Paciente createPaciente() {
        Paciente p = new Paciente();
        PreencheObjeto.preencher(p);
        
        return p;
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
            } else {
                break;
            }
        }
        
        Agendamento a = new Agendamento();
        PreencheObjeto.preencher(a);
        
        return a.setMedico(medico).setPaciente(paciente);
    }
}
