package Controller.Helper;

import Model.Usuario;
import View.Login;


public class LoginHelper implements IHelper { 
    
    private final Login view; 

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        
    String nome = view.getTextUsuario().getText(); 
        String senha = view.getTextSenha().getText(); 
        
        Usuario modelo = new Usuario(0, nome, senha); 
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha(); 
        
        view.getTextUsuario().setText(""); 
        view.getTextSenha().setText("");
   }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
