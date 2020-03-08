package medical.tcp.server;

import medical.core.controllers.ControllerInterface;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public interface ServerInterface {
    
    public void listen();

    public void controllers(ControllerInterface controller);
    
}
