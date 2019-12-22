package medical.controllers;

import java.io.Serializable;
import medical.helpers.FileHandler;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
abstract public class Controller {
    
    protected FileHandler fileHandler;
    
    abstract public void cadastrar(Serializable object);
    
    abstract public void listar();
    
    abstract public void deletar(int id);
    
    abstract public void save();
    
    abstract public void restore();
}
