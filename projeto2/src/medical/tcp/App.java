package medical.tcp;

import java.util.ArrayList;
import medical.core.ApplicationInterface;
import medical.core.controllers.ControllerInterface;

/**
 * design pattern: facade para executar os processos do servidor a cliente
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App implements ApplicationInterface {

    @Override
    public void run(ArrayList<ControllerInterface> controllers) {
        medical.tcp.server.App.process(controllers);
        medical.tcp.client.App.process();
    }
}
