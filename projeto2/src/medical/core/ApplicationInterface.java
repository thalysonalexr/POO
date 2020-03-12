package medical.core;

import java.util.ArrayList;
import medical.core.controllers.ControllerInterface;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public interface ApplicationInterface {

    public void run(ArrayList<ControllerInterface> controllers);

}
