package medical.controllers;

import medical.config.PathFiles;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class PacienteController extends Controller {

    public PacienteController() {
        super(PathFiles.PACIENTES);
        super.className = "Paciente";
    }
}
