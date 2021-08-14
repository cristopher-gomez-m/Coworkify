
package coworkify.Usuario.Modelo;



import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UsuarioDB {
     private Boolean estado;
     private Usuario usuario;

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     
     
     private List<Usuario> miUsuario;
        public List<Usuario> BuscarUsuario(String correo,String contraseña){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).addAnnotatedClass(AreaTrabajo.class).buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
        
        miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo ='"+correo +"'and usuario1.contraseña = '"+contraseña+"' ").getResultList();
        //List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo='alex'").getResultList();

        for(Usuario usuario:miUsuario){
                System.out.println(usuario);
            }
        miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
            return miUsuario;
        
    }

    
        public Boolean comprobarUsuario(String correo){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).addAnnotatedClass(AreaTrabajo.class).buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
            miSesssion.beginTransaction();
            List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo ='"+correo +"'").getResultList();
            if(miUsuario.size()==0) return estado=false;
            else return estado=true;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
        return estado;
      } 
    
    public void guardarUsuario(Usuario usuario){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).addAnnotatedClass(AreaTrabajo.class).buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        try{
            miSesssion.beginTransaction();
            System.out.println(usuario.getCorreo());
            miSesssion.save(usuario);
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
