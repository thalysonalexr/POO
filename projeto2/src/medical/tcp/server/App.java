package medical.tcp.server;

import medical.core.controllers.MedicoController;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App {

    public static void process() {
        
        Server server = Server.create();
        
        server.controllers(MedicoController.create());
        
        server.listen();
    }
}
