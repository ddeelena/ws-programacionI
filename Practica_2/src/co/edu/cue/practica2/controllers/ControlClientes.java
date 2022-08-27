package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.services.impl.SellServiceImpl;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class ControlClientes {
    UsuarioServiceImpl service = new UsuarioServiceImpl();

    public UsuarioServiceImpl getService() {
        return service;
    }

    public void crearClienteF(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion");
        String cumpleaños = JOptionPane.showInputDialog("Ingrese el cumpleaños");
        String email = JOptionPane.showInputDialog("Ingrese el correo");

        service.crearCliente(nombre,cedula,telefono,direccion,cumpleaños,email);
    }
    public void mejorCliente(SellServiceImpl sellService){
        service.clienteConMasCompras(sellService.getVentas());
    }
}
