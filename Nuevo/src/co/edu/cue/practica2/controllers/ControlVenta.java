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
        String diasSolicitado = JOptionPane.showInputDialog("ingrese el dia de compra");
        sellServiceImpl.comprar( service.getToys(), nombreUsuario, nombreVendedor, canti, diasSolicitado,service);
        //service.modificarExistencia(-unidadesPrestadas, nombreJuguete);
    }

}
