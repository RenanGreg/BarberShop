package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;


public class LoginController { 
    
    private final Login view;
    private final LoginHelper helper;

    public LoginController(Login view) {
        this.view = view; 
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){ 
        
        //pegar usuario da View
        Usuario usuario = helper.obterModelo();
        
        //pesquisa Usuario no banco.
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutentificado = usuarioDAO.selectPorNomeESenha(usuario);
        
        
        if (usuarioAutentificado != null){
            MenuPrincipal menu = new MenuPrincipal(); 
            menu.setVisible(true);
            this.view.dispose();
            
        }
       else{
            view.exibeMensagem("Usuario ou senha invalidos"); 
        }
    
    }
    
    public void FizTarefa(){
        System.out.println("Busquei algo");
        
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
