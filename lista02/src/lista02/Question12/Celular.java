/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question12;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Celular {

    private Telefone numero;
    private ArrayList<Telefone> chamadas = new ArrayList<>();
    private ArrayList<Mensagem> mensagens = new ArrayList<>();
    private ArrayList<Contato> contatos = new ArrayList<>();

    public Celular() {
    }

    public Celular(Telefone numero) {
        this.numero = numero;
    }
    
    public void realizarChamada(Telefone numero) {
        this.chamadas.add(numero);
    }
    
    public void enviarMesangem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }
    
    public void novoContato(Contato contato) {
        this.contatos.add(contato);
    }
    
    public Contato consultarContato(String nome) {
        for (Contato c: this.contatos) {
            if (c.getNome().equals(nome)) {
                return c;
            }
        }
        
        return null;
    }

    /**
     * @return the numero
     */
    public Telefone getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Telefone numero) {
        this.numero = numero;
    }
    
    public String toString() {
        String chamadas = "";
        String mensagens = "";
        String contatos = "";
        
        for (Telefone t: this.chamadas)
            chamadas += t;
        
        for (Mensagem m: this.mensagens)
            mensagens += m;
        
        for (Contato c: this.contatos)
            contatos += c;
        
        return "Meu Celular:\n"
                + this.numero
                + "Chamadas:\n"
                + chamadas
                + "Mensagens:\n"
                + mensagens
                + "Contatos:\n"
                + contatos;
                
    }
}
