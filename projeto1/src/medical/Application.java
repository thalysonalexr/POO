package medical;

import java.util.Scanner;
import medical.controllers.AgendamentoController;
import medical.controllers.ControllerInterface;
import medical.controllers.EspecialidadeController;
import medical.controllers.MedicoController;
import medical.controllers.PacienteController;
import medical.helpers.Factory;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Application {

    public static void main(String[] args) {
        
        // instanciar controllers da aplicacao
        ControllerInterface esp = new EspecialidadeController();
        ControllerInterface med = new MedicoController();
        ControllerInterface pac = new PacienteController();
        
        AgendamentoController age = new AgendamentoController();
        
        // restaurar dados de arquivos para objetos
        esp.restore();
        med.restore();
        pac.restore();
        age.restore();
        
        Application.run(esp, med, pac, age);
    }
    
    private static int readId() {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("ID: ");
        return Integer.parseInt(reader.nextLine());
    }
    
    private static void run(
        ControllerInterface especialidade,
        ControllerInterface medico,
        ControllerInterface paciente,
        AgendamentoController agendamento
    ) {
        
        int option = -1;
        
        do {
            option = Operations.read();
            
            switch (option) {
                case 1:
                    especialidade.register(Factory.createEspecialidade());
                    break;
                case 2:
                    especialidade.list();
                    break;
                case 3:
                    especialidade.list();
                    especialidade.remove(Application.readId());
                    break;
                case 4:
                    medico.register(Factory.createMedico((EspecialidadeController) especialidade));
                    break;
                case 5:
                    medico.list();
                    break;
                case 6:
                    medico.list();
                    medico.remove(Application.readId());
                    break;
                case 7:
                    medico.list();
                    agendamento.relatorioAtendimentosPorMedico(Application.readId());
                    break;
                case 8:
                    paciente.register(Factory.createPaciente());
                    break;
                case 9:
                    paciente.list();
                    break;
                case 10:
                    paciente.list();
                    paciente.remove(Application.readId());
                case 11:
                    paciente.list();
                    agendamento.relatorioConsultasPorPaciente(Application.readId());
                    break;
                case 12:
                    agendamento.register(Factory.createAgendamento((MedicoController) medico, (PacienteController) paciente));
                    break;
                case 0:
                    medico.save();
                    especialidade.save();
                    paciente.save();
                    agendamento.save();
                    break;
                default:
                    System.out.println("Opcao incorreta! Tente novamente.");
            }
            
        } while (option != 0);
    }
}
