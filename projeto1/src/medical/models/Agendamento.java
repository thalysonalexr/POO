package medical.models;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 */
public class Agendamento {
    
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;
    private String observacoes;
    private boolean ativo;

    public Agendamento() {
    }

    public Agendamento(Paciente paciente, Medico medico, String data, String hora, String observacoes, boolean ativo) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.observacoes = observacoes;
        this.ativo = ativo;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     * @return 
     */
    public Agendamento setPaciente(Paciente paciente) {
        this.paciente = paciente;
        return this;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     * @return 
     */
    public Agendamento setMedico(Medico medico) {
        this.medico = medico;
        return this;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     * @return 
     */
    public Agendamento setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     * @return 
     */
    public Agendamento setHora(String hora) {
        this.hora = hora;
        return this;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     * @return 
     */
    public Agendamento setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     * @return 
     */
    public Agendamento setAtivo(boolean ativo) {
        this.ativo = ativo;
        return this;
    }
    
    @Override
    public String toString() {
        return "Agendamento para " + this.data + " as " + this.hora + "\n"
               + this.paciente
               + this.medico
               + "Obs: " + this.observacoes;
    }
}
