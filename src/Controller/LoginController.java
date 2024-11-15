package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;


public class LoginController { 
    
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view; 
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){ 
        
        String nome = view.getTextUsuario().getText(); 
        String senha = view.getTextSenha().getText(); 
        
        Usuario modelo = new Usuario(0, nome, senha);
        //pegar usuario da View
        Usuario usuario = helper.obterModelo();
        //pesquisa Usuario no banco
    
    }
    
    
    
    public void FizTarefa(){
        System.out.println("Busquei algo");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
