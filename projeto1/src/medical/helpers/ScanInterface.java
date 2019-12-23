package medical.helpers;

import java.util.ArrayList;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public interface ScanInterface {
    public String[] getAtributos();
    public String[] getTipos();
    public void setValores(ArrayList<Object> valores);
}
