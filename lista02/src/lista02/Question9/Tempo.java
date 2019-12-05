/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question9;

/**
 *
 * @author visitante
 */
abstract public class Tempo {
    
    protected String template;

    public Tempo() {
    }

    public Tempo(String template) {
        this.template = template;
    }
    
    @Override
    public String toString() {
        return this.template;
    }
}
