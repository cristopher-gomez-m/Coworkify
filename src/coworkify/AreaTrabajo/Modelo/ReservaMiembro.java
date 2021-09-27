
package coworkify.AreaTrabajo.Modelo;

import coworkify.Usuario.Modelo.miembroTrabajo;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reserva_miembro")
@IdClass(value=ReservaMiembro.class)
public class ReservaMiembro implements Serializable{
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="miembro_de_trabajo_usuario_correo")
    private miembroTrabajo correoMiembroTrabajo;
    
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="area_de_trabajo_id_area_trabajo")
    private AreaTrabajo idAreaTrabajo;
    
    @Id
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="recurso_nombre")
    private Recurso nombreRecurso;
    
    @Column(name="hora_inicio")
    private Date horaInicio;
    
    @Column(name="hora_fin")
    private Date horaFin;
    
    @Column(name="fecha")
    private Date fecha;
    
    public ReservaMiembro(){
        
    }

    public ReservaMiembro(Date horaInicio, Date horaFin, Date fecha) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fecha = fecha;
    }
    
    
    
    

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public miembroTrabajo getCorreoMiembroTrabajo() {
        return correoMiembroTrabajo;
    }

    public void setCorreoMiembroTrabajo(miembroTrabajo correoMiembroTrabajo) {
        this.correoMiembroTrabajo = correoMiembroTrabajo;
    }

    public AreaTrabajo getIdAreaTrabajo() {
        return idAreaTrabajo;
    }

    public void setIdAreaTrabajo(AreaTrabajo idAreaTrabajo) {
        this.idAreaTrabajo = idAreaTrabajo;
    }

    public Recurso getNombreRecurso() {
        return nombreRecurso;
    }

    public void setNombreRecurso(Recurso nombreRecurso) {
        this.nombreRecurso = nombreRecurso;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
   
    
    
}
