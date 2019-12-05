/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

/**
 *
 * @author Lab
 */
public class Alocacao {
    
    private String dataDevolucaoPrevista;
    private String dataDevolvido;
    private boolean devolvido;
    private Recurso recurso;
    private Funcionario responsavel;

    public Alocacao() {
    }

    public Alocacao(String dataDevolucaoPrevista, String dataDevolvido, boolean devolvido, Recurso recurso, Funcionario responsavel) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolvido = dataDevolvido;
        this.devolvido = devolvido;
        this.recurso = recurso;
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "--- NOVA ALOCAÇÃO DE RECURSO ---\n"
                + "Data de devolução prevista: " + this.dataDevolucaoPrevista + "\n"
                + "Data devolvida: " + this.dataDevolvido + "\n"
                + "Devolvido: " + (this.devolvido ? "SIM": "não") + "\n"
                + "Recurso:\n" + this.recurso + "\n"
                + "Funcionário:\n" + this.responsavel
                + "-----------------------------\n";
    }

    /**
     * @return the dataDevolucaoPrevista
     */
    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    /**
     * @param dataDevolucaoPrevista the dataDevolucaoPrevista to set
     */
    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    /**
     * @return the dataDevolvido
     */
    public String getDataDevolvido() {
        return dataDevolvido;
    }

    /**
     * @param dataDevolvido the dataDevolvido to set
     */
    public void setDataDevolvido(String dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    /**
     * @return the devolvido
     */
    public boolean isDevolvido() {
        return devolvido;
    }

    /**
     * @param devolvido the devolvido to set
     */
    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    /**
     * @return the recurso
     */
    public Recurso getRecurso() {
        return recurso;
    }

    /**
     * @param recurso the recurso to set
     */
    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    /**
     * @return the responsavel
     */
    public Funcionario getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
}
