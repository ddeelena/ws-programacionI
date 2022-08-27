package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Sell;

import javax.swing.*;
import java.util.Arrays;

public class SellServiceImpl implements Sell {
    private Venta[] ventas = new Venta[4];
    private Detalle[] detalle = new Detalle[4];
    int contadorVenta = 0;
    int contadordetalle = 0;

    public Venta[] getVentas() {
        return ventas;
    }

    public SellServiceImpl(Detalle[] detalle, int contadorVenta) {
        this.detalle = detalle;
        this.contadorVenta = contadorVenta;
    }

    public SellServiceImpl() {

    }


    @Override
    public co.edu.cue.practica2.services.Venta comprar(Juguete[] juguete, Cliente nombreUsuario, Empleado nombreVendedor, String nombreJuguete, int canti, int diasSolicitado) {
        for (int i = 0; i < canti; i++) {
            String nombrejuguete = JOptionPane.showInputDialog("ingrese el nombre del juguete que desea comprar");
            for (Juguete toy : juguete) {
                if (String.valueOf(toy) != "null" && nombrejuguete.equals(toy.getNombre())) {
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanta cantidad de este juguete desea comprar"));
                    Detalle detail = new Detalle(cantidad, toy);
                    detalle[contadordetalle] = detail;
                    contadordetalle++;
                }
            }
        }
        Venta venta = new Venta(detalle, nombreUsuario, nombreVendedor);
        System.out.println("Cliente: " + nombreUsuario.getNombre() + "\n Vendedor" + nombreVendedor.getNombre());
        return null;
    }
    public void imprimirVenta(Venta venta){
        for (Venta venta1: venta){

        }
    }
}


