package classes;

public class Produto {
    
    private String nome;
    private String departamento;
    private int estoque;
    private float preco;

    public Produto() {
        this.estoque = 0;
    }

    public Produto(String nome, String departamento, int estoque, float preco)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public float getPreco() {
        return this.preco;
    }
 
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println(
            "Nome: " + this.nome + ", " +
            "Departamento: " + this.departamento + ", " +
            "Estoque: " + this.estoque + ", " +
            "Preco: " + this.preco);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", " +
               "Departamento: " + this.departamento + ", " + 
               "Estoque: " + this.estoque + ", " + 
               "Preco: " + this.preco;
    }
}
