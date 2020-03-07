package medical.core.controllers;

import java.util.ArrayList;
import medical.core.models.ModelInterface;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public interface ControllerInterface {

    public void register(ArrayList<ModelInterface> data);
    
    public ArrayList<ModelInterface> findById(int id);
    
    public boolean remove(int id);
    
    public ArrayList<ModelInterface> listAll();
    
    public String getName();
    
    public void save();
    
    public void restore();

    public ArrayList<ModelInterface> getModels();
}
