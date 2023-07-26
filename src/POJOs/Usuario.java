package POJOs;
// Generated 17/07/2023 07:01:33 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private Perfil perfil;
     private Boolean estado;
     private String usuario;
     private String contrasenia;
     private Set<Cliente> clientesForUsuarioModifica = new HashSet<Cliente>(0);
     private Set<Venta> ventasForUsuarioModifica = new HashSet<Venta>(0);
     private Set<Venta> ventasForUsuarioIngreso = new HashSet<Venta>(0);
     private Set<Producto> productosForUsuarioModifica = new HashSet<Producto>(0);
     private Set<Producto> productosForUsuarioIngreso = new HashSet<Producto>(0);
     private Set<Cliente> clientesForUsuarioIngreso = new HashSet<Cliente>(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Usuario(int idUsuario, Perfil perfil, Boolean estado, String usuario, String contrasenia, Set<Cliente> clientesForUsuarioModifica, Set<Venta> ventasForUsuarioModifica, Set<Venta> ventasForUsuarioIngreso, Set<Producto> productosForUsuarioModifica, Set<Producto> productosForUsuarioIngreso, Set<Cliente> clientesForUsuarioIngreso) {
       this.idUsuario = idUsuario;
       this.perfil = perfil;
       this.estado = estado;
       this.usuario = usuario;
       this.contrasenia = contrasenia;
       this.clientesForUsuarioModifica = clientesForUsuarioModifica;
       this.ventasForUsuarioModifica = ventasForUsuarioModifica;
       this.ventasForUsuarioIngreso = ventasForUsuarioIngreso;
       this.productosForUsuarioModifica = productosForUsuarioModifica;
       this.productosForUsuarioIngreso = productosForUsuarioIngreso;
       this.clientesForUsuarioIngreso = clientesForUsuarioIngreso;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return this.contrasenia;
    }
    
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public Set<Cliente> getClientesForUsuarioModifica() {
        return this.clientesForUsuarioModifica;
    }
    
    public void setClientesForUsuarioModifica(Set<Cliente> clientesForUsuarioModifica) {
        this.clientesForUsuarioModifica = clientesForUsuarioModifica;
    }
    public Set<Venta> getVentasForUsuarioModifica() {
        return this.ventasForUsuarioModifica;
    }
    
    public void setVentasForUsuarioModifica(Set<Venta> ventasForUsuarioModifica) {
        this.ventasForUsuarioModifica = ventasForUsuarioModifica;
    }
    public Set<Venta> getVentasForUsuarioIngreso() {
        return this.ventasForUsuarioIngreso;
    }
    
    public void setVentasForUsuarioIngreso(Set<Venta> ventasForUsuarioIngreso) {
        this.ventasForUsuarioIngreso = ventasForUsuarioIngreso;
    }
    public Set<Producto> getProductosForUsuarioModifica() {
        return this.productosForUsuarioModifica;
    }
    
    public void setProductosForUsuarioModifica(Set<Producto> productosForUsuarioModifica) {
        this.productosForUsuarioModifica = productosForUsuarioModifica;
    }
    public Set<Producto> getProductosForUsuarioIngreso() {
        return this.productosForUsuarioIngreso;
    }
    
    public void setProductosForUsuarioIngreso(Set<Producto> productosForUsuarioIngreso) {
        this.productosForUsuarioIngreso = productosForUsuarioIngreso;
    }
    public Set<Cliente> getClientesForUsuarioIngreso() {
        return this.clientesForUsuarioIngreso;
    }
    
    public void setClientesForUsuarioIngreso(Set<Cliente> clientesForUsuarioIngreso) {
        this.clientesForUsuarioIngreso = clientesForUsuarioIngreso;
    }




}


