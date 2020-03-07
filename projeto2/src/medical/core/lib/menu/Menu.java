package medical.core.lib.menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Menu {
    
    public static final int EXIT = 0;
    private ArrayList<Item> options = new ArrayList<>();

    public Menu() {}
    
    public Menu add(String option, Callback callback) {
        this.options.add(new Item(option, callback));
        return this;
    }
    
    public void print() {
        System.out.println("*********************");
        
        for (int index = 0; index < this.options.size(); index++) {
            this.options
                .get(index)
                .setOption((index + 1));
            
            System.out.println(
                (index + 1) + " - " + this.options.get(index).getMessage()
            );
        }
        
        System.out.print(Menu.EXIT + " - Encerrar sessao.\n>> ");
    }
    
    public int run() {        
        Scanner scan = new Scanner(System.in);
        
        int option = -1;
        
        try {
            this.print();
            option = Integer.parseInt(scan.nextLine());
            
            if (option == Menu.EXIT) {
                System.exit(0);
            }
            
            for (Item menuItem: this.options) {
                if (option == menuItem.getOption()) {
                    menuItem.getCallback().invoke();
                }
            }
            
            return option;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
