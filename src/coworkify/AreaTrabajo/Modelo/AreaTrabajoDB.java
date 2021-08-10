
package coworkify.AreaTrabajo.Modelo;

import coworkify.Usuario.Modelo.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AreaTrabajoDB {
    
        private Boolean estado;
    
            public Boolean comprobarArea(String idArea){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
            miSesssion.beginTransaction();
            List <AreaTrabajo> miArea= miSesssion.createQuery("from AreaTrabajo areaTrabajo where areaTrabajo.id_area_trabajo ='"+idArea +"'").getResultList();
            if(miArea==null) estado=false;
            else estado=true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
        return estado;
      } 
    
    
    
}
