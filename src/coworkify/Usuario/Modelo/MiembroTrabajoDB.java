
package coworkify.Usuario.Modelo;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.AreaTrabajo.Modelo.AreaTrabajoRecurso;
import coworkify.AreaTrabajo.Modelo.Recurso;
import coworkify.AreaTrabajo.Modelo.ReservaMiembro;
import coworkify.AreaTrabajo.Modelo.ReservaUsuario;
import coworkify.Factura.Modelo.Articulo;
import coworkify.Factura.Modelo.FacturaDetalladaUsuario;
import coworkify.Factura.Modelo.FacturaUsuario;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class MiembroTrabajoDB {
 
         private List<miembroTrabajo> miUsuario;
        public List<miembroTrabajo> BuscarUsuario(String correo){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
        
        miUsuario= miSesssion.createQuery("from miembroTrabajo miembroTrabajo where miembroTrabajo.usuario ='"+correo +"'").getResultList();
        //List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo='alex'").getResultList();

        miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
            return miUsuario;
        
    }
    
    
    public void guardarContratoMiembro(Contrato contrato){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        try{
            miSesssion.beginTransaction();
            miSesssion.save(contrato);
            miSesssion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Miembro de trabajo añadido exitosamente");
        }catch(Exception e){
            System.out.println("error");
        }finally{
            miSesssion.close();
            miFactory.close();
        }
    }
}
