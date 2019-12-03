/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Petshop;

/**
 *
 * @author Lab
 */
public class Banho extends Procedimento {
    
    private String shampoo;
    private static final String PROCEDIMENTO = "Banho";

    public Banho() {
    }

    public Banho(String shampoo, String nomeFuncionario) {
        super(nomeFuncionario);
        this.shampoo = shampoo;
    }

    @Override
    public void imprimirDescricaoProcedimento() {
        System.out.println("  * Procedimento: " 
                + Banho.getPROCEDIMENTO() + "|" 
                + super.getNomeFuncionario() + "|"
                + this.getShampoo());
    }

    /**
     * @return the shampoo
     */
    public String getShampoo() {
        return shampoo;
    }

    /**
     * @param shampoo the shampoo to set
     */
    public void setShampoo(String shampoo) {
        this.shampoo = shampoo;
    }

    /**
     * @return the PROCEDIMENTO
     */
    public static String getPROCEDIMENTO() {
        return PROCEDIMENTO;
    }
}
