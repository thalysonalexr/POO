package classes;

class TestePessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Joao");
        Pessoa p3 = new Pessoa("Ana", 20, "Abel", "Maria");

        p1.setNome("Maria");
        p1.setIdade(50);
        p1.setMae("Ana");
        p1.setPai("Rui");
        System.out.println(p1);

        System.out.println(p2);
        System.out.println(p3);
    }
}
