package medical.models;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import medical.helpers.ScanInterface;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Medico extends Pessoa implements ScanInterface {
    
    private int id;
    private static int nextId = 1;
    private String crm;
    private Double salario;
    private ArrayList<Especialidade> especialidades = new ArrayList<>();
    public static final String TIPO = "-- Medico --";

    public Medico() {
        this.id = Medico.nextId++;
    }
    
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        Medico.nextId = this.id + 1;
    }

    public Medico(String nome, String cpf, String crm, Double salario) {
        super(nome, cpf);
        this.id = Medico.nextId++;
        this.crm = crm;
        this.salario = salario;
    }
    
    public void adicionarEspecialidade(Especialidade e) {
        this.especialidades.add(e);
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

    /**
     * @return the especialidades
     */
    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    
    @Override
    public String toString() {
        String especialidades = "";
        
        for (Especialidade e: this.especialidades)
            especialidades += e;
        
        return Medico.TIPO + "\n"
               + super.getFormatData()
               + "ID: " + this.id + "\n"
               + "CRM: " + this.crm + "\n"
               + "Salario: " + String.format("%.2f", this.salario) + " R$\n"
               + "Especialidades:\n"
               + especialidades;
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
}
