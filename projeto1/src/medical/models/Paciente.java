package medical.models;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Paciente extends Pessoa {

    private int id;
    private static int nextId;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    public static final String TIPO = "-- Paciente --";

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String endereco, String telefone, String dataNascimento) {
        super(nome, cpf);
        this.id = Paciente.nextId++;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the dataNascimento
     */
    public String getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return Paciente.TIPO + "\n"
               + super.getFormatData()
               + "ID: " + this.id + "\n"
               + "Endereco: " + this.endereco + "\n"
               + "Telefone: " + this.telefone + "\n"
               + "Data de Nasc: " + this.dataNascimento + "\n";
    }
}
