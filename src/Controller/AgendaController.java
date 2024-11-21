package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    
    private final Agenda view; 
    private final AgendaHelper helper; 

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public AgendaController() {
        throw new UnsupportedOperationException(); 
    }
    
    public void atualizaTabela(){
    
        //Busca lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
                

        //Exibe lista na View.
        helper.preencherTabela(agendamentos); 
        
        
    
        
    }
}
