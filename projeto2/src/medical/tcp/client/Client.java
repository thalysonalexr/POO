package medical.tcp.client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

import medical.core.lib.Logger;
import medical.core.lib.FileTextHandler;
import tcp.server.services.ServiceLayer;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Client {
    
    public interface Callback <E> {
        public void invoke(ArrayList<E> data);
    }
    
    private Logger logger = Logger.create(
        "client:dev",
        FileTextHandler.instance("data/logs/client.txt")
    );

    public Client() {}
    
    public void send(ServiceLayer service) {
        this.logger.add("application running...");
        
        try {
            try (Socket socket = new Socket("localhost", 5000)) {
                this.logger.add("connected.");
                
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                
                oos.writeObject(service);
                oos.flush();
                oos.close();

                socket.close();
            }
            
        } catch (IOException  e) {
            logger.add(e.getMessage());
        } finally {
            logger.persist();
        }
    }

    public <E> void receive(Service service, Callback callback) {
        this.logger.add("application running...");
        
        try {
            try (Socket socket = new Socket("localhost", 5000)) {
                this.logger.add("connected.");
                
                OutputStream os = socket.getOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(os);
                
                oos.writeObject(service);
                
                InputStream is = socket.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                
                ArrayList<E> data = (ArrayList<E>) ois.readObject();
                
                callback.invoke(data);

                socket.close();
            }
            
        } catch (ClassNotFoundException | IOException  e) {
            logger.add(e.getMessage());
        } finally {
            logger.persist();
        }
    }
}
