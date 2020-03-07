package medical.core.lib;

import java.util.ArrayList;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public interface FileHandlerInterface {
    
    public <E> ArrayList<E> readFile();
    
    public <E> boolean writeFile(ArrayList<E> data);
}
