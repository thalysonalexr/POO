package medical.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import medical.helpers.FileHandler;

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
     *
     * @param path
     */
    public Controller(String path) {
        this.fileHandler = new FileHandler(path);
    }
    
    @Override
    public void cadastrar(Serializable object) {
        this.data.add((E) object);
    }
    
    @Override
    public void listar() {
        if (this.data.isEmpty()) {
            System.out.println("Nenhum " + this.className + " registrado.");
            return;
        }
        
        this.data.forEach((e) -> {
            System.out.println(e);
        });
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
}
