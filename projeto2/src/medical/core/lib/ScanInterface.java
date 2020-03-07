package medical.core.lib;

import java.util.ArrayList;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public interface ScanInterface {
    
    public String[] getAtributos();
    
    public String[] getTipos();
    
    public void setValores(ArrayList<Object> valores);
    
}
