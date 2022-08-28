package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.*;
import co.edu.cue.practica2.services.Sell;

import javax.swing.*;

public class SellServiceImpl implements Sell {
    private Venta[] ventas = new Venta[4];
    private Detalle[] detalle = new Detalle[4];
    int contadorVenta = 0;
    int contadordetalle = 0;

    public Venta[] getVentas() {
        return ventas;
    }


    public SellServiceImpl() {

    }


    @Override
    public void comprar(Juguete[] juguete, Cliente nombreUsuario, Empleado nombreVendedor, int canti, String diasSolicitado,ToyServiceImpl service) {
        String cadena ="Los juguetes existentes son: \n";
        for(Juguete toy : juguete){
            if(String.valueOf(toy)!="null"){
                cadena += "Nombre: "+ toy.getNombre()+" Precio: "+toy.getPrecio();
            }
        }
        for (int i = 0; i < canti; i++) {
            String nombrejuguete = JOptionPane.showInputDialog(cadena+"\n ingrese el nombre del juguete que desea comprar");
            for (Juguete toy : juguete) {
                if (String.valueOf(toy)!= "null" && nombrejuguete.equals(toy.getNombre())) {
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanta cantidad de este juguete desea comprar"));
                    Detalle detail = new Detalle(cantidad, toy);
                    detalle[contadordetalle] = detail;
                    contadordetalle++;
                    service.modificarExistencia(-cantidad,toy.getNombre());
                }
            }
        }
        if(detalle.length==0 && detalle[0]==null){
            JOptionPane.showMessageDialog(null,"No se pudo realizar la compra, revise que haya ingresado bien ek nombre del juguete");
        }else {
            Venta venta = new Venta(detalle, nombreUsuario, nombreVendedor,diasSolicitado);
            ventas[contadorVenta]=venta;
            contadorVenta++;
            System.out.println("Cliente: " + nombreUsuario.getNombre() + "\n Vendedor: " + nombreVendedor.getNombre());
            imprimirVenta(venta);
        }
    }

    @Override
    public void imprimir(co.edu.cue.practica2.services.Venta ventas) {

    }


    public void imprimirVenta(Venta venta){
        double total =0;
        double descuento =0;
        for (int i=0;i<venta.getDetalle().length;i++){
            if(venta.getDetalle()[i] != null){
                System.out.println("\n JUGUETE: "+venta.getDetalle()[i].getJuguete().getNombre());
                if(venta.getDetalle()[i].getJuguete().getMaterial().equals("Plastico")){
                    System.out.println("MATERIAL: Plastico \n Este material requiere");
                } else if (venta.getDetalle()[i].getJuguete().getMaterial().equals("Tela")) {
                    System.out.println("MATERIAL: Tela \n Este material no se puede mojar");
                } else if (venta.getDetalle()[i].getJuguete().getMaterial().equals("Electronico")) {
                    System.out.println("MATERIAL: Electronico \n No requiere");
                }
                System.out.println("\n Cantidad "+venta.getDetalle()[i].getCantidad());
                total += venta.getDetalle()[i].getSubtotal();
                System.out.println("Subtotal: "+total);
                descuento+=(Math.random()*(venta.getDetalle()[i].getSubtotal() - 1000+1)+1000);
            }
        }
        total=total-descuento;
        System.out.println("Obtuvo un descuento de: "+descuento+"\n El total a pagar es: "+total);
    }
}


