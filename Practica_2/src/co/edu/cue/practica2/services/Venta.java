package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.model.Detalle;
import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Juguete;

public interface Venta {
public abstract Venta comprar(Empleado[] empleados, Cliente[] clientes, Juguete[] juguete, Detalle[] detalle,
                         int contador, String nombreUsuario, String nombreVendedor, String nombreJuguete, int canti,
                         int diasSolicitado, int unidadesPrestadas);
}
