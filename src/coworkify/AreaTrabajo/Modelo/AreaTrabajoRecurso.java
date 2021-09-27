
package coworkify.AreaTrabajo.Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="area_trabajo_recurso")
@IdClass(value=AreaTrabajoRecurso.class)
public class AreaTrabajoRecurso implements Serializable{

    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="area_de_trabajo_id_area_trabajo")
    private AreaTrabajo idArea;
    
    
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="recurso_nombre")
    private Recurso nombreRecurso;
    
    
    

    public AreaTrabajo getIdArea() {
        return idArea;
    }

    public Recurso getNombreRecurso() {
        return nombreRecurso;
    }

    public void setIdArea(AreaTrabajo idArea) {
        this.idArea = idArea;
    }

    public void setNombreRecurso(Recurso nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }


    
    
    public AreaTrabajoRecurso(){
        
    }


    
    
    
    

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
