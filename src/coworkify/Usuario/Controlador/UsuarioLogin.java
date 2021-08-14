/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.Usuario.Controlador;

import coworkify.AreaTrabajo.Controlador.UsuarioSeleccionarArea;
import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.AreaTrabajo.Modelo.AreaTrabajoDB;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Vista.crear_cuenta;
import coworkify.Usuario.Vista.inicio_sesion;
import coworkify.AreaTrabajo.Vista.selec_areatrab;
import coworkify.Usuario.Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author cristopheralexander
 */
public class UsuarioLogin {
    private UsuarioDB usuarioDB;
    private inicio_sesion login;
    private UsuarioCrearCuenta crearCuenta;
    private UsuarioSeleccionarArea selecArea;
    private AreaTrabajoDB areaDB= new AreaTrabajoDB();
    private List<Usuario> usuario;
    private List<AreaTrabajo> areas;
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
         usuario=usuarioDB.BuscarUsuario(correo, contraseña);
        
        if(usuario.size()!=0){
            Usuario miUsuario= usuario.get(0);
            //usuarioDB.setUsuario(miUsuario);
            areaDB.setUsuario(miUsuario);
            System.out.println(miUsuario.getAreasTrabajo().get(0).getId_area_trabajo());
            
            
            
            login.setVisible(false);
            selecArea= new UsuarioSeleccionarArea(new selec_areatrab(),areaDB);
        }
        else{
            JOptionPane.showMessageDialog(null, "Esta mal el usuario o la contraseña");
        }
            }
        };
}
