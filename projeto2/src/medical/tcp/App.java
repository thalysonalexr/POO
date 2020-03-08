package medical.tcp;

import medical.core.ApplicationInterface;

/**
 * design pattern: facade para executar os processos do servidor a cliente
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App implements ApplicationInterface {

    @Override
    public void run() {
        medical.tcp.server.App.process();
        medical.tcp.client.App.process();
    }
}
