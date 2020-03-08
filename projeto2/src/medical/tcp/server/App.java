package medical.tcp.server;

import medical.core.controllers.MedicoController;

/**
 * design pattern: facade para adicionar configuracoes ao Server
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App {

    public static void process() {
        
        ServerInterface server = Server.create();
        
        server.controllers(MedicoController.create());
        
        server.listen();
    }
}
