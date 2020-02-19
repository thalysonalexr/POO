package medical.controllers;

import medical.config.PathFiles;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class MedicoController extends Controller {

    public MedicoController() {
        super(PathFiles.MEDICOS);
        super.className = "Medico";
    }
}
