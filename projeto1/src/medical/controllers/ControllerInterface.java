package medical.controllers;

import java.util.ArrayList;
import medical.models.ModelInterface;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public interface ControllerInterface {
    
    public void register(ModelInterface object);
    
    public void list();
    
    public void remove(int id);
    
    public ModelInterface search(int id);
    
    public void save();
    
    public void restore();

    public ArrayList<ModelInterface> getModels();
}
