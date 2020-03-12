package prova2.question2;

// design pattern Singleton
public class RepositorioProduto extends Repositorio<Produto> {

    private static RepositorioProduto instance = null;

    private RepositorioProduto() {}
    
    public static RepositorioProduto getInstance() {
        if (RepositorioProduto.instance == null) {
            RepositorioProduto.instance = new RepositorioProduto();
        }
        
        return RepositorioProduto.instance;
    }
}
