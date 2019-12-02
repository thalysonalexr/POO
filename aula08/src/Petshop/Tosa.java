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
public class Tosa extends Procedimento {
    
    private String tipoTosa;
    private static String PROCEDIMENTO = "Tosa";

    public Tosa() {
    }

    public Tosa(String tipoTosa, String nomeFuncionario) {
        super(nomeFuncionario);
        this.tipoTosa = tipoTosa;
    }

    @Override
    public void imprimirDescricaoProcedimento() {
        System.out.println("Procedimento: " 
                + Tosa.getPROCEDIMENTO() + "|" 
                + super.getNomeFuncionario() + "|"
                + this.getTipoTosa());
    }

    /**
     * @return the tipoTosa
     */
    public String getTipoTosa() {
        return tipoTosa;
    }

    /**
     * @param tipoTosa the tipoTosa to set
     */
    public void setTipoTosa(String tipoTosa) {
        this.tipoTosa = tipoTosa;
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
