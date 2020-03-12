package medical.core.controllers;

import medical.core.config.Data;
import medical.core.models.Medico;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class MedicoController extends Controller<Medico> {

    private MedicoController() {
        super(Data.MEDICOS);
        super.className = "medicos";
    }
    
    public static MedicoController create() {
        return new MedicoController();
    }
}
