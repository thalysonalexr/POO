package medical.controllers;

import java.util.ArrayList;
import medical.config.PathFiles;
import medical.models.Agendamento;

/**
 *
 * @author thalysonalexr
 * @author Aldo Riboli
 * @see https://github.com/thalysonalexr/POO/tree/master/projeto1
 */
public class AgendamentoController extends Controller {

    public AgendamentoController() {
        super(PathFiles.AGENDAMENTO);
        super.className = "Agendamento";
    }
    
    public void relatorioAtendimentosPorMedico(int id) {
        
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        
        for (Agendamento e: this.getAgendamentos()) {
            if (id == e.getMedico().getId()) {
                agendamentos.add(e);
            }
        }
        
        if ( ! agendamentos.isEmpty()) {
            System.out.println("Agendamentos para o medico - " + id);
            for (Agendamento e: agendamentos)
                System.out.println(e);
        } else {
            System.out.println("Nenhum agendamento para o medico " + id);
        }
    }
    
    public void relatorioConsultasPorPaciente(int id) {
        
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        
        for (Agendamento e: this.getAgendamentos()) {
            if (id == e.getPaciente().getId()) {
                agendamentos.add(e);
            }
        }
        
        if ( ! agendamentos.isEmpty()) {
            System.out.println("Consultas para o paciente - " + id);
            for (Agendamento e: agendamentos)
                System.out.println(e);
        } else {
            System.out.println("Nenhuma consulta foi agendada para o paciente " + id);
        }
    }
    
    /**
     * Converte um ArrayList<Object> para ArrayList<Agendamento>
     * 
     * @return the ArrayList<Agendamento>
     */
    public ArrayList<Agendamento> getAgendamentos() {
        
        ArrayList<Agendamento> agendamentos = new ArrayList<>();
        
        for (Object e: this.data)
            agendamentos.add((Agendamento) e);
        
        return agendamentos;
    }
}
