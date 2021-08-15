
package coworkify.Usuario.Modelo;

import coworkify.AreaTrabajo.Modelo.trabaja;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="miembro_de_trabajo")
public class miembroTrabajo {
    
        public void agregarArea(trabaja trabajo){
        if(trabajos==null) trabajos=new ArrayList<>();
        trabajos.add(trabajo);
        
        trabajo.setMiembroTrabajo(this);
    }
    
    
    @Column(name="Nombre")
    private String nombre;
    

    
    @Id
    @Column(name="No_trabajador")
    private int no_trabajador;
    
    
    @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="usuario_correo")
    private Usuario usuario;
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="miembroTrabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<trabaja> trabajos;
    
    public miembroTrabajo(){
       
    }

    public miembroTrabajo(String nombre,int no_trabajador) {
        this.nombre = nombre;
       
        this.no_trabajador = no_trabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNo_trabajador() {
        return no_trabajador;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<trabaja> getTrabajos() {
        return trabajos;
    }
    
    
}
