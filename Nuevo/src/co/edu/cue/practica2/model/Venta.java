package co.edu.cue.practica2.model;

public class Venta {

   private Detalle[] detalle;
   private Cliente cliente;
   private Empleado empleado;
   private String fechaDeCompra;


   public Venta(Detalle[] detalle, Cliente cliente, Empleado empleado,String fechaDeCompra) {
      this.detalle = detalle;
      this.cliente = cliente;
      this.empleado = empleado;
   }

   public Detalle[] getDetalle() {
      return detalle;
   }

   public void setDetalle(Detalle[] detalle) {
      this.detalle = detalle;
   }

   public Cliente getCliente() {
      return cliente;
   }
   //public String getNombre() {return cliente.getNombre();}

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public Empleado getEmpleado() {
      return empleado;
   }

   public void setEmpleado(Empleado empleado) {
      this.empleado = empleado;
   }

   public String getFechaDeCompra() {
      return fechaDeCompra;
   }

   public void setFechaDeCompra(String fechaDeCompra) {
      this.fechaDeCompra = fechaDeCompra;
   }
}
