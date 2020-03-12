package medical;

import java.util.ArrayList;
import medical.core.ApplicationInterface;
import medical.core.controllers.ControllerInterface;
import medical.core.controllers.MedicoController;
import medical.helpers.menu.Menu;


/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class App {
    
    public static void main(String[] args) {
        
        (new Menu())
            .add("Utilizar aplicacao Stand-alone", () -> run(new medical.app.App()))
            .add("Utilizar aplicacao Client/Server", () -> run(new medical.tcp.App()))
            .run();
    }
    
    public static void run(ApplicationInterface app) {
        ArrayList<ControllerInterface> controllers = new ArrayList<>();
        
        controllers.add(MedicoController.create());
        
        app.run(controllers);
    }
}
