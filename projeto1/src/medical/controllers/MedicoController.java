package medical.controllers;

import medical.config.PathFiles;

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
}
