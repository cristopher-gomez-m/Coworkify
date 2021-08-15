
package coworkify.AreaTrabajo.Modelo;

import coworkify.Usuario.Modelo.miembroTrabajo;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="trabaja")
@IdClass(value=trabaja.class)
public class trabaja implements Serializable {
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="area_de_trabajo_id_area_trabajo")
    private AreaTrabajo areaTrabajo;
    
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="miembro_de_trabajo_No_trabajador")
    private miembroTrabajo miembroTrabajo;
    
    public trabaja(){
        
    }

    public trabaja(AreaTrabajo areaTrabajo, miembroTrabajo miembroTrabajo) {
        this.areaTrabajo = areaTrabajo;
        this.miembroTrabajo = miembroTrabajo;
    }
    
        
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public void setMiembroTrabajo(miembroTrabajo miembroTrabajo) {
        this.miembroTrabajo = miembroTrabajo;
    }
    
    
    
}
