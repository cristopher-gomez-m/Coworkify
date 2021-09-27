
package coworkify.Factura.Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="articulo")
public class Articulo {
    @Id
    @Column(name="id_articulo")
    private int id_articulo;
    
    @Column(name="nombre")
    private String nombre;
   
    
    @Column(name="precio_unitario")
    private float precio;
    
    
    @OneToMany(fetch=FetchType.EAGER,mappedBy="id_articulo",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<FacturaDetalladaUsuario> facturas;

    
    
        public void agregarFactura(FacturaDetalladaUsuario factura){
        if(facturas==null) facturas=new ArrayList<>();
        facturas.add(factura);
        
        factura.setId_articulo(this);
    }
    
    
    
    public Articulo() {
    }

    public Articulo(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
