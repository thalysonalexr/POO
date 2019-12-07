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
public class Venda extends Transacao {
    
    private static final String TIPO = "VENDA";

    public Venda() {
    }

    @Override
    Venda novaTransacao(String data, Corretor corretor, SocioProprietario socio, Gerente gerente, Imovel imovel) {
        this.data = data;
        this.corretor = corretor;
        this.socio = socio;
        this.gerente = gerente;
        this.imovel = imovel;
        
        double salarioCorretor = this.corretor.getSalario() + (this.imovel.getValor() * this.corretor.getComissao());
        double salarioGerente = this.gerente.getSalario() + (this.imovel.getValor() * this.gerente.getComissao());
        
        this.corretor.setSalario(salarioCorretor);
        this.socio.setSalario(this.imovel.getValor() - ((this.imovel.getValor() * this.corretor.getComissao()) + (this.imovel.getValor() * this.gerente.getComissao())));
        this.gerente.setSalario(salarioGerente);
        
        return this;
    }
    
    @Override
    public String toString() {
        return " -- " + Venda.TIPO + " -- \n"
               + super.toString();
    }
}
