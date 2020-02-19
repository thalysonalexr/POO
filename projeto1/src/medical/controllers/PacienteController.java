package medical.controllers;

import medical.config.PathFiles;

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
}
