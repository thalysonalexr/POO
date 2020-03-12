package medical.helpers;

import java.util.ArrayList;

/**
 * design pattern: composite
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Logger {
    
    private String env;
    private FileHandlerInterface fileHandler;
    private ArrayList<String> logs = new ArrayList<>();

    private Logger(String env, FileHandlerInterface fileHandler) {
        this.env = env;
        this.fileHandler = fileHandler;
    }
    
    public static Logger create(String env, FileHandlerInterface fileHandler) {
        return new Logger(env, fileHandler);
    }
    
    public void add(String message) {
        this.logs.add(this.mask(message));
    }
    
    public void clear() {
        this.logs.clear();
    }
    
    public void persist() {
        this.fileHandler.writeFile(logs);
    }

    public void out(String message) {
        System.out.print(this.mask(message));
    }

    private String mask(String message) {
        return "[" + this.env + "] " + message;
    }
}
