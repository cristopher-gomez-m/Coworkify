
package coworkify.Usuario.Modelo;


import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UsuarioDB {
     private Boolean flag;
    public Boolean BuscarUsuario(String correo,String contraseña){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
        
         List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo ='"+correo +"'and usuario1.contraseña = '"+contraseña+"' ").getResultList();
        //List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo='alex'").getResultList();

        for(Usuario usuario:miUsuario){
                System.out.println(usuario);
            }
        miSesssion.getTransaction().commit();
        
        
        if(miUsuario==null) return flag=false;
        else return flag=true;
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
            return flag;
       
        
    }

    public void guardarUsuario(Usuario usuario){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Usuario.class).buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        try{
            miSesssion.beginTransaction();
            miSesssion.save(usuario);
            miSesssion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
    }
}
