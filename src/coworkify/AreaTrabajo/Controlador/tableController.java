
package coworkify.AreaTrabajo.Controlador;

import coworkify.AreaTrabajo.Modelo.AreaTrabajo;
import coworkify.AreaTrabajo.Modelo.AreaTrabajoRecurso;
import coworkify.AreaTrabajo.Modelo.Recurso;
import coworkify.AreaTrabajo.Modelo.ReservaMiembro;
import coworkify.AreaTrabajo.Modelo.ReservaUsuario;
import coworkify.AreaTrabajo.Vista.menu_princtrab;
import coworkify.Factura.Modelo.Articulo;
import coworkify.Factura.Modelo.FacturaDetalladaUsuario;
import coworkify.Factura.Modelo.FacturaUsuario;
import coworkify.Factura.Vista.FacturaDetallada;
import coworkify.Usuario.Modelo.Contrato;
import coworkify.Usuario.Modelo.Usuario;
import coworkify.Usuario.Modelo.UsuarioDB;
import coworkify.Usuario.Modelo.miembroTrabajo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class tableController {
    
    private menu_princtrab menu;
    private Query a;
    private List<Object[]> asd;
    private DefaultTableModel modelo= new DefaultTableModel();
    private DefaultTableModel modeloFactura=new DefaultTableModel();
    private DefaultTableModel modeloArticulo= new DefaultTableModel();
    private FacturaDetallada facturaDetallada;
    public List<Articulo> articulos=new ArrayList<>();
    public List<FacturaDetalladaUsuario> facturas= new ArrayList<>();
    private Boolean flag=false;
    private UsuarioDB b= new UsuarioDB();
    private List<Usuario> usuario;
    int idDetalle=1;
    private List<FacturaUsuario> facturaUsuario;
    private List<Object[]> asdd;
    private double precioGlobal;
    public void setMenu(menu_princtrab menu) {
        this.menu = menu;
    }

    public void setFacturaDetallada(FacturaDetallada facturaDetallada) {
        this.facturaDetallada = facturaDetallada;
    }
   
    
    
    
        public void Buscar(){
        ArrayList<Object>nombreColumna=new ArrayList<Object>();    
        nombreColumna.add("Usuario");
        nombreColumna.add("Correo");
        for(Object columna:nombreColumna){
             modelo.addColumn(columna);
        
         }     
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
         a=miSesssion.createSQLQuery("select mT.nombre,mT.usuario_correo from miembro_de_trabajo mT,contrato c,area_de_trabajo aT where mT.usuario_correo=c.miembro_de_trabajo_correo and c.area_de_trabajo_id_area_trabajo= aT.id_area_trabajo");
         asd=a.getResultList();
        //List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo='alex'").getResultList();

        for(Object[] usuario:asd){  
                modelo.addRow(usuario);
            }
        this.menu.tableMiembros.setModel(modelo);
        this.menu.miembroActivos.setText(String.valueOf(asd.size()));
        
        
        
        
        
        
        miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
       }
      
        
        public void añadir(){
            modelo.setColumnCount(0);
            modelo.setRowCount(0);
        ArrayList<Object>nombreColumna=new ArrayList<Object>();    
        nombreColumna.add("Usuario");
        nombreColumna.add("Correo");
        
        for(Object columna:nombreColumna){
            modelo.addColumn(columna);
        }
         
        
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
         a=miSesssion.createSQLQuery("select mT.nombre,mT.usuario_correo from miembro_de_trabajo mT,contrato c,area_de_trabajo aT where mT.usuario_correo=c.miembro_de_trabajo_correo and c.area_de_trabajo_id_area_trabajo= aT.id_area_trabajo");
         asd=a.getResultList();
        //List <Usuario> miUsuario= miSesssion.createQuery("from Usuario usuario1 where usuario1.correo='alex'").getResultList();

        for(Object[] usuario:asd){  
                modelo.addRow(usuario);
                
            }
        this.menu.tableMiembros.setModel(modelo);
        this.menu.miembroActivos.setText(String.valueOf(asd.size()));
        this.menu.actividades.setText("Se añadió un nuevo miembro");
        miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }     
      
        }
        
        
        public void asignarNumero(FacturaUsuario factura){
                 SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        a=miSesssion.createSQLQuery("select fc.no_factura\n" +
        "from factura_usuario fc");
         asd=a.getResultList();
         if(asd.size()!=0){
             factura.setNumeroFactura(asd.size()+1);
         }
         else{
             factura.setNumeroFactura(1);
         }
        }
                public Articulo asignarNumero(Articulo articulo){
                 SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        a=miSesssion.createSQLQuery("select *\n" +
        "from articulo");
         asd=a.getResultList();
         if(asd.size()!=0){
             articulo.setId_articulo(asd.size()+1);
         }
         else{
             articulo.setId_articulo(1);
         }
         return articulo;
        }
        
        
        
        
        
        
        
        public void buscarfactura(){
            modeloFactura.setColumnCount(0);
            modeloFactura.setNumRows(0);
            precioGlobal=0;
        ArrayList<Object>nombreColumna=new ArrayList<Object>();    
        nombreColumna.add("Numero de factura");
        nombreColumna.add("Nombre");
        nombreColumna.add("Fecha");
        nombreColumna.add("Precio Total");
        
        for(Object columna:nombreColumna){
             modeloFactura.addColumn(columna);
        
         }     
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        try{
        miSesssion.beginTransaction();
         a=miSesssion.createSQLQuery("select fU.no_factura,U.nombre,fU.fecha_de_emision,sum(fDU.precio*fDU.cantidad) \n" +
"from factura_usuario fU,factura_detallada_usuario fDU,articulo aR,usuario U\n" +
"where fU.no_factura=fDU.factura_usuario_no_factura\n" +
"and fDU.articulo_id_articulo=aR.id_articulo\n" +
"and U.correo=fU.usuario_correo\n" +
"group by U.nombre,fU.fecha_de_emision,fU.no_factura");
         asdd=a.getResultList();
         
        

        for(Object[] usuario:asdd){  
                modeloFactura.addRow(usuario); 
            }
        this.menu.tablaFacturas.setModel(modeloFactura);
        miSesssion.getTransaction().commit();
        }catch(Exception e){
            e.toString();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
       }
        
        
        public void añadirArticulo(Articulo articulo,int cantidad){
            
        float precioTotal=(cantidad*(articulo.getPrecio()));
        precioGlobal +=precioTotal;
         if(flag==false){
             flag=true;
           ArrayList<Object>nombreColumna=new ArrayList<Object>(); 
            nombreColumna.add("Nombre");
            nombreColumna.add("Unidades");
            nombreColumna.add("Precio Unitario");
            nombreColumna.add("Precio Total");
            for(Object columna:nombreColumna){
                 modeloArticulo.addColumn(columna);
        
                } 
         }
         modeloArticulo.addRow((new Object[]{articulo.getNombre(),cantidad,articulo.getPrecio(),precioTotal}));
         articulos.add(articulo);
         FacturaDetalladaUsuario factura= new FacturaDetalladaUsuario(articulo.getPrecio(),cantidad);
         factura.setNo_detalle(idDetalle);
         facturas.add(factura);
         idDetalle++;
        this.facturaDetallada.tablaAñadirArticulos.setModel(modeloArticulo);
        this.menu.valorGlobal.setText(Double.toString(precioGlobal));
        }
        
        
        
        
        
        
        
        public void crearFactura(FacturaUsuario factura){
        SessionFactory miFactory= new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Usuario.class)
                .addAnnotatedClass(AreaTrabajo.class)
                .addAnnotatedClass(miembroTrabajo.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Recurso.class)
                .addAnnotatedClass(AreaTrabajoRecurso.class)
                .addAnnotatedClass(ReservaMiembro.class)
                .addAnnotatedClass(ReservaUsuario.class)
                .addAnnotatedClass(Articulo.class)
                .addAnnotatedClass(FacturaDetalladaUsuario.class)
                .addAnnotatedClass(FacturaUsuario.class)
                .buildSessionFactory();
        Session miSesssion= miFactory.openSession();
        
        try{
            miSesssion.beginTransaction();
             usuario= b.BuscarUsuario(this.facturaDetallada.textUsuarioCargo.getText());
             if(usuario.size()!=0){
                 Usuario usuarioFactura= usuario.get(0);
                 factura.setUsuario_correo(usuarioFactura);
                 this.asignarNumero(factura);
                    miSesssion.save(factura);
            
            for(Articulo articulo:articulos){
                Articulo nuevoArticulo =this.asignarNumero(articulo);
                 miSesssion.save(nuevoArticulo);
                } 
            
             for(int i=1; i<idDetalle;){
                 System.out.println(facturas.get(i-1));
                 FacturaDetalladaUsuario facturota=facturas.get(i-1);
                 facturota.setNo_factura(factura);
                 Articulo articulo= articulos.get(i-1);
                 facturota.setId_articulo(articulo);
                 miSesssion.save(facturota);
                 factura.agregarFactura(facturota);
                 i++;
             }
            miSesssion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Factura creada correctamente");
            flag=false;
            idDetalle=1;
            articulos.clear();
            facturas.clear();
            this.facturaDetallada.dispose();
            
            this.buscarfactura();
            this.menu.actividades.setText("añadida una nueva factura");
             }
            

        }catch(Exception e){
           e.printStackTrace();
        }finally{
            miSesssion.close();
            miFactory.close();
        }
        
      }  
        
        
    
        
      
        
        
        
} 
        

