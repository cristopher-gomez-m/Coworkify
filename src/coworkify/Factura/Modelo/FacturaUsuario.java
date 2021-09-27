
package coworkify.Factura.Modelo;

import coworkify.Usuario.Modelo.Usuario;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="factura_usuario")
public class FacturaUsuario implements Serializable {
    @Id
    @Column(name="no_factura")
    private int numeroFactura;
    
    @Column(name="fecha_de_emision")
    private Date fechaEmision;
   
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="usuario_correo")
    private Usuario usuario_correo;
    
    
    @OneToMany(fetch=FetchType.LAZY,mappedBy="No_factura",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @Fetch(value = FetchMode.SUBSELECT)    
    private List<FacturaDetalladaUsuario> facturas;
    
    
        public void agregarFactura(FacturaDetalladaUsuario factura){
        if(facturas==null) facturas=new ArrayList<>();
        facturas.add(factura);
        
        factura.setNo_factura(this);
    }
    

    public FacturaUsuario() {
    }

    public FacturaUsuario(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    
    
    
    
    public FacturaUsuario(int numeroFactura, Date fechaEmision) {
        this.numeroFactura = numeroFactura;
        this.fechaEmision = fechaEmision;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Usuario getUsuario_correo() {
        return usuario_correo;
    }

    public void setUsuario_correo(Usuario usuario_correo) {
        this.usuario_correo = usuario_correo;
    }
    
    
    
    
    
}
