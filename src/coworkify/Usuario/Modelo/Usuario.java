
package coworkify.Usuario.Modelo;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    
    
    
    public void agregarArea(AreaTrabajo area){
        if(areasTrabajo==null) areasTrabajo=new ArrayList<>();
        areasTrabajo.add(area);
        
        area.setUsuario(this);
    }
    
    @Id
    @Column(name="correo")
    private String correo;
    
    @Column(name="contraseña")
    private String contraseña;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="usuario",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<AreaTrabajo> areasTrabajo;
    
    @OneToOne(fetch=FetchType.EAGER,mappedBy="usuario",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private miembroTrabajo miembroTrabajo;

    public Usuario() {
    }

    public List<AreaTrabajo> getAreasTrabajo() {
        return areasTrabajo;
    }

    

    public Usuario(String correo, String contraseña, String nombre, String apellido) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public miembroTrabajo getMiembroTrabajo() {
        return miembroTrabajo;
    }


    
    
    
}
