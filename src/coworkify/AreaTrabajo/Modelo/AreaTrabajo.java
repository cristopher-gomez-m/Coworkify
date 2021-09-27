
package coworkify.AreaTrabajo.Modelo;

import coworkify.Usuario.Modelo.Contrato;
import coworkify.Usuario.Modelo.Usuario;
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
import javax.persistence.Table;

@Entity
@Table(name="area_de_trabajo")
public class AreaTrabajo {

    public AreaTrabajo(){
        
    }
    
    public AreaTrabajo(String id_area_trabajo, String nombre_del_espacio) {
        this.id_area_trabajo = id_area_trabajo;
        this.nombre_del_espacio = nombre_del_espacio;
    }
    
    

    
    
        public void agregarContrato(Contrato contrato){
        if(contratos==null) contratos=new ArrayList<>();
        contratos.add(contrato);
        
        contrato.setAreaTrabajo(this);
    }
        
        
        public void agregarRecurso(AreaTrabajoRecurso recurso){
        if(recursos==null) recursos=new ArrayList<>();
        recursos.add(recurso);
        
        recurso.setIdArea(this);
    }   
        
        public void agregarReservaMiembro(ReservaMiembro reserva){
        if(reservaMiembro==null) reservaMiembro=new ArrayList<>();
        reservaMiembro.add(reserva);
        
        reserva.setIdAreaTrabajo(this);
    }
    
        public void agregarReservaUsuario(ReservaUsuario reserva){
        if(reservaUsuario==null) reservaUsuario=new ArrayList<>();
        reservaUsuario.add(reserva);
        
        reserva.setIdAreaTrabajo(this);
    }
     
    
    @Id
    @Column(name="id_area_trabajo")
    private String id_area_trabajo;
    
    @Column(name="nombre_del_espacio")   
    private String nombre_del_espacio;
    
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="usuario_correo")
    private Usuario usuario;
    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="idArea",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<AreaTrabajoRecurso> recursos; 

    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="areaTrabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Contrato> contratos;
    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="idAreaTrabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<ReservaMiembro> reservaMiembro;
    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="idAreaTrabajo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<ReservaUsuario> reservaUsuario;

    public String getId_area_trabajo() {
        return id_area_trabajo;
    }

    public String getNombre_del_espacio() {
        return nombre_del_espacio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }


    
    
    
    
}
