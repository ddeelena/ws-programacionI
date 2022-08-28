package co.edu.cue.practica2.application;

import co.edu.cue.practica2.controllers.*;
import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Toy;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;
import co.edu.cue.practica2.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        final ControlClientes controlCliente = new ControlClientes();
        final ControlJuguete controlJuguete = new ControlJuguete();
        final ControlVenta controlVenta = new ControlVenta();
        final ControlEmpleado controlUser = new ControlEmpleado();
        final ControlProveedor controlProveedor = new ControlProveedor();
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(
                    null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                    new Object[]{"Agregar nuevo", "Comprar juguetes","Comprar a provedor", "Editar existencias", "Obtener Informes", "Salir"}, "null");
            switch (opcion) {
                case 0:
                    int opcionNew;
                    opcionNew = JOptionPane.showOptionDialog(
                            null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Agregar Juguete", "Agregar Cliente", "Agregar Empleado","Agregar proveedor", "Salir"}, "null");
                    switch (opcionNew) {
                        case 0:
                            controlJuguete.crearJuguetes();
                            break;
                        case 1:
                            controlCliente.crearClienteF();
                            break;
                        case 2:
                            controlUser.crearEmpleadoN();
                            break;
                        case 3:
                            controlProveedor.registrarProvedor();
                            break;
                    }
                    break;

                case 1:
                    controlVenta.realizarCompra(controlUser.getService(), controlJuguete.getService());
                    break;
                case 2:
                    controlProveedor.comprar(controlJuguete.getService());
                    break;
                case 3:
                    int opcionExist = 0;
                    opcionExist = JOptionPane.showOptionDialog(
                            null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Aumentar Juguetes", "Disminuir existencias","Salir"}, "null");
                    switch (opcionExist) {
                        case 0:
                            controlJuguete.modificarExistencias();
                            break;
                        case 1:
                            controlJuguete.restarexistencias();
                            break;
                    }
                    break;
                case 4:
                    int opcionInf = 0;
                    opcionInf = JOptionPane.showOptionDialog(
                            null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                            new Object[]{"Juguetes por tipo", "Cantidad total", "Valor total", "Informes detallados", "Mayor valor", "Salir"}, "null");
                    switch (opcionInf) {
                        case 0:
                            controlJuguete.getService().juguetesPorTipo();
                            break;
                        case 1:
                            controlJuguete.getService().informeCantidad();
                            break;
                        case 2:
                            controlJuguete.getService().informeValorTotal();
                            break;
                        case 3:
                            int opcionInfDet = JOptionPane.showOptionDialog(
                                    null, "Ingrese lo que quiere hacer: ", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                                    new Object[]{"Cantidad mayor por tipo", "Cantidad menor por tipo", "Mejor cliente", "Mejor empleado", "Salir"}, "null");
                            switch (opcionInfDet) {
                                case 0:
                                    controlJuguete.getService().informeTipoJuguete();
                                    break;
                                case 1:
                                    controlJuguete.getService().informeTipoJugueteMenor();
                                    break;
                                case 2:
                                    controlCliente.mejorCliente(controlVenta.getSellServiceImpl());
                                    break;
                                case 3:
                                    controlUser.mejorEmpleado(controlVenta.getSellServiceImpl());
                                    break;
                            }
                            break;
                        case 4:
                            controlJuguete.informeFiltroUsuario();
                            break;
                    }
                    break;
            }
        } while (opcion != 4);

    }
}