package co.edu.cue.practica2.model;

public class Detalle {
     private int cantidad;
     private Juguete juguete;
     private double subtotal =0;

     public Detalle(int cantidad, Juguete juguete) {
          this.cantidad = cantidad;
          this.juguete = juguete;
          subtotal = juguete.getPrecio()*(cantidad);
     }

     public Juguete getJuguete() {
          return juguete;
     }

     public void setJuguete(Juguete juguete) {
          this.juguete = juguete;
     }

     public int getCantidad() {
          return cantidad;
     }

     public void setCantidad(int cantidad) {
          this.cantidad = cantidad;
     }

     public double getSubtotal() {
          return subtotal;
     }

     public void setSubtotal(double subtotal) {
          this.subtotal = subtotal;
     }
}
