/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

/**
 *
 * @author thalyson
 */
public class Corretor extends Funcionario {

    private String registro;

    public Corretor() {
    }

    public Corretor(String registro, String nome, String cargo, String setor) {
        super(nome, cargo, setor);
        this.registro = registro;
        this.setSalario(4500);
        this.setComissao(0.10);
    }

    /**
     * @return the registro
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    
    @Override
    public String toString() {
       return super.toString()
              + "Registro: " + this.registro + "\n";
    }
}
