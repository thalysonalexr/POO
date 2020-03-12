package prova2.question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu<T> {

    private ICmdMenu<T> cmd;
    
    public Menu(ICmdMenu<T> cmd) {
        this.cmd = cmd;
    }
    
    private void imprimirOpcoes() {
        System.out.println("\n\n");
        // getNomeCadastro() retorna uma String, por exemplo: Produtos / Eletronicos /etc
        System.out.println("Cadastro de " + this.cmd.getNomeCadastro() );
        System.out.println("1 - Listar todos");
        System.out.println("2 - Remover registro");
        System.out.println("3 - Criar novo");
        System.out.println("0 - Sair");
    }
    
    private int lerOpcao(int max) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.print("Digite a opcao desejada [0 a " + max +"] : ");
            opcao = Integer.parseInt(scan.nextLine());
            if (opcao > max)
                System.out.print("Opcao inválida: " + opcao);
        } while (opcao > max || opcao <0);
        System.out.println();
        return opcao;
    }
    
    private void listar() {
        ArrayList<T> lista = this.cmd.getListaElementos();
        if (lista.isEmpty())
            System.out.println("Voce nao tem itens cadastrados.");
        String f;
        for (int i=0; i<lista.size(); i++) {
            f = "[%04d] " + lista.get(i);
            System.out.println(String.format(f, i));
        }
    }
    
    private void remover() {
        int count = this.cmd.getQuantidadeElementos(); 
        if (count==0) {
            System.out.println("Não existem itens a serem removidos.");
            return;
        }
        System.out.println("\nRemovendo um elemento...");
        listar();
        int opcao = lerOpcao(count - 1);
        this.cmd.remover(opcao);
        System.out.println("Item removido.");
    }
    
    private void criar() {
        this.cmd.criarElementoAleatorio();
        System.out.println("Item criado.");
    }
    
    public void executar() {
        int op;
        do {
            imprimirOpcoes();
            op = lerOpcao(3);
            switch(op) {
                case 1: 
                    listar(); 
                    break;
                case 2:
                    remover();
                    break;
                case 3:
                    criar();
                    break;                    
                default:
                    break;
            }
        } while(op != 0);
        System.out.println("Saindo.");
    }
    
}
