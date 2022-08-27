package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;
import co.edu.cue.practica2.services.impl.SellServiceImpl;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class ControlVenta {
    SellServiceImpl sellServiceImpl = new SellServiceImpl();

    public SellServiceImpl getSellServiceImpl() {
        return sellServiceImpl;
    }

    public void realizarCompra(UsuarioServiceImpl usuarioService, ToyServiceImpl service) {
        service.prueba();
        Cliente nombreUsuario = usuarioService.buscarCliente();
        Empleado nombreVendedor = usuarioService.buscarEmpleado();
        int canti = Integer.parseInt(JOptionPane.showInputDialog("Cuantos juguetes va a comprar"));
        int diasSolicitado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia de compra"));
        int unidadesPrestadas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades de este juguete desea comprar"));
        String nombreJuguete = JOptionPane.showInputDialog("Ingrese el juguete para verificar exixtencia");
        sellServiceImpl.comprar( service.getToys(), nombreUsuario, nombreVendedor, nombreJuguete, canti, diasSolicitado);
        service.modificarExistencia(-unidadesPrestadas, nombreJuguete);
    }

}
