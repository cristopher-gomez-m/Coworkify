
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.AreaTrabajo.Vista.AñadirMiembro;
import coworkify.Usuario.Modelo.Contrato;
import coworkify.Usuario.Modelo.MiembroTrabajoDB;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Modelo.miembroTrabajo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class añadirMiembroControlador {
    private AñadirMiembro añadirMiembro;
    private MiembroTrabajoDB miembroTrabajoDB;
    private MiembroTrabajoDB miembrodb=new MiembroTrabajoDB();
    private List<miembroTrabajo> usuario;
    private List<miembroTrabajo> miembrosTrabajo;
    private AreaTrabajo area;
    private tableController table;

    public void setArea(AreaTrabajo area) {
        this.area = area;
    }

    public void setTable(tableController table) {
        this.table = table;
    }
    
    
    
    
    public añadirMiembroControlador(AñadirMiembro añadirMiembro, MiembroTrabajoDB miembroTrabajoDB) {
        this.añadirMiembro = añadirMiembro;
        this.miembroTrabajoDB = miembroTrabajoDB;
        this.añadirMiembro.getAñadirMiembro().addActionListener(añadirMiembroTrabajo);
        run();
    }
    
    public void run(){
        añadirMiembro.setVisible(true);
        añadirMiembro.setSize(366, 365);
        añadirMiembro.setTitle("AÑADIR MIEMBRO DE TRABAJO");
    }
    
    
        ActionListener añadirMiembroTrabajo= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre= añadirMiembro.getNombreMiembro().getText();
            String correo= añadirMiembro.getCorreoMiembro().getText();
            float deposito= Float.parseFloat(añadirMiembro.getDepositoMiembro().getText());
            String dia= Integer.toString(añadirMiembro.getFechaInicio().getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes= Integer.toString(añadirMiembro.getFechaInicio().getCalendar().get(Calendar.MONTH));
            String año= Integer.toString(añadirMiembro.getFechaInicio().getCalendar().get(Calendar.YEAR));
            String fecha= (año+"-"+mes+"-"+dia);
            Date fechita = Date.valueOf(fecha);
            System.out.println(fechita);
            usuario=miembrodb.BuscarUsuario(correo);
            if(usuario.size()!=0){
            miembroTrabajo miembroTrabajo= usuario.get(0);
            Contrato contrato= new Contrato(fechita,deposito);
            
           
            //usuarioDB.setUsuario(miUsuario);
            contrato.setMiembroTrabajo(miembroTrabajo);
            contrato.setAreaTrabajo(area);
           miembroTrabajoDB.guardarContratoMiembro(contrato); 
            
           table.añadir();
            

        }
        else{
            JOptionPane.showMessageDialog(null, "Esta mal el usuario o la contraseña");
        }

            
            
            //añadirMiembro.dispose();
        }

        
        
       
        
    };
    
    
}
