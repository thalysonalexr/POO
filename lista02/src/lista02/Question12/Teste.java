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
public class Teste {
    
    public static void main(String[] args) {
        
        Contato[] contatos = {
            (new Contato("Thalyson Rodrigues"))
                    .addTelefone(new Telefone("15", "998535410", "67"))
                    .addTelefone(new Telefone("15", "998535411", "67"))
                    .addEmail(new Email("tha.motog", "gmail.com")),
            (new Contato("Luciano de Lima"))
                    .addTelefone(new Telefone("14", "981552233", "65"))
                    .addEmail(new Email("luciano", "gmail.com")),
            (new Contato("Jéssica Torres"))
                    .addTelefone(new Telefone("10", "981668877", "11"))
                    .addEmail(new Email("jessica", "gmail.com"))
        };
        
        Telefone[] telefones = {
            new Telefone("15", "998535410", "67"),
            new Telefone("15", "998553365", "67"),
            new Telefone("14", "999885522", "65"),
            new Telefone("11", "986336655", "81")
        };
        
        Celular meuCelular = new Celular(
            new Telefone("15", "998557788", "67")
        );
        
        meuCelular.novoContato(contatos[0]);
        meuCelular.novoContato(contatos[1]);
        meuCelular.novoContato(contatos[2]);
        
        meuCelular.realizarChamada(telefones[0]);
        meuCelular.realizarChamada(telefones[1]);
        meuCelular.realizarChamada(telefones[2]);
        meuCelular.realizarChamada(telefones[3]);
        
        meuCelular.enviarMesangem(
            new Mensagem(
                meuCelular.consultarContato(
                    "Thalyson Rodrigues").getTelefone("998535410"), "Hello World!")
        );
        
        meuCelular.enviarMesangem(
            new Mensagem(
                telefones[2], "Hello World!")
        );
        
        //System.out.println(meuCelular.consultarContato("Thalyson Rodrigues"));
        System.out.println(meuCelular);
    }
    
}
