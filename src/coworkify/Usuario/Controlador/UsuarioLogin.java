/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.Usuario.Controlador;

import coworkify.Usuario.Modelo.*;
import coworkify.Usuario.Vista.crear_cuenta;
import coworkify.Usuario.Vista.inicio_sesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author cristopheralexander
 */
public class UsuarioLogin {
    private UsuarioDB usuarioDB;
    private inicio_sesion login;
    private UsuarioCrearCuenta crearCuenta;
    public UsuarioLogin(UsuarioDB usuarioDB, inicio_sesion login) {
        this.usuarioDB = usuarioDB;
        this.login = login;
        this.login.getIniciar_sesion().addActionListener(comprobar);
        this.login.getCrearCuenta().addActionListener(botonCrearCuenta);
        run();
    }
    
      
    
    public void run(){
           login.setVisible(true);
            login.setBounds(375,210, 561, 465);
            login.setTitle("CREAR CUENTA");
       }
 
  
    ActionListener botonCrearCuenta= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
              login.setVisible(false);
              crearCuenta= new UsuarioCrearCuenta(usuarioDB, new crear_cuenta());
        }
        
    };
    
    
    
        ActionListener comprobar= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
        String correo=login.getIngresarcuenta().getText();
        String contraseña= login.getIngresarcontraseña().getText();
        Boolean estado=usuarioDB.BuscarUsuario(correo, contraseña);
        if(estado){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Esta mal el usuario o la contraseña");
        }
            }
        };
}
