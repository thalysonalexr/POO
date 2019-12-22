package medical;

import java.util.Scanner;
import medical.controllers.Controller;
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
        
        Controller especialidade = new EspecialidadeController();
        Controller medico = new MedicoController();
        Controller paciente = new PacienteController();
        
        especialidade.restore();
        medico.restore();
        paciente.restore();

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
                case 8:
                    paciente.cadastrar(Factory.createPaciente());
                    break;
                case 9:
                    paciente.listar();
                    break;
                case 10:
                    paciente.listar();
                    paciente.deletar(Application.readId());
                case 0:
                    medico.save();
                    especialidade.save();
                    paciente.save();
                    break;
                default:
                    System.out.println("Opcao incorreta! Tente novamente.");
            }
            
        } while (option != 0);
        
    }
    
    public static int readId() {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("ID: ");
        return Integer.parseInt(reader.nextLine());
    }
}
