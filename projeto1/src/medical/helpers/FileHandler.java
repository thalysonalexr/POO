package medical.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @param <E>
 */
public class FileHandler <E> {
    
    private final ArrayList<E> data;
    private final String file;
    
    public FileHandler(ArrayList<E> data, String file) {
        this.data = data;
        this.file = file;
    }
    
    public ArrayList<E> readFile() throws ClassNotFoundException {
        
        FileInputStream fin;
        ObjectInputStream oin;
        
        E object;
        
        try {
            fin = new FileInputStream(this.file);
            oin = new ObjectInputStream(fin);
            
            while ((object = (E) oin.readObject()) != null) {
                this.data.add(object);
            }
            
            fin.close();
            oin.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo " + this.file + " nao encontrado");
        } catch (IOException e) {
            System.out.println("Houve um erro durante a leitura");
        }
        
        return this.data;
    }
    
    public boolean writeInFile() {
        
        FileOutputStream fout;
        
        try {
            fout = new FileOutputStream(this.file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            
            for (E object: this.data)
                oout.writeObject(object);
            
            oout.close();
            fout.close();
        } catch (IOException e) {
            return false;
        }
        
        return true;
    }
}
