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
public class Contato {
    
    private String nome;
    private ArrayList<Telefone> telefones = new ArrayList<>();
    private ArrayList<Email> emails = new ArrayList<>();

    public Contato() {
    }

    public Contato(String nome) {
        this.nome = nome;
    }
    
    public Contato addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
        return this;
    }
    
    public Contato addEmail(Email email) {
        this.emails.add(email);
        return this;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Telefone getTelefone(String telefone) {
        for (Telefone t: this.telefones) {
            if (t.getNumero().equals(telefone)) {
                return t;
            }
        }
        
        return null;
    }

    public String toString() {
        
        String telefones = "";
        String emails = "";
        
        for (Telefone t: this.telefones)
            telefones += t;
        
        for (Email e: this.emails)
            emails += e;
        
        return "-- CONTATO --\n"
                + "Nome: " + this.getNome() + "\n"
                + "Telefone(s):\n"
                + telefones
                + "E-mail(s):\n"
                + emails
                + "\n----------";
    }
}
