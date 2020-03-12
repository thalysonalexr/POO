package prova2.question2;

public class Main {
    public static void main(String[] args) {
        
        Factory.createDepartamentos(10).forEach(d -> RepositorioDepartamento.getInstance().add(d));
        Factory.createProdutos(10).forEach(p -> RepositorioProduto.getInstance().add(p));
        
        RepositorioDepartamento.getInstance().printAll();
        RepositorioProduto.getInstance().printAll();
                
    }
}
