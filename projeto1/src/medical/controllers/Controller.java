package medical.controllers;

import java.util.ArrayList;
import medical.helpers.FileHandler;
import medical.models.ModelInterface;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @param <E>
 */
public abstract class Controller <E> implements ControllerInterface {
    
    protected FileHandler fileHandler;
    protected String className = null;
    protected ArrayList<E> data = new ArrayList<>();
    
    /**
     * @param path
     */
    public Controller(String path) {
        this.fileHandler = new FileHandler(path);
    }
    
    @Override
    public void register(ModelInterface object) {
        this.data.add((E) object);
    }
    
    @Override
    public void list() {
        if (this.data.isEmpty()) {
            System.out.println("Nenhum " + this.className + " registrado.");
            return;
        }
        
        for (E e: this.data)
            System.out.println(e);
    }
    
    @Override
    public void remove(int id) {

        for (ModelInterface e: this.getModels()) {
            if (id == e.getId()) {
                this.data.remove(e);
                System.out.println("Especialidade deletada com sucesso!");
                return;
            }
        }
        
        System.out.println("Nenhum ID encontrado");
    }

    @Override
    public ModelInterface search(int id) {
        for (ModelInterface e: this.getModels()) {
            if (id == e.getId()) {
                return e;
            }
        }
        return null;
    }
    
    @Override
    public void save() {
        if ( ! this.data.isEmpty()) {
            if ( ! this.fileHandler.writeFile(this.data)) {
                System.out.println("Erro ao escrever no arquivo de " + this.className);
            } else {
                System.out.println("Arquivo " + this.className + " salvo com sucesso!");
            }
        }
    }
    
    @Override
    public void restore() {
        this.data = this.fileHandler.readFile(this.data);
    }
    
    /**
     * Converte um ArrayList<Object> para ArrayList<ModelInterface>
     * 
     * @return the ArrayList<ModelInterface>
     */
    @Override
    public ArrayList<ModelInterface> getModels() {
        
        ArrayList<ModelInterface> models = new ArrayList<>();
        
        for (Object e: this.data)
            models.add((ModelInterface) e);
        
        return models;
    }
}
