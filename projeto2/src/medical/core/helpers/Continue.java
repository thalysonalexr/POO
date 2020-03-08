package medical.core.helpers;

import java.util.Scanner;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Continue {
    
    public interface Callback {
    
        public void invoke();

    }
    
    public static void load(String ask, Callback callback) {
        while (true) {
            callback.invoke();
            System.out.print(ask + " (y)/(n) >> ");
            
            Scanner scan = new Scanner(System.in);
            
            if (scan.nextLine().toLowerCase().equals("n")) {
                break;
            }
        }
    }
    
}
