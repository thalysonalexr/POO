package medical.core.helpers.menu;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Item {
    
    private int option;
    private String message;
    private Callback callback;

    public Item(String message, Callback callback) {
        this.message = message;
        this.callback = callback;
    }
    
    

    /**
     * @return the option
     */
    public int getOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(int option) {
        this.option = option;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the callback
     */
    public Callback getCallback() {
        return callback;
    }

    /**
     * @param callback the callback to set
     */
    public void setCallback(Callback callback) {
        this.callback = callback;
    }
}
