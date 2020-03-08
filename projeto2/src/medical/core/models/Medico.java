package medical.core.models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import medical.core.helpers.ScanInterface;

/**
 *
 * @author thalysonalexr <thalysonrodrigues.dev@gmail.com>
 */
public class Medico extends Pessoa implements ScanInterface {
    
    private int id;
    private static int nextId = 1;
    private String crm;
    private Double salario;

    public Medico() {
        this.id = Medico.nextId++;
    }

    public Medico(String nome, String cpf, String crm, Double salario) {
        super(nome, cpf);
        this.id = Medico.nextId++;
        this.crm = crm;
        this.salario = salario;
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
        Medico.nextId = this.id + 1;
    }
    
    /**
     * @return the id
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    @Override
    public String[] getAtributos() {
        return new String[]{"nome", "cpf", "crm", "salario"};
    }

    @Override
    public String[] getTipos() {
        return new String[]{"s", "s", "s", "d"};
    }

    @Override
    public void setValores(ArrayList<Object> valores) {
        this.nome = (String) valores.get(0);
        this.cpf = (String) valores.get(1);
        this.crm = (String) valores.get(2);
        this.salario = (Double) valores.get(3);
    }
    
    @Override
    public String toString() {        
        return "ID: " + this.id + "\n"
            + super.getFormatData()
            + "CRM: " + this.crm + "\n"
            + "Salario: " + String.format("%.2f", this.salario) + " R$\n";
    }
}
