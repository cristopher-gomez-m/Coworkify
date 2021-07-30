
package coworkify;
import coworkify.Usuario.Controlador.UsuarioLogin;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Vista.inicio_sesion;

public class Coworkify {
     
  
    public static void main(String[] args) {
      // UsuarioDB user = new UsuarioDB();
       //user.BuscarUsuario("alex@noseque","456a");
        //System.out.println();oDB();
       //user.BuscarUsuario("alex@n
       UsuarioLogin login = new UsuarioLogin(new UsuarioDB(), new inicio_sesion());
      // user.comprobarUsuario("alex@noseqe");
    }
    
}
