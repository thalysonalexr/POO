package medical.tcp.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import medical.core.controllers.ControllerInterface;
import medical.core.helpers.FileTextHandler;
import medical.core.helpers.Logger;
import medical.tcp.server.config.Env;
import medical.tcp.server.services.ServiceLayer;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 * @param <E>
 */
public class Server <E> extends Thread implements ServerInterface {
    
    private boolean running = true;
    private ServerSocket server;
    private ServiceLayer service;
    private Logger logger = Logger.create(
        "server:dev",
        FileTextHandler.instance(Env.LOGS_SERVER)
    );
    private ArrayList<ControllerInterface> controllers = new ArrayList<>();
    
    public static Server create() {
        return new Server();
    }
    
    public void listen() {
        this.start();
    }

    @Override
    public void run() {
        try {
            this.server = new ServerSocket(Env.PORT);
            this.logger.add("running application in localhost:" + Env.PORT);
            this.logger.persist();
            this.logger.clear();
            
            while (this.running) {
                try (Socket socket = server.accept()) {
                    this.logger.add("client connected.");

                    InputStream is = socket.getInputStream();
                    ObjectInputStream ois = new ObjectInputStream(is);
                    
                    // toda magica acontece aqui
                    this.service = (ServiceLayer) ois.readObject();

                    for (ControllerInterface controller: this.controllers) {
                        if (controller.getName().equals(this.service.resource())) {

                            controller.restore();
                            OutputStream os = socket.getOutputStream();
                            ObjectOutputStream oos = new ObjectOutputStream(os);

                            switch (service.method()) {
                                case "store":
                                    controller.register(this.service.data());
                                    controller.save();
                                    break;
                                case "show":                                    
                                    int id = this.service.params();
                                    oos.writeObject(controller.findById(id));
                                    break;
                                case "destroy":
                                    controller.remove(this.service.params());
                                    controller.save();
                                    break;
                                case "index":
                                    oos.writeObject(controller.listAll());
                                    break;
                            }

                            this.logger.add("executed method " + service.method());
                        }
                    }

                    socket.close();
                    this.logger.add("client disconnected.");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            this.logger.add(e.getMessage());
        } finally {
            this.logger.persist();
        }
    }
    
    public void disconnect() {
        try {
            this.server.close();
            this.running = false;
        } catch (IOException e) {
            this.logger.add(e.getMessage());
        }
    }
    
    /**
     * register a new controller
     * @param controller 
     */
    public void controllers(ControllerInterface controller) {
        this.controllers.add(controller);
    }
}
