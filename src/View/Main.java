package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;


public class Main { 
    public static void main (String[] args){
        
        String nome = "Renan"; 
        System.out.println(nome); 
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor()); 
        
        
        Cliente cliente = new Cliente(1, "Renan,", "Rua Rogerio Ceni", "4354564"); 
        System.out.println(cliente.getNome());  
        
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario.getNome());  
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "28/12/2030 12:30"); 
        System.out.println(agendamento.getCliente().getNome()); 
    }
    
}
