package medical.helpers;

import java.util.ArrayList;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public interface FileHandlerInterface {
    
    public <E> ArrayList<E> readFile();
    
    public <E> boolean writeFile(ArrayList<E> data);
}
