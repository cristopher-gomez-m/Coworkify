/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.Usuario.Controlador;

import coworkify.Usuario.Modelo.*;
import coworkify.Usuario.Vista.inicio_sesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author cristopheralexander
 */
public class UsuarioLogin {
    private UsuarioDB usuarioDB;
    private inicio_sesion login;


    public UsuarioLogin(UsuarioDB usuarioDB, inicio_sesion login) {
        this.usuarioDB = usuarioDB;
        this.login = login;
        login.getIniciar_sesion().addActionListener(comprobar);
    }
    
    
    
    
    
        ActionListener comprobar= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String correo=login.getIngresarcuenta().getText();
        String contraseña= login.getIngresarcontraseña().getText();
        Boolean estado=usuarioDB.BuscarUsuario(correo, contraseña);
        if(estado){
            
        }
        else{
            
        }
            }
        };
}
