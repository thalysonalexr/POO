package medical.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import medical.config.PathFiles;
import medical.helpers.FileHandler;
import medical.models.Especialidade;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class EspecialidadeController extends Controller {

    private ArrayList<Especialidade> especialidades = new ArrayList<>();

    public EspecialidadeController() {
        this.fileHandler = new FileHandler(this.getEspecialidades(), PathFiles.ESPECIALIDADE);
    }
    
    @Override
    public void cadastrar(Serializable object) {        
        this.getEspecialidades().add((Especialidade) object);
    }

    @Override
    public void listar() {
        if (this.especialidades.isEmpty()) {
            System.out.println("Nenhuma especialidade registrada.");
            return;
        }
        
        this.especialidades.forEach((e) -> {
            System.out.println(e);
        });
    }
    
    @Override
    public void deletar(int id) {
        for (Especialidade e: this.especialidades) {
            if (id == e.getId()) {
                this.especialidades.remove(e);
                System.out.println("Especialidade deletada com sucesso!");
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
        
        System.out.println("Arquivo de especialidades salvo com sucesso!");
    }

    @Override
    public void restore() {
        try {
            this.especialidades = this.fileHandler.readFile();
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao restaurar dados de arquivo.");
        }
    }

    /**
     * @return the especialidades
     */
    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
}
