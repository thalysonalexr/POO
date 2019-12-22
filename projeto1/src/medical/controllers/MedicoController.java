package medical.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import medical.config.PathFiles;
import medical.helpers.FileHandler;
import medical.models.Medico;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class MedicoController extends Controller {
    
    private ArrayList<Medico> medicos = new ArrayList<>();
    
    public MedicoController() {
        this.fileHandler = new FileHandler(this.medicos, PathFiles.MEDICOS);
    }

    @Override
    public void cadastrar(Serializable object) {
        this.medicos.add((Medico) object);
    }

    @Override
    public void listar() {
        if (this.medicos.isEmpty()) {
            System.out.println("Nenhum medico registrado.");
            return;
        }
        
        this.medicos.forEach((e) -> {
            System.out.println(e);
        });
    }
    
    @Override
    public void deletar(int id) {
        for (Medico e: this.medicos) {
            if (id == e.getId()) {
                this.medicos.remove(e);
                System.out.println("Medico deletado com sucesso!");
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
        
        System.out.println("Arquivo de medicos salvo com sucesso!");
    }

    @Override
    public void restore() {
        try {
            this.medicos = this.fileHandler.readFile();
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao restaurar dados de arquivo.");
        }
    }
}
