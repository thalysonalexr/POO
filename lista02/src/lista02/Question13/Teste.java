/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02.Question13;

import java.util.ArrayList;

/**
 *
 * @author visitante
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Equipe vendas = new Equipe("Vendedores Master", "Prontos para agir", new Gerente("Thalyson Rodrigues", "Gerente", "Gerencia"));
        
        vendas.addCorretor(new Corretor("12456", "Ana Belle", "Corretor", "Imobiliario"));
        vendas.addCorretor(new Corretor("58544", "Malak", "Corretor", "Imobiliario"));
        vendas.addCorretor(new Corretor("12456", "Jason", "Corretor", "Imobiliario"));
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Funcionario("Maria", "Auxiliar de Servicos Gerais", "Limpesa"));
        funcionarios.add(new Funcionario("Julio", "Secretario", "Administrativo"));
        
        funcionarios.get(0).setSalario(1250.78);
        funcionarios.get(1).setSalario(1890.80);
        
        ArrayList<Imovel> imoveis = new ArrayList<>();
        
        imoveis.add(new Imovel("Rua X", 79000));
        imoveis.add(new Imovel("Rua Y", 120000));
        imoveis.add(new Imovel("Rua Z", 110500));
        imoveis.add(new Imovel("Rua 3", 800500));
        
        ArrayList<SocioProprietario> socios = new ArrayList<>();
        
        socios.add(new SocioProprietario("Thalyson Alexandre", "Socio", "Imobiliario"));
        socios.add(new SocioProprietario("John Alexandre", "Socio", "Imobiliario"));
        
        ArrayList<Transacao> transacoes = new ArrayList<>();
        
        transacoes.add(
            (new Venda()).novaTransacao("25/12/2019", vendas.getCorretores().get(0), socios.get(0), vendas.getLider(), imoveis.get(0))
        );
        
        transacoes.add(
            (new Aluguel(1.600)).novaTransacao("22/10/2020", vendas.getCorretores().get(2), socios.get(1), vendas.getLider(), imoveis.get(1))
        );
        
        System.out.println(transacoes);
    }
    
}
