
package coworkify.Factura.controlador;

import coworkify.AreaTrabajo.Controlador.tableController;
import coworkify.Factura.Modelo.Articulo;
import coworkify.Factura.Vista.añadirArticulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class añadirArticuloControlador {
    private añadirArticulo añadirArticulo;
    private tableController table;

    public añadirArticuloControlador(añadirArticulo añadirArticulo) {
        this.añadirArticulo = añadirArticulo;
        this.añadirArticulo.botonAñadirArticulo.addActionListener(añadirArticuloEvent);
        run();
    }
    
    
  
       public void run(){
        añadirArticulo.setVisible(true);
        añadirArticulo.setSize(500, 400);
        añadirArticulo.setTitle("AÑADIR ARTICULO");
    }
    

    public añadirArticulo getAñadirArticulo() {
        return añadirArticulo;
    }

    public void setAñadirArticulo(añadirArticulo añadirArticulo) {
        this.añadirArticulo = añadirArticulo;
    }
    
            ActionListener añadirArticuloEvent= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombreArticulo=añadirArticulo.nombreArticulo.getText();
            int cantidad= Integer.parseInt(añadirArticulo.cantidad.getText());
            Float precioUnitario=Float.parseFloat(añadirArticulo.precioUnitario.getText());
            Articulo articulo= new Articulo(nombreArticulo,precioUnitario);
            table.añadirArticulo(articulo,cantidad);
            añadirArticulo.dispose();
            //añadirMiembro.dispose();
        }

        
    };  

    public tableController getTable() {
        return table;
    }

    public void setTable(tableController table) {
        this.table = table;
    }


            
            
            
            
            
            
}
