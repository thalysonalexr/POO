package medical.tcp.server.services;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 * @param <E>
 */
public interface ServiceLayer <E> extends Serializable {
    
    public String resource();
    
    public String method();
    
    public ArrayList<E> data();
    
    public int params();
}
