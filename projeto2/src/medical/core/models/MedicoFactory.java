package medical.core.models;

import java.util.ArrayList;

import medical.core.helpers.PreencheObjeto;

/**
 * design pattern: composition and simple factory
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class MedicoFactory {
    
    ArrayList<Medico> medicos = new ArrayList<>();
    
    public void create() {
        Medico medico = new Medico();
        PreencheObjeto.preencher(medico);
        this.medicos.add(medico);
    }
    
    public ArrayList<Medico> data() {
        return this.medicos;
    }
    
    public ArrayList<ModelInterface> dataModel() {
        ArrayList<ModelInterface> models = new ArrayList<>();
        
        for (Object e: this.medicos)
            models.add((ModelInterface) e);
        
        return models;
    }
}
