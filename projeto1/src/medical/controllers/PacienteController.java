package medical.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import medical.config.PathFiles;
import medical.helpers.FileHandler;
import medical.models.Paciente;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class PacienteController extends Controller {
    
    private ArrayList<Paciente> pacientes = new ArrayList<>();
    
    public PacienteController() {
        this.fileHandler = new FileHandler(this.pacientes, PathFiles.PACIENTES);
    }

    @Override
    public void cadastrar(Serializable object) {
        this.pacientes.add((Paciente) object);
    }

    @Override
    public void listar() {
        if (this.pacientes.isEmpty()) {
            System.out.println("Nenhum paciente registrado.");
            return;
        }
        
        this.pacientes.forEach((e) -> {
            System.out.println(e);
        });
    }
    
    @Override
    public void deletar(int id) {
        for (Paciente e: this.pacientes) {
            if (id == e.getId()) {
                this.pacientes.remove(e);
                System.out.println("Paciente deletado com sucesso!");
                break;
            }
        }
        
        System.out.println("Nenhum ID encontrado");
    }

    @Override
    public void save() {
        if ( ! this.fileHandler.writeInFile()) {
            System.out.println("Erro ao escrever no arquivo.");
        }
        
        System.out.println("Arquivo de pacientes salvo com sucesso!");
    }

    @Override
    public void restore() {
        try {
            this.pacientes = this.fileHandler.readFile();
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao restaurar dados de arquivo.");
        }
    }
    
}
