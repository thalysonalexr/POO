package medical.controllers;

import java.util.ArrayList;
import medical.config.PathFiles;
import medical.models.Medico;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class MedicoController extends Controller {

    public MedicoController() {
        super(PathFiles.MEDICOS);
        super.className = "Medico";
    }

    @Override
    public void deletar(int id) {
        
        for (Medico e: this.getMedicos()) {
            if (id == e.getId()) {
                this.data.remove(e);
                System.out.println("Medico deletado com sucesso!");
                return;
            }
        }
        
        System.out.println("Nenhum ID encontrado");
    }

    @Override
    public Medico search(int id) {
        for (Medico e: this.getMedicos()) {
            if (id == e.getId()) {
                return e;
            }
        }
        return null;
    }

    /**
     * Converte um ArrayList<Object> de Object para ArrayList<Medico>
     * 
     * @return the ArrayList<Medico>
     */
    public ArrayList<Medico> getMedicos() {
        
        ArrayList<Medico> medicos = new ArrayList<>();
        
        for (Object e: this.data)
            medicos.add((Medico) e);
        
        return medicos;
    }
}
