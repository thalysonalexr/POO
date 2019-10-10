package classes;

import java.util.Scanner;

public class TesteProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("Computador", "Informatica", 10, 4000.00f);

        System.out.println(p1);

        Produto vp[] = new Produto[4];

        vp[0] = new Produto();
        vp[0].setNome("Computador");
        vp[0].setDepartamento("Informatica");
        vp[0].setEstoque(10);
        vp[0].setPreco(4000.00f);

        // objeto para leitura de dados do console
        Scanner scan = new Scanner(System.in);
        String nome, departamento;
        int estoque;
        float preco;

        System.out.print("Quantos produtos deseja cadastrar? ");
        int total = Integer.parseInt(scan.nextLine());

        System.out.println(total);

        Produto produtos[] = new Produto[total];

        for (int i = 0; i < total; i++) {
            System.out.println("Cadastro do produto (" + (i + 1) + ")");
            System.out.print("Nome do produto: ");
            nome = scan.nextLine();
            System.out.print("Nome do departamento: ");
            departamento = scan.nextLine();
            System.out.print("Digite o total do estoque: ");
            estoque = Integer.parseInt(scan.nextLine());
            System.out.print("Digite o preço: ");
            preco = Float.parseFloat(scan.nextLine());

            produtos[i] = new Produto(nome, departamento, estoque, preco);
            System.out.println();
        }

        for (Produto produto: produtos) {
            System.out.println("-----------");
            System.out.println(produto);
            System.out.println("-----------");
        }
    }
}
