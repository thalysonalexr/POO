package aula13;

public class App {

    public static void main(String[] args) {
        
        Database conn1 = Database.connection("mysql://198.168.0.1:3306");
        Database conn2 = Database.connection("mysql://198.168.0.1:3306");
        
        System.out.println(conn1.hashCode());
        System.out.println(conn2.hashCode());
    }
    
}
