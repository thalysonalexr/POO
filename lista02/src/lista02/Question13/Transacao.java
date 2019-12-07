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
abstract public class Transacao {
    
    protected String data;
    protected Corretor corretor;
    protected SocioProprietario socio;
    protected Gerente gerente;
    protected Imovel imovel;
    
    abstract Transacao novaTransacao(String data, Corretor corretor, SocioProprietario socio, Gerente gerente, Imovel imovel);
    
    @Override
    public String toString() {
        return "Data: " + this.data + "\n\n"
               + "Corretor: " + this.corretor + "\n"
               + "Socio: " + this.socio + "\n"
               + "Gerente: " + this.gerente + "\n"
               + "Imovel: " + this.imovel + "\n";
    }
}
