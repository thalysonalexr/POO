package medical.controllers;

import java.util.ArrayList;
import medical.config.PathFiles;
import medical.models.Especialidade;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class EspecialidadeController extends Controller {

    public EspecialidadeController() {
        super(PathFiles.ESPECIALIDADE);
        super.className = "Especialidade";
    }

    @Override
    public void deletar(int id) {

        for (Especialidade e: this.getEspecialidades()) {
            if (id == e.getId()) {
                this.data.remove(e);
                System.out.println("Especialidade deletada com sucesso!");
                return;
            }
        }
        
        System.out.println("Nenhum ID encontrado");
    }

    @Override
    public Especialidade search(int id) {
        for (Especialidade e: this.getEspecialidades()) {
            if (id == e.getId()) {
                return e;
            }
        }
        return null;
    }
    
    /**
     * Converte um ArrayList<Object> de Object para ArrayList<Especialidade>
     * 
     * @return the ArrayList<Especialidade>
     */
    public ArrayList<Especialidade> getEspecialidades() {
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        
        for (Object e: this.data)
            especialidades.add((Especialidade) e);
        
        return especialidades;
    }
}
