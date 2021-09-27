
package coworkify;
import coworkify.AreaTrabajo.Controlador.añadirMiembroControlador;
import coworkify.AreaTrabajo.Controlador.tableController;
import coworkify.AreaTrabajo.Vista.AñadirMiembro;
import coworkify.Usuario.Controlador.UsuarioLogin;
import coworkify.Usuario.Modelo.MiembroTrabajoDB;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Vista.inicio_sesion;
import java.util.Arrays;
import java.util.List;
public class Coworkify {
     
  
    public static void main(String[] args) {

       UsuarioLogin login = new UsuarioLogin(new UsuarioDB(), new inicio_sesion());
       
       //añadirMiembroControlador asd= new añadirMiembroControlador(new AñadirMiembro(), new MiembroTrabajoDB());
       //Object[] array= new Object[]{"asd"};
       //List<Object[]> ab = Arrays.
        //System.out.println(ab);
      
    }
    
}
