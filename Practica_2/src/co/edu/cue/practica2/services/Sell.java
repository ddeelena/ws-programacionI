package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.*;

public interface Sell  {
public abstract Venta comprar( Juguete[] juguete, Cliente nombreUsuario, Empleado nombreVendedor, String nombreJuguete, int canti,
                                     int diasSolicitado);
    //public abstract Venta imprimir(Venta[] ventas);
}
