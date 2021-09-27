
package coworkify.AreaTrabajo.Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="recurso")
public class Recurso implements Serializable {
    
    @Id
    @Column(name="nombre")
    private String nombre;
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="nombreRecurso",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<AreaTrabajoRecurso> recursos;    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="nombreRecurso",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<ReservaMiembro> reservaMiembro;
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="nombreRecurso",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<ReservaUsuario> reservaUsuario;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }
    
    
    public Recurso(){
        
    }

        public void agregarRecurso(AreaTrabajoRecurso recurso){
        if(recursos==null) recursos=new ArrayList<>();
        recursos.add(recurso);
        
        recurso.setNombreRecurso(this);
    } 
    
        public void agregarReserva(ReservaMiembro reserva){
        if(reservaMiembro==null) reservaMiembro=new ArrayList<>();
        reservaMiembro.add(reserva);
        
        reserva.setNombreRecurso(this);
    }
        
        public void agregarReserva(ReservaUsuario reserva){
        if(reservaUsuario==null) reservaUsuario=new ArrayList<>();
        reservaUsuario.add(reserva);
        
        reserva.setNombreRecurso(this);
    }
        
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public List<AreaTrabajoRecurso> getRecursos() {
        return recursos;
    }
    
    
    
    
    
}
