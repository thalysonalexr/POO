package medical.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class FileHandler implements FileHandlerInterface {

    private final String file;
    
    public FileHandler(String file) {
        this.file = file;
    }
    
    @Override
    public <E> ArrayList<E> readFile() {
        
        File f = new File(this.file);
        
        if (f.exists() && !f.isDirectory()) {
     
            FileInputStream fin;
            ObjectInputStream oin;
            ArrayList<E> data = new ArrayList<>();

            try {
                fin = new FileInputStream(this.file);
                oin = new ObjectInputStream(fin);
                E object;
                
                int size = oin.readInt();
                
                for (int i = 0; i < size; i++) {
                    object = (E) oin.readObject();
                    data.add(object);
                }

                oin.close();
                fin.close();
            } catch (FileNotFoundException e) {
                System.out.println("[Erro] Arquivo " + this.file + " nao encontrado.");
            } catch (EOFException e) {
                System.out.println("[Erro] Final do arquivo inesperado.");
            } catch (IOException e) {
                System.out.println("[Erro] Houve um erro durante a leitura.");
            } catch (ClassNotFoundException e) {
                System.out.println("[Erro] Nao foi possivel interpretar conteudo do arquivo.");
            }

            return data;
        }
        
        return new ArrayList<>();
    }
    
    @Override
    public <E> boolean writeFile(ArrayList<E> data) {
        
        File f = new File(this.file);
        FileOutputStream fout;
        
        if (data.isEmpty() && !f.exists()) {
            return true;
        }

        try {
            fout = new FileOutputStream(this.file);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            
            oout.writeInt(data.size());

            for (E object: data)
                oout.writeObject(object);

            oout.close();
            fout.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }
}
