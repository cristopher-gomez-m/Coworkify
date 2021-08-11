/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.*;
import coworkify.AreaTrabajo.Vista.crear_areatrab;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author cristopheralexander
 */
public class CrearArea {
    private crear_areatrab crearArea;
    private AreaTrabajoDB area;

    public CrearArea(crear_areatrab crearArea, AreaTrabajoDB area) {
        this.crearArea = crearArea;
        this.area = area;
        this.crearArea.getRegistrar().addActionListener(botonCrear);
    }
    
        ActionListener botonCrear= new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre= crearArea.getEnviaNombre().getText();
            String idArea= crearArea.getEnviarContraseña().getText();
            if(nombre.equalsIgnoreCase("") || idArea.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null,"Llene todos los campos");
            }
            else{
                Boolean estado=area.comprobarArea(idArea);
                if(estado){
                   JOptionPane.showMessageDialog(null,"ese id ya existe");
                }
                else{
                    AreaTrabajo areaTrabajo= new AreaTrabajo(idArea,nombre);
                }
            }
        }

        
        
    };
}
