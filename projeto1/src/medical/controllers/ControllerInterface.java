/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.controllers;

import java.io.Serializable;

/**
 *
 * @author thalyson
 */
public interface ControllerInterface {
    
    public void cadastrar(Serializable object);
    
    public void listar();
    
    public void deletar(int id);
    
    public Serializable search(int id);
    
    public void save();
    
    public void restore();
    
}
