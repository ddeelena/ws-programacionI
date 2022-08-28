package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.model.Provedor;
import co.edu.cue.practica2.services.Venta;

import javax.swing.*;

public class ProvedorServiceImpl implements Venta {
    Provedor[] proveedores = new Provedor[5];
    public void realizarCompra(Juguete[] juguetes){
        String cadena ="";
        boolean exist = false;
        if(proveedores.length !=0){
            for (int i=0;i<proveedores.length;i++){
                if(String.valueOf(proveedores[i])!="null"){
                    cadena+="Codigo: "+proveedores[i].getCodigo();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"No hay proveedores registrados");
        }

        String codigoProve = JOptionPane.showInputDialog(cadena +" Ingrese el codigo");
        for(int i=0; i< proveedores.length;i++){
            if(String.valueOf(proveedores[i])!="null" && codigoProve.equals(proveedores[i].getCodigo())){
                String nombreJuguete= JOptionPane.showInputDialog("Ingrse el nombre del juguete que desea comprar");
                for(Juguete toy: juguetes){
                    if(String.valueOf(toy)!="null" && nombreJuguete.equals(toy.getNombre())){
                        int canti = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));
                        JOptionPane.showMessageDialog(null,"Su compar fue realizada con exito");
                        toy.setCantidad(toy.getCantidad());
                        exist=true;
                        System.out.println("Su compra de: "+canti+" de "+nombreJuguete+"fue exitosa"+
                                "\n y tuvo un valor de "+(toy.getPrecio()*canti)+canti*1000);
                    }
                }
                if(exist==false){
                    agregarNuevo(juguetes,nombreJuguete,i);
                }
                break;
            }
        }
    }
    public void GuardarRegistro(String codigo, String fechaINgreso,String qos, String material){
        for(int i=0; i<proveedores.length;i++){
            if(proveedores[i]==null){
                proveedores[i] = new Provedor(codigo,fechaINgreso,qos,material);
                JOptionPane.showMessageDialog(null,"Se agrego el proveedor "+codigo+" con exito");
                //JOptionPane.showMessageDialog(null,proveedores[i].getCodigo());
                break;
            }else{
                if(i== proveedores.length-1){
                    JOptionPane.showMessageDialog(null,"No se puede agregar más proveedores");
                }
                break;
            }
        }
    }
    public void agregarNuevo(Juguete[] juguetes,String nombreJuguete,int j){
        for(int i=0; i<juguetes.length;i++){
            if(juguetes[i]==null){
                double precio=(Math.random()*(7000 - 1000+1)+1000);
                int canti = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a comprar"));
                juguetes[i]= new Juguete(nombreJuguete,precio,canti,proveedores[j].getMaterial());
                System.out.println("Su compra de: "+canti+" de "+nombreJuguete+" fue exitosa \n subtotal de la compra: "+precio
                +"En su tienda quedo con precio de "+precio+1000);
                JOptionPane.showMessageDialog(null,juguetes[i].getNombre());
                break;
            }
        }
    }
}
