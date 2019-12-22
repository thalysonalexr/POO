package medical.controllers;

import java.util.ArrayList;
import medical.config.PathFiles;
import medical.models.Paciente;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class PacienteController extends Controller {

    public PacienteController() {
        super(PathFiles.PACIENTES);
        super.className = "Paciente";
    }
    
    @Override
    public Paciente search(int id) {
        for (Paciente e: this.getPacientes()) {
            if (id == e.getId()) {
                return e;
            }
        }
        
        return null;
    }
    
    @Override
    public void deletar(int id) {
        for (Paciente e: this.getPacientes()) {
            if (id == e.getId()) {
                this.data.remove(e);
                System.out.println("Paciente deletado com sucesso!");
                break;
            }
        }
        
        System.out.println("Nenhum ID encontrado");
    }

    /**
     * Converte um ArrayList<Object> de Object para ArrayList<Paciente>
     * 
     * @return the ArrayList<Paciente>
     */
    public ArrayList<Paciente> getPacientes() {
        
        ArrayList<Paciente> pacientes = new ArrayList<>();
        
        for (Object e: this.data)
            pacientes.add((Paciente) e);
        
        return pacientes;
    }
}
