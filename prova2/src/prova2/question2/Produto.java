package prova2.question2;

import java.util.ArrayList;

/**
 *
 * @author maikon
 */
public class Produto {
    
    private int id;
    private String nome;
    private ArrayList<Departamento> departamentos;
    private double preco;
    private int estoque;

    public Produto() {
    }

    public Produto(Builder builder) {
        this.estoque = builder.estoque;
        this.id = builder.id;
        this.preco = builder.preco;
        this.nome = builder.nome;
        this.departamentos = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Departamento d: this.departamentos)
            s += "   - " + d + "\n";
        String f = "[%d06] %s - Preço: R$ %.2f  Estoque: %d \n" + s;
        return String.format(f, id, nome, preco, estoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public static class Builder {
        private int estoque;
        private int id;
        private double preco;
        private String nome;

        public Builder() {
        }
        
        public Builder estoque(int estoque) {
            this.estoque = estoque;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }
        
        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        } 
        
        public Produto build() {
            return new Produto(this);
        }
    }
}
