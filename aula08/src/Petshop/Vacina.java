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
public class Vacina extends Procedimento {
    
    private String nomeVacina;
    private String validadeVacina;
    private static String PROCEDIMENTO = "Vacina";

    public Vacina() {
    }

    public Vacina(String nomeVacina, String validadeVacina, String nomeFuncionario) {
        super(nomeFuncionario);
        this.nomeVacina = nomeVacina;
        this.validadeVacina = validadeVacina;
    }

    @Override
    public void imprimirDescricaoProcedimento() {
        System.out.println("  * Procedimento: " 
                + Vacina.getPROCEDIMENTO() + "|" 
                + super.getNomeFuncionario() + "|"
                + this.getNomeVacina() + "|"
                + this.getValidadeVacina());
    }

    /**
     * @return the nomeVacina
     */
    public String getNomeVacina() {
        return nomeVacina;
    }

    /**
     * @param nomeVacina the nomeVacina to set
     */
    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    /**
     * @return the validadeVacina
     */
    public String getValidadeVacina() {
        return validadeVacina;
    }

    /**
     * @param validadeVacina the validadeVacina to set
     */
    public void setValidadeVacina(String validadeVacina) {
        this.validadeVacina = validadeVacina;
    }

    /**
     * @return the PROCEDIMENTO
     */
    public static String getPROCEDIMENTO() {
        return PROCEDIMENTO;
    }

    /**
     * @param aPROCEDIMENTO the PROCEDIMENTO to set
     */
    public static void setPROCEDIMENTO(String aPROCEDIMENTO) {
        PROCEDIMENTO = aPROCEDIMENTO;
    }
}
