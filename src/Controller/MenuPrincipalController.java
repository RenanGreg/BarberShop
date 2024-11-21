package Controller;

import View.Agenda;
import View.MenuPrincipal;


public class MenuPrincipalController { 
    
    private final MenuPrincipal view; 

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void NavegarParaAgenda(){ 
        
        Agenda agenda = new Agenda(); 
        agenda.setVisible(true); 
        this.view.dispose();
    
   }
    
}
