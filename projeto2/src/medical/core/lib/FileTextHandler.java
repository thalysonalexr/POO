package medical.core.lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 * @param <E>
 */
public class FileTextHandler <E> implements FileHandlerInterface {
    
    private final String file;
    private BufferedReader reader;
    private BufferedWriter writer;
    private static FileTextHandler instance = null;
    private static final String CHARSET = "UTF-8";

    private FileTextHandler(String file) {
        this.file = file;
        this.init();
    }
    
    public static FileTextHandler instance(String file) {
        if (null == FileTextHandler.instance) {
            return new FileTextHandler(file);
        }
        
        return FileTextHandler.instance;
    }
    
    private void init() {
        try {
            File f = new File(this.file);
            
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            this.reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(this.file), FileTextHandler.CHARSET
            ));
            
            this.writer = new BufferedWriter(
                new FileWriter(this.file, true)
            );
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public <E> ArrayList<E> readFile() {
        String line;
        ArrayList<E> data = new ArrayList<>();

        File f = new File(this.file);
        
        if (f.exists() && !f.isDirectory()) {
        
            try {
                line = this.reader.readLine();

                while (null != line) {
                    line = this.reader.readLine();
                    data.add((E) line);
                }

                this.reader.close();

                return data;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return null;
    }
    
    @Override
    public <E> boolean writeFile(ArrayList<E> data) {
        
        if (data.isEmpty()) {
            return true;
        }
        
        data.forEach((line) -> {
            try {
                this.writer.write((String) line);
                this.writer.newLine();
                this.writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        
        /*try {
            this.writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
        
        return true;
    }
}
