package medical.tcp.server;

import java.util.ArrayList;
import medical.core.controllers.ControllerInterface;

/**
 * design pattern: facade para adicionar configuracoes ao Server
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App {

    public static void process(ArrayList<ControllerInterface> controllers) {
        
        ServerInterface server = Server.create();
        
        server.controllers(controllers);
        
        server.listen();
    }
}
