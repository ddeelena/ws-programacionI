package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.Empleado;
import  co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

public interface Usuario {
    void crearCliente(String nombre,String cedula,String telefono,String direccion,String cumpleaños,String email);
    void crearEmpleado(String nombre,String cedula,String telefono,String direccion,String experiencia,String salario);
    public abstract Empleado buscarEmpleado();
    public abstract Cliente buscarCliente();
}
