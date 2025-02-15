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
import Controller.Helper.IHelper;  

public class AgendaController {

    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
    
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();//depurar aqui
        
        //Exibir essa lista na view
        helper.preencherTabela(agendamentos);
    }
    
    public void atualizaClientes(){
        //Buscar Clientes do banco
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir clientes no combobox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServicos(){
    
        //Buscar Servicos do Banco
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibir Servicos na combobox Servico
        helper.preencherServicos(servicos);
    }

    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }

    public void agendar() {
        
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        
        //Salvar no banco de dados
        new AgendamentoDAO().insert(agendamento);
        
        //atualizar Tabela
        atualizaTabela();
        
        helper.limparTela();
    }
}