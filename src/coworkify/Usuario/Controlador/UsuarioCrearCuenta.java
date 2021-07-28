
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
    }
    
    
    
        ActionListener guardarCuenta= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String correo=crearCuenta.getCorreo().getText();
        String contraseña= crearCuenta.getContraseña().getText();
        String nombre= crearCuenta.getNombre().getText();
        String apellido= crearCuenta.getApellido().getText();
        if(correo !="" & contraseña!="" & nombre!="" & apellido!=""){
            Usuario usuario = new Usuario(correo,contraseña, nombre,apellido);
            usuarioDB.guardarUsuario(usuario);
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos");
        }
            }
        };
}
