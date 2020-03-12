package prova2.question2;

// design pattern Singleton
public class RepositorioDepartamento extends Repositorio<Departamento> {
    
    private static RepositorioDepartamento instance = null;
    
    private RepositorioDepartamento() {}
    
    public static RepositorioDepartamento getInstance() {
        if (RepositorioDepartamento.instance == null) {
            RepositorioDepartamento.instance = new RepositorioDepartamento();
        }
        
        return RepositorioDepartamento.instance;
    }
}
