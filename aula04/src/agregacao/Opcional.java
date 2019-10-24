/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacao;

/**
 *
 * @author Lab
 */
class Opcional {
    private String nomeOpcional;
    
    public Opcional() {}
    
    public Opcional(String nomeOpcional) {
        this.nomeOpcional = nomeOpcional;
    }

    /**
     * @return the nomeOpcional
     */
    public String getNomeOpcional() {
        return nomeOpcional;
    }

    /**
     * @param nomeOpcional the nomeOpcional to set
     */
    public void setNomeOpcional(String nomeOpcional) {
        this.nomeOpcional = nomeOpcional;
    }
}
