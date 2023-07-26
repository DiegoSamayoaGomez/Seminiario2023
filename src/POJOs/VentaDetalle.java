package POJOs;
// Generated 17/07/2023 07:01:33 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * VentaDetalle generated by hbm2java
 */
public class VentaDetalle  implements java.io.Serializable {


     private int idVentaDetalle;
     private Producto producto;
     private Venta venta;
     private Integer cantidad;
     private BigDecimal monto;

    public VentaDetalle() {
    }

	
    public VentaDetalle(int idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }
    public VentaDetalle(int idVentaDetalle, Producto producto, Venta venta, Integer cantidad, BigDecimal monto) {
       this.idVentaDetalle = idVentaDetalle;
       this.producto = producto;
       this.venta = venta;
       this.cantidad = cantidad;
       this.monto = monto;
    }
   
    public int getIdVentaDetalle() {
        return this.idVentaDetalle;
    }
    
    public void setIdVentaDetalle(int idVentaDetalle) {
        this.idVentaDetalle = idVentaDetalle;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Venta getVenta() {
        return this.venta;
    }
    
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }




}


