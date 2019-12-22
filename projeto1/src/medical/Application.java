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

    /**
     * @param args the command line arguments
     */
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
                    especialidade.cadastrar(Factory.createEspecialidade());
                    break;
                case 2:
                    especialidade.listar();
                    break;
                case 3:
                    especialidade.listar();
                    especialidade.deletar(Application.readId());
                    break;
                case 4:
                    medico.cadastrar(Factory.createMedico((EspecialidadeController) especialidade));
                    break;
                case 5:
                    medico.listar();
                    break;
                case 6:
                    medico.listar();
                    medico.deletar(Application.readId());
                    break;
                case 7:
                    medico.listar();
                    agendamento.relatorioAtendimentosPorMedico(Application.readId());
                    break;
                case 8:
                    paciente.cadastrar(Factory.createPaciente());
                    break;
                case 9:
                    paciente.listar();
                    break;
                case 10:
                    paciente.listar();
                    paciente.deletar(Application.readId());
                case 11:
                    paciente.listar();
                    agendamento.relatorioConsultasPorPaciente(Application.readId());
                    break;
                case 12:
                    agendamento.cadastrar(Factory.createAgendamento((MedicoController) medico, (PacienteController) paciente));
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
