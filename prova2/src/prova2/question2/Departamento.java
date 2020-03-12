package prova2.question2;

public class Departamento {
    
    private int id;
    private String nome;
    
    public Departamento() {
    }

    private Departamento(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
    }
    
    @Override
    public String toString() {
        return String.format("[%d06] %s", id, nome);
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
    
    public static class Builder {
        private int id;
        private String nome;

        public Builder() {
        }
        
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }
        
        public Departamento build() {
            return new Departamento(this);
        }
    }
}
