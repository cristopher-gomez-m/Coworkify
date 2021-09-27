
package coworkify.Usuario.Modelo;


import coworkify.AreaTrabajo.Modelo.ReservaMiembro;
import java.io.Serializable;
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
public class miembroTrabajo implements Serializable {

    

        
    
    
        public void agregarContrato(Contrato contrato){
        if(contratos==null) contratos=new ArrayList<>();
        contratos.add(contrato);
        
        contrato.setMiembroTrabajo(this);
    }
    
        
        public void agregarReserva(ReservaMiembro reserva){
        if(reservaMiembro==null) reservaMiembro=new ArrayList<>();
        reservaMiembro.add(reserva);
        
        reserva.setCorreoMiembroTrabajo(this);
    }        
        
    
    @Column(name="Nombre")
    private String nombre;
    
    
    
    
    @Id
    @OneToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="usuario_correo")
    private Usuario usuario;
       
    @OneToMany(fetch=FetchType.EAGER,mappedBy="miembroTrabajoCorreo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Contrato> contratos;
    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="correoMiembroTrabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<ReservaMiembro> reservaMiembro;
    
    public miembroTrabajo(){
       
    }
    
    
    public miembroTrabajo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public List<ReservaMiembro> getReservaMiembro() {
        return reservaMiembro;
    }

    
    
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public void setReservaMiembro(List<ReservaMiembro> reservaMiembro) {
        this.reservaMiembro = reservaMiembro;
    }
    
    
    
}
