package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Empleado;
import co.edu.cue.practica2.model.Cliente;
import co.edu.cue.practica2.model.Provedor;
import co.edu.cue.practica2.model.Venta;
import co.edu.cue.practica2.services.Usuario;

import javax.swing.*;

public class UsuarioServiceImpl implements Usuario {
    private Empleado[] empleados = new Empleado[5];
    int contadorEmpleado = 0;
    private Cliente[] cliente = new Cliente[20];
    int contadorCliente = 0;

    //Aqui

    public Empleado[] getEmpleados() {
        return empleados;
    }


    public Cliente[] getCliente() {
        return cliente;
    }



    public UsuarioServiceImpl() {

    }

    public void prueba1() {
        Empleado empleado = new Empleado("laura", "456", "3444", "dddd", "2", "23333");
        empleados[0] = empleado;
        Cliente cliente1 = new Cliente("laura", "123", "33", "hdjd", "3", "djje");
        cliente[0] = cliente1;
    }

    @Override
    public void crearCliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email) {
        for(int i=0; i<cliente.length;i++){
            if(cliente[i]==null){
                cliente[i] = new Cliente(nombre, cedula, telefono, direccion, cumpleaños, email);
                JOptionPane.showMessageDialog(null,"Se agrego al proveedro con exito");
            }else{
                if(i==cliente.length-1){
                    JOptionPane.showMessageDialog(null,"No se puede agregar más clientes");
                }
            }
        }

    }

    @Override
    public void crearEmpleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario) {
        for(int i=0; i<empleados.length;i++){
            if(empleados[i]==null){
                empleados[i] = new Empleado(nombre,cedula,telefono,direccion,experiencia,salario);
                JOptionPane.showMessageDialog(null,"Se agrego al proveedro con exito");
            }else{
                if(i==empleados.length-1){
                    JOptionPane.showMessageDialog(null,"No se puede agregar más empleados");
                }
            }
        }
    }

    @Override
    public Empleado buscarEmpleado() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento del empleado de la venta");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getCedula().equalsIgnoreCase(documento)) {
                System.out.println("empleado" + empleados[i]);
                return empleados[i];
            }else{
                JOptionPane.showMessageDialog(null,"No existe este empleado, verifique que lo ingreso correctamente");
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
            }else{
                JOptionPane.showMessageDialog(null,"No existe este cliente");
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
                //System.out.println(venta.getCliente());
                if(String.valueOf(client) != "null"){
                    if(String.valueOf(venta) !="null"){
                        if (venta.getCliente().getNombre()==client.getNombre()) {
                            if (contador < venta.getDetalle().length) {
                                usuario = client.getNombre();
                            }
                        }
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
                if (String.valueOf(trabajador) != "null") {
                    if (String.valueOf(venta) != "null") {
                        if (trabajador.getNombre() == venta.getEmpleado().getNombre()) {
                            contadorEmpleado++;

                        }
                    }

                }
            }
            if (contadorMejorEmpleado < contadorEmpleado) {
                contadorMejorEmpleado = contadorEmpleado;
                empleado=trabajador.getNombre();
            }
            contadorEmpleado=0;
        }
        JOptionPane.showMessageDialog(null, "El mejor empleado  es: " + empleado);
    }
}
