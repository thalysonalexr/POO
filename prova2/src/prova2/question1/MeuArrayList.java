package prova2.question1;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 * @param <T>
 */
public class MeuArrayList <T> {
    
    private T[] data;
    private static final int LIMIT = 5;

    public MeuArrayList() {
        this.data = (T[]) new Object[LIMIT];
    }

    public MeuArrayList(int size) {
        this.data = (T[]) new Object[size];
    }
    
    public T get(int i) {
        return this.data[i] == null ? null : this.data[i];
    }
    
    public void add(T obj) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = obj;
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        String s = "[";
        
        for (int i = 0; i < this.data.length; i++) {
            s += this.data[i];
            if (i != (this.data.length - 1)) {
                s += ", ";
            }
        }
        
        s += "]";
        
        return s;
    }
    
}
