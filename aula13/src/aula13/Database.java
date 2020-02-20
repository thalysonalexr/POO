package aula13;

/**
 * design patter: Singleton
 * @author thalyson
 */
public class Database {
    
    private String uri;
    private static Database conn = null;

    private Database(String uri) {
        this.uri = uri;
    }
    
    public static Database connection(String uri) {
        if (conn == null)
            conn = new Database(uri);

        return conn;
    }
}
