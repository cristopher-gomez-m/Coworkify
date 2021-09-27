
package coworkify.Factura.Modelo;

import java.io.Serializable;
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
@Table(name="factura_detallada_usuario")
@IdClass(value=FacturaDetalladaUsuario.class)
public class FacturaDetalladaUsuario implements Serializable{
    @Id
    @Column(name="no_detalle")
    private int No_detalle;
    
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="articulo_id_articulo")
    private Articulo id_articulo;
    
    @ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name="factura_usuario_no_factura")
    private FacturaUsuario No_factura;
   
    
    @Column(name="precio")
    private float precio;
    
    @Column(name="cantidad")
    private int cantidad;

    public FacturaDetalladaUsuario(float precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public FacturaDetalladaUsuario() {
    }

    
    
    
    
    
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNo_detalle() {
        return No_detalle;
    }

    public void setNo_detalle(int No_detalle) {
        this.No_detalle = No_detalle;
    }

    public Articulo getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(Articulo id_articulo) {
        this.id_articulo = id_articulo;
    }

    public FacturaUsuario getNo_factura() {
        return No_factura;
    }

    public void setNo_factura(FacturaUsuario No_factura) {
        this.No_factura = No_factura;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
    
}
