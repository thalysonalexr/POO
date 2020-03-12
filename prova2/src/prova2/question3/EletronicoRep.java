package prova2.question3;

import java.util.ArrayList;
import java.util.Random;

class EletronicoRep implements ICmdMenu<Eletronico> {
    
    private ArrayList<Eletronico> eletronicos = new ArrayList<>();

    @Override
    public String getNomeCadastro() {
        return "eletronicos";
    }

    @Override
    public ArrayList<Eletronico> getListaElementos() {
        return this.eletronicos;
    }

    @Override
    public int getQuantidadeElementos() {
        return this.eletronicos.size();
    }

    @Override
    public void remover(int option) {
        this.eletronicos.remove(option);
    }

    @Override
    public void criarElementoAleatorio() {
        Eletronico eletronico = new Eletronico();
        Random r = new Random();
        
        eletronico.setId(r.nextInt());
        eletronico.setNome("Eletronico " + r.nextInt());
        eletronico.setMarca("Marca " + r.nextInt());
        
        this.eletronicos.add(eletronico);
    }
    
}
