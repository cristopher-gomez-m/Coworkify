
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.*;
import coworkify.AreaTrabajo.Vista.AñadirMiembro;
import coworkify.AreaTrabajo.Vista.menu_princtrab;
import coworkify.Factura.Modelo.FacturaDB;
import coworkify.Factura.Vista.FacturaDetallada;
import coworkify.Factura.controlador.añadirFacturaControlador;
import coworkify.Usuario.Modelo.MiembroTrabajoDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuPrincipal {
    private menu_princtrab menu;
    private AreaTrabajoDB areaTrabajo;
    private añadirMiembroControlador controladorAñadir;
    private AreaTrabajo area;
    private tableController table= new tableController();
    private añadirFacturaControlador añadirFactura;
    public MenuPrincipal(menu_princtrab menu, AreaTrabajoDB areaTrabajo) {
        this.menu = menu;
        this.areaTrabajo = areaTrabajo;
        this.menu.añadirMiembro.addActionListener(añadir);
        this.menu.botonFactura.addActionListener(añadirFacturaEvent);
        run();
    }
        public void run(){
        menu.setVisible(true);
        menu.setBounds(650, 650, 650, 650);
        menu.setTitle("COWORKIFY");
        this.table.setMenu(menu);
        this.table.Buscar();
        this.table.buscarfactura();
    }
    
        
        
        
        ActionListener añadir= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            controladorAñadir= new añadirMiembroControlador(new AñadirMiembro(), new MiembroTrabajoDB());
            
            controladorAñadir.setArea(area);
            controladorAñadir.setTable(table);

        }

        
            
            
            //añadirMiembro.dispose();
        };
        
        
        ActionListener añadirFacturaEvent= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            añadirFactura= new añadirFacturaControlador(new FacturaDB(),new FacturaDetallada());
            
            
            
            
            añadirFactura.setTable(table);
        }

        
            
            
            //añadirMiembro.dispose();
        };
        
        

    public void setArea(AreaTrabajo area) {
        this.area = area;
    }

    
}
                
