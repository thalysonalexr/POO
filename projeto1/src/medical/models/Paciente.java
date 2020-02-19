package medical.models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import medical.helpers.ScanInterface;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class Paciente extends Pessoa implements ScanInterface {

    private int id;
    private static int nextId = 1;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    public static final String TIPO = "-- Paciente --";

    public Paciente() {
        this.id = Paciente.nextId++;
    }

    public Paciente(String nome, String cpf, String endereco, String telefone, String dataNascimento) {
        super(nome, cpf);
        this.id = Paciente.nextId++;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    
    /**
     * Realiza a leitura padrao do objeto logo apos define para
     * o atributo estatico da class "nextId' o valor do id do
     * objeto + 1. Ao final da leitura de todos os objetos do
     * arquivo a classe sabera qual o proximo Id a ser criado.
     * 
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        Paciente.nextId = this.id + 1;
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

    @Override
    public String[] getAtributos() {
        return new String[]{"nome", "cpf", "endereco", "telefone", "data nascimento"};
    }

    @Override
    public String[] getTipos() {
        return new String[]{"s", "s", "s", "s", "s"};
    }

    @Override
    public void setValores(ArrayList<Object> valores) {
        this.nome = (String) valores.get(0);
        this.cpf = (String) valores.get(1);
        this.endereco = (String) valores.get(2);
        this.telefone = (String) valores.get(3);
        this.dataNascimento = (String) valores.get(4);
    }
}
