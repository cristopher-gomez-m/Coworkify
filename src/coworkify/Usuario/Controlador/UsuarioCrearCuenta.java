
package coworkify.Usuario.Controlador;

import coworkify.Usuario.Modelo.*;
import coworkify.Usuario.Vista.crear_cuenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class UsuarioCrearCuenta {
    private UsuarioDB usuarioDB;
    private crear_cuenta crearCuenta;

    public UsuarioCrearCuenta(UsuarioDB usuarioDB, crear_cuenta crearCuenta) {
        this.usuarioDB = usuarioDB;
        this.crearCuenta = crearCuenta;
        this.crearCuenta.getRegistrate().addActionListener(guardarCuenta);
        run();
    }
    
    public void run(){
        crearCuenta.setVisible(true);
        crearCuenta.setBounds(375,210, 561, 465);
        crearCuenta.setTitle("CREAR CUENTA");
    }
    
    
    
    
        ActionListener guardarCuenta= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String correo=crearCuenta.getCorreo().getText();
        String contraseña= crearCuenta.getContraseña().getText();
        String nombre= crearCuenta.getNombre().getText();
        String apellido= crearCuenta.getApellido().getText();
      
        if(correo.equalsIgnoreCase("") ||  contraseña.equalsIgnoreCase("") || nombre.equalsIgnoreCase("") || apellido.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Llene todos los campos");
        }
        else{
                System.out.println(correo);
            Boolean estado=usuarioDB.comprobarUsuario(correo);
            if(estado){
                JOptionPane.showMessageDialog(null,"ese correo ya existe");
            }
            else{
            Usuario usuario = new Usuario(correo,contraseña,nombre,apellido);
            miembroTrabajo miembroTrabajo= new miembroTrabajo(nombre);
            miembroTrabajo.setUsuario(usuario);
            usuarioDB.guardarUsuario(usuario,miembroTrabajo);
        }
                }
            }
        };
}
