package medical.core.helpers;

import java.util.Scanner;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class InputID {
    
    private static final String ASK = "type id >> ";
    
    public static int show() {
        Scanner scan = new Scanner(System.in);
                    
        System.out.print(InputID.ASK);
        
        return Integer.parseInt(scan.nextLine());
    }
    
}
