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
        this.fileHandler = new FileHandler(this.data, path);
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
        if ( ! this.fileHandler.writeInFile()) {
            System.out.println("Erro ao escrever no arquivo de " + this.className);
        }
        
        System.out.println("Arquivo " + this.className + " salvo com sucesso!");
    }
    
    @Override
    public void restore() {
        try {
            this.data = this.fileHandler.readFile();
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao restaurar dados do arquivo " + this.className);
        }
    }
}
