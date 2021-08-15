
package coworkify.AreaTrabajo.Modelo;

import coworkify.Usuario.Modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AreaTrabajoDB {
    
        private Boolean estado;
        private List <AreaTrabajo> miArea;
        private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
        
        
    
    public Boolean comprobarArea(String idArea){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(trabaja.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
            miSesssion.beginTransaction();
            List <AreaTrabajo> miArea= miSesssion.createQuery("from AreaTrabajo areaTrabajo where areaTrabajo.id_area_trabajo ='"+idArea +"'").getResultList();
            if(miArea.size()==0) estado=false;
            else estado=true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
        return estado;
      } 
            
            
    public List<AreaTrabajo> buscarAreas(String correo){
         SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                 .addAnnotatedClass(Usuario.class)
                 .addAnnotatedClass(AreaTrabajo.class)
                 .addAnnotatedClass(trabaja.class)
                 .buildSessionFactory();
            Session miSesssion= miFactory.openSession();      
            try{
            miSesssion.beginTransaction();
             miArea= miSesssion.createQuery("from AreaTrabajo areaTrabajo where areaTrabajo.usuario='"+correo+"'").getResultList();
             miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
                }
           return miArea; 
        }
            

    public void guardarArea(AreaTrabajo areaTrabajo){
               
                SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Usuario.class)
                        .addAnnotatedClass(AreaTrabajo.class)
                        .addAnnotatedClass(trabaja.class)
                        .buildSessionFactory();
                Session miSesssion= miFactory.openSession();
        
                try{
                    miSesssion.beginTransaction();
                    usuario.agregarArea(areaTrabajo);
                    miSesssion.save(areaTrabajo);
                    miSesssion.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
                }catch(Exception e){
                    System.out.println("error");
                }finally{
                    miSesssion.close();
                    miFactory.close();
        }
    }
           

    }
           
    
