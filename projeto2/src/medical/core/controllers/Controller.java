package medical.core.controllers;

import java.util.ArrayList;
import java.util.Collection;

import medical.helpers.FileBinaryHandler;
import medical.helpers.FileHandlerInterface;
import medical.core.models.ModelInterface;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public abstract class Controller <E> implements ControllerInterface {
    
    private final FileHandlerInterface fileHandler;
    protected String className = null;
    protected ArrayList<E> data = new ArrayList<>();
    
    /**
     * @param path
     */
    public Controller(final String path) {
        this.fileHandler = FileBinaryHandler.instance(path);
    }
    
    @Override
    public void register(final ArrayList<ModelInterface> data) {
        if (this.data.isEmpty()) {
            this.data = (ArrayList<E>) data;
        } else {
            this.data.addAll((Collection<? extends E>) data);
        }
    }
    
    @Override
    public ArrayList<ModelInterface> findById(final int id) {
        for (final ModelInterface e: this.getModels()) {
            if (id == e.getId()) {
                final ArrayList<ModelInterface> data = new ArrayList<ModelInterface>();
                data.add(e);
                return data;
            }
        }
        return null;
    }
    
    @Override
    public boolean remove(final int id) {
        for (final ModelInterface e: this.getModels()) {
            if (id == e.getId()) {
                this.data.remove(e);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public ArrayList<ModelInterface> listAll() {
        if (this.data.isEmpty()) {
            return null;
        }
        return this.getModels();
    }
    
    @Override
    public String getName() {
        return this.className;
    }
    
    @Override
    public void save() {
        if ( ! this.fileHandler.writeFile(this.data)) {
            System.out.println("[controller:" + this.className + "] error write file." + this.className);
        } else {
            System.out.println("[controller:" + this.className + "] file " + this.className + " success saved.");
        }
    }
    
    @Override
    public void restore() {
        this.data = this.fileHandler.readFile();
    }
    
    /**
     * Converte um ArrayList<Object> para ArrayList<ModelInterface>
     * @return the ArrayList<ModelInterface>
     */
    @Override
    public ArrayList<ModelInterface> getModels() {
        
        final ArrayList<ModelInterface> models = new ArrayList<>();
        
        for (final Object e: this.data)
            models.add((ModelInterface) e);
        
        return models;
    }
}
