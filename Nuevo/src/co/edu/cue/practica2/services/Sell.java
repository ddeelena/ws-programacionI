package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;

public interface Sell  {
    void comprar(Juguete[] juguete, Cliente nombreUsuario, Empleado nombreVendedor, int canti, String diasSolicitado, ToyServiceImpl service);
    void imprimir(Venta ventas);
}
