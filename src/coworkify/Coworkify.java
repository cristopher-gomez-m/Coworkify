
package coworkify;
import coworkify.Usuario.Controlador.UsuarioLogin;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Vista.inicio_sesion;
public class Coworkify {
     
  
    public static void main(String[] args) {

       UsuarioLogin login = new UsuarioLogin(new UsuarioDB(), new inicio_sesion());

    }
    
}
