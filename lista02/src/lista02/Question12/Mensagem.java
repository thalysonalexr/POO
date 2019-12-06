/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question12;

/**
 *
 * @author visitante
 */
public class Mensagem {
    
    private Telefone destinatario;
    private String mensagem;

    public Mensagem() {
    }

    public Mensagem(Telefone destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    /**
     * @return the destinatario
     */
    public Telefone getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(Telefone destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String toString() {
        return "Destinatário: " + this.destinatario + "\n"
                + "Mensagem: " + this.mensagem + "\n";
    }
}
