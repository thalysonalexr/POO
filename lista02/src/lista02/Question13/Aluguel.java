/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

/**
 *
 * @author visitante
 */
public class Aluguel extends Transacao {
    
    private double valor;
    private static String TIPO = "ALUGUEL";

    public Aluguel(double valor) {
        this.valor = valor;
    }
    
    @Override
    Aluguel novaTransacao(String data, Corretor corretor, SocioProprietario socio, Gerente gerente, Imovel imovel) {
        this.data = data;
        this.corretor = corretor;
        this.socio = socio;
        this.gerente = gerente;
        this.imovel = imovel;
        
        double salarioCorretor = this.corretor.getSalario() + (this.valor * this.corretor.getComissao());
        double salarioGerente = this.gerente.getSalario() + (this.valor * this.gerente.getComissao());
        
        this.corretor.setSalario(salarioCorretor);
        this.socio.setSalario(this.imovel.getValor() - ((this.valor * this.corretor.getComissao()) + (this.valor * this.gerente.getComissao())));
        this.gerente.setSalario(salarioGerente);
        
        return this;
    }
    
    @Override
    public String toString() {
        return " --- " + Aluguel.TIPO + " --- \n"
               + super.toString();
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
}
