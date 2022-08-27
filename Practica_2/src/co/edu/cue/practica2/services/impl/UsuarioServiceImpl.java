package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.model.Venta;
import co.edu.cue.practica2.services.Usuario;

import javax.swing.*;

public class UsuarioServiceImpl implements Usuario {
    private Empleado[] empleados = new Empleado[5];
    int contadorEmpleado = 0;
    private Cliente[] cliente = new Cliente[2];
    int contadorCliente = 0;

    //Aqui

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public UsuarioServiceImpl(Empleado[] empleados, int contadorEmpleado, Cliente[] cliente, int contadorCliente) {
        this.empleados = empleados;
        this.contadorEmpleado = contadorEmpleado;
        this.cliente = cliente;
        this.contadorCliente = contadorCliente;
    }

    public UsuarioServiceImpl() {

    }

    public void prueba1() {
        Empleado empleado = new Empleado("laura", "334", "3444", "dddd", "2", "23333");
        empleados[0] = empleado;
        Cliente cliente1 = new Cliente("laura", "34673", "33", "hdjd", "3", "djje");
        cliente[0] = cliente1;
    }

    @Override
    public Cliente crearCliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email) {
        cliente[contadorCliente] = new Cliente(nombre, cedula, telefono, direccion, cumpleaños, email);
        contadorCliente++;
        return null;

    }

    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario) {
        empleados[contadorEmpleado] = new Empleado(nombre, cedula, telefono, direccion, experiencia, salario);
        contadorEmpleado++;
        return null;
    }

    @Override
    public Empleado buscarEmpleado() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del empleado de la venta");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getCedula().equalsIgnoreCase(documento)) {
                System.out.println("empleado" + empleados[i]);
                return empleados[i];
            }
        }
        return null;
    }

    @Override
    public Cliente buscarCliente() {
        prueba1();
        String documento = JOptionPane.showInputDialog("Ingrese el documento del cliente de la venta");
        for (int i = 0; i < cliente.length; i++) {

            if (cliente[i].getCedula().equalsIgnoreCase(documento)) {

                return cliente[i];
            }
        }
        return null;
    }

    public void clienteConMasCompras(Venta[] ventas) {
        prueba1();
        int contador = 0;
        String usuario = "";
        for (Cliente client : cliente) {
            for (Venta venta : ventas) {
                if (venta.getCliente().equals(client)) {
                    if (contador < venta.getDetalle().length) {
                        usuario = client.getNombre();
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El cliente con mas compras es: " + usuario);
    }
    public void mejorVendedor(Venta[] ventas) {
        prueba1();
        int contadorEmpleado = 0;
        int contadorMejorEmpleado =0;
        String empleado = "";
        for (Empleado trabajador : empleados) {
            for (Venta venta : ventas) {
                if (trabajador.equals(venta.getEmpleado())) {
                    contadorEmpleado++;
                }
            }
            if(contadorMejorEmpleado<contadorEmpleado){
                contadorMejorEmpleado =contadorEmpleado;
            }
        }
        JOptionPane.showMessageDialog(null, "El mejor empleado  es: " + empleado);
    }
}
