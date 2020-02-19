/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.controllers;

import java.util.ArrayList;
import medical.models.ModelInterface;

/**
 *
 * @author thalyson
 */
public interface ControllerInterface {
    
    public void cadastrar(ModelInterface object);
    
    public void listar();
    
    public void deletar(int id);
    
    public ModelInterface search(int id);
    
    public void save();
    
    public void restore();

    public ArrayList<ModelInterface> getModels();
}
