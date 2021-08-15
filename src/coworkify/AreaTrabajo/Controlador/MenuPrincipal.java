
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.*;
import coworkify.AreaTrabajo.Vista.menu_princtrab;


public class MenuPrincipal {
    private menu_princtrab menu;
    private AreaTrabajoDB areaTrabajo;

    public MenuPrincipal(menu_princtrab menu, AreaTrabajoDB areaTrabajo) {
        this.menu = menu;
        this.areaTrabajo = areaTrabajo;
        run();
    }
        public void run(){
        menu.setVisible(true);
        menu.setBounds(375,155,800,500);
        menu.setTitle("COWORKIFY");
     
    }
    
}
