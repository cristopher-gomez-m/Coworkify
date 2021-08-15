
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
    
    @Column(name="Plan")
    private String plan;
    
    @Id
    @Column(name="No_trabajador")
    private int no_trabajador;
    
    
    @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="usuario_correo")
    private Usuario usuario;
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="miembro_de_trabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<trabaja> trabajos;
    
    public miembroTrabajo(){
       
    }

    public miembroTrabajo(String nombre, String plan, int no_trabajador) {
        this.nombre = nombre;
        this.plan = plan;
        this.no_trabajador = no_trabajador;
    }
    
    
}
