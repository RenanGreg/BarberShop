package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
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
    
    public void atualizaCliente(){
        //Busca clientes banco de dados
        ClienteDAO clienteDAO = new ClienteDAO(); 
        ArrayList<Cliente> clientes = clienteDAO.selectAll(); 
        
        //Exibir clientes no Combobox cliente 
        helper.preencherClientes(clientes);

        } 
    
    public void atualizaServico(){ 
        
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll(); 
        
        helper.preencherServicos(servicos); 
    }
    
    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor()); 
    }
    
    public void Agendar(){
      //Buscar objeto agendamento da tela
      // Salvar Objeto no banco de dados 
    }
}
