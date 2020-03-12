package prova2.question3;

import java.util.ArrayList;

public interface ICmdMenu<T> {
    
    public String getNomeCadastro();
    
    public ArrayList<T> getListaElementos();
    
    public int getQuantidadeElementos();
    
    public void remover(int option);
    
    public void criarElementoAleatorio();
}
