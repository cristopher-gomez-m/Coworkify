
package coworkify.Factura.Modelo;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="No_factura")
    private int numeroFactura;
    
    @Column(name="fecha_de_emision")
    private Date fechaEmision;
    
    @Column(name="miembro")
    private String miembro;
    
    @Column(name="cantidad")
    private int cantidad;
    
    @Column(name="usuario_correo")
    private String usuario_correo;
}
