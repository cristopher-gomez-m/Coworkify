


package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.AreaTrabajoDB;
import coworkify.AreaTrabajo.Vista.ingre_areatrab;
import coworkify.AreaTrabajo.Vista.selec_areatrab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsuarioSeleccionarArea {
    private selec_areatrab selecArea;
    private CrearArea crearArea;
    private IngresarArea ingresarArea;

    public UsuarioSeleccionarArea(selec_areatrab selecArea) {
        this.selecArea = selecArea;
        this.selecArea.getIngresarArea().addActionListener(ingresar);
        this.selecArea.getCrearArea().addActionListener(crear);
        run();
    }
    
    public void run(){
                 selecArea.setVisible(true);
                 selecArea.setBounds(375,210, 550, 375);
                 selecArea.setTitle("Elija lo que desea hacer");                 
 
    }
    
        ActionListener ingresar= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
          ingresarArea= new IngresarArea(new ingre_areatrab(),new AreaTrabajoDB());
        }
};
        
        
        ActionListener crear= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            crearArea= new CrearArea();
        }

        
    };
    
}
