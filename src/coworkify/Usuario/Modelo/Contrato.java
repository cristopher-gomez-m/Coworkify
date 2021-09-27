
package coworkify.Usuario.Modelo;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contrato")
@IdClass(value=Contrato.class)
public class Contrato implements Serializable{
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="miembro_de_trabajo_correo")
    private miembroTrabajo miembroTrabajoCorreo;

    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="area_de_trabajo_id_area_trabajo")
    private AreaTrabajo areaTrabajo;
    
    @Column(name="fecha_de_inicio")
    private Date fechaInicio;
    
    @Column(name="deposito")
    private float deposito;
    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="no_trabajador")
    private int no_trabajador;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Contrato(){
        
    }

    public Contrato(Date fechaInicio, float deposito) {
        this.fechaInicio = fechaInicio;
        this.deposito = deposito;
    }

    public void setMiembroTrabajo(miembroTrabajo miembroTrabajo) {
        this.miembroTrabajoCorreo = miembroTrabajo;
    }

    public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    
    
}
