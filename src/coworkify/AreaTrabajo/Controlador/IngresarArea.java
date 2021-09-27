
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.AreaTrabajo.Modelo.AreaTrabajoDB;
import coworkify.AreaTrabajo.Vista.ingre_areatrab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import coworkify.AreaTrabajo.Vista.menu_princtrab;
import java.util.List;
import javax.swing.JOptionPane;



public class IngresarArea {
    private ingre_areatrab ingresar;
    private AreaTrabajoDB areaTrabajo;
    private MenuPrincipal menuPrincipal;
    private AreaTrabajo area;
    private List<AreaTrabajo> areas;
    public IngresarArea(ingre_areatrab ingresar, AreaTrabajoDB areaTrabajo) {
        this.ingresar = ingresar;
        this.areaTrabajo = areaTrabajo;
        this.ingresar.getIngresar().addActionListener(ingresarArea);
        run();
    }
    
    public void run(){
        ingresar.setVisible(true);
        ingresar.setBounds(500,500, 550, 500);
        ingresar.setTitle("INGRESAR AL ÁREA DE TRABAJO");
    }
    
    
        ActionListener ingresarArea= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String idArea= ingresar.getCodigo().getText();
            areas= areaTrabajo.buscarArea(idArea);
            if(areas.size() !=0){
                area= areas.get(0);
            ingresar.setVisible(false);
            //selecArea= new UsuarioSeleccionarArea(new selec_areatrab());
            menuPrincipal= new MenuPrincipal(new menu_princtrab(),areaTrabajo);
            menuPrincipal.setArea(area);
        }
        else{
            JOptionPane.showMessageDialog(null, "Esta mal el codigo del area de trabajo");
        }
        }

        
    };
    
}
