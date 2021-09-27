
package coworkify.Factura.controlador;

import coworkify.AreaTrabajo.Controlador.tableController;
import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.Factura.Modelo.FacturaDB;
import coworkify.Factura.Modelo.FacturaUsuario;
import coworkify.Factura.Vista.FacturaDetallada;
import coworkify.Factura.Vista.añadirArticulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class añadirFacturaControlador {
    private AreaTrabajo area;
    private tableController table;
    private FacturaDB facturaDB;
    private FacturaDetallada vista;
    private añadirArticuloControlador añadirArticulo;
    private añadirArticulo añadirArticuloVista;

    public void setTable(tableController table) {
        this.table = table;
        this.table.setFacturaDetallada(vista);
    }

    public añadirFacturaControlador(FacturaDB facturaDB, FacturaDetallada vista) {
        this.facturaDB = facturaDB;
        this.vista = vista;
        this.vista.botonFactura.addActionListener(añadirFactura);
        this.vista.botonCrearFactura.addActionListener(crearFactura);
        run();
    }
    
        public void run(){
        vista.setVisible(true);
        vista.setSize(600,600);
        vista.setTitle("Factura detallada");
    }
    
        ActionListener añadirFactura= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            añadirArticulo= new añadirArticuloControlador(new añadirArticulo());
            añadirArticulo.setTable(table);
            //añadirMiembro.dispose();
        }

        
    };  
    
    
              ActionListener crearFactura= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar fechita= new GregorianCalendar();
            String dia= Integer.toString(fechita.get(Calendar.DAY_OF_MONTH));
            String mes= Integer.toString(fechita.get(Calendar.MONTH));
            String año= Integer.toString(fechita.get(Calendar.YEAR));
            String fechaFormateada= (año+"-"+mes+"-"+dia);

            Date fecha= Date.valueOf(fechaFormateada);
            System.out.println(fecha);
            FacturaUsuario factura = new FacturaUsuario(fecha);
            table.crearFactura(factura);
            //añadirMiembro.dispose();
        }
        };
      
    
}
