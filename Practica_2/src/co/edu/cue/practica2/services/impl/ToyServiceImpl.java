package co.edu.cue.practica2.services.impl;

import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.services.Toy;

import javax.swing.*;


public class ToyServiceImpl implements Toy {

    private  Juguete toys[] = new Juguete[5];
    int contadorJuguete = 1;

    public ToyServiceImpl(Juguete[] toys) {
        this.toys = toys;
    }

    public Juguete[] getToys() {
        return toys;
    }

    public void setToys(Juguete[] toys) {
        this.toys = toys;
    }


    public ToyServiceImpl() {

    }

    public void prueba(){
        Juguete juguete = new Juguete("hola",3000,2,"Plastico");
        toys[0]=juguete;
    }
    @Override
    public Juguete crearJuguete(String nombre, double precio, int cantidad, String material) {
        toys[contadorJuguete]=new Juguete(nombre, precio, cantidad, material);
        contadorJuguete++;
        return null;
    }

    public Juguete modificarExistencia( int cantidades, String nombre) {
        for (Juguete toy : toys) {
            if (String.valueOf(toy) != "null" && nombre.equals(toy.getNombre())) {
                toy.setCantidad(cantidades + toy.getCantidad());
                JOptionPane.showMessageDialog(null, "Quedaron " + toy.getCantidad() + " cantidades");
            }
        }
        return null;
    }


    public Juguete juguetesPorTipo() {
        int contadorPlastico = 0;
        int contadorTela = 0;
        int contadorElectronico = 0;

        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                if ("Plastico".equals(juguete.getMaterial())) {
                    contadorPlastico += juguete.getCantidad();
                }
                if ("Tela".equals(juguete.getMaterial())) {
                    contadorTela += juguete.getCantidad();
                }
                if ("Electronico".equals(juguete.getMaterial())) {
                    contadorElectronico += juguete.getCantidad();
                }
            }
        }
        JOptionPane.showMessageDialog(null,
                "Según el material hay: \n" +
                        "Hay " + contadorPlastico + " Juguetes de plastico \n" + "Hay " + contadorTela + " Juguetes de tela\n" +
                        "Hay " + contadorElectronico + " Juguetes Electronicos"
        );

        return null;
    }

    public Juguete informeCantidad() {
        int cantidadDeJuguetes = 0;
        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                cantidadDeJuguetes += juguete.getCantidad();
            }
        }
        JOptionPane.showMessageDialog(null, "En la tienda hay: \n" +
                cantidadDeJuguetes + " Juguetes en total");
        return null;
    }

    public Juguete informeValorTotal() {
        int contadorPrecio = 0;
        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                contadorPrecio += juguete.getPrecio();
            }
        }
        JOptionPane.showMessageDialog(null, "El valor total de todos los juguetes que hay en la tienda es de: \n" +
                contadorPrecio);
        return null;
    }

    public Juguete informeTipoJuguete() {
        int contadorPlastico = 0;
        int contadorTela = 0;
        int contadorElectronico = 0;
        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                if ("Plastico".equals(juguete.getMaterial())) {
                    contadorPlastico += juguete.getCantidad();
                }
                if ("Tela".equals(juguete.getMaterial())) {
                    contadorTela += juguete.getCantidad();
                }
                if ("Electronico".equals(juguete.getMaterial())) {
                    contadorElectronico += juguete.getCantidad();
                }
            }
        }
        if (contadorPlastico > contadorTela && contadorPlastico > contadorElectronico) {
            JOptionPane.showMessageDialog(null, "El material Plastico tiene más juguetes");
        }
        if (contadorTela > contadorPlastico && contadorTela > contadorElectronico) {
            JOptionPane.showMessageDialog(null, "El material Tela tiene más juguetes");
        }
        if (contadorElectronico > contadorPlastico && contadorElectronico > contadorTela) {
            JOptionPane.showMessageDialog(null, "El material Electronico tiene más juguetes");
        }


        return null;
    }

    public Juguete informeTipoJugueteMenor() {
        int contadorPlastico = 0;
        int contadorTela = 0;
        int contadorElectronico = 0;
        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                if ("Plastico".equals(juguete.getMaterial())) {
                    contadorPlastico += juguete.getCantidad();
                }
                if ("Tela".equals(juguete.getMaterial())) {
                    contadorTela += juguete.getCantidad();
                }
                if ("Electronico".equals(juguete.getMaterial())) {
                    contadorElectronico += juguete.getCantidad();
                }
            }
        }
        if (contadorPlastico < contadorTela && contadorPlastico < contadorElectronico) {
            JOptionPane.showMessageDialog(null, "El material Plastico tiene menos juguetes");
        }
        if (contadorTela < contadorPlastico && contadorTela < contadorElectronico) {
            JOptionPane.showMessageDialog(null, "El material Tela tiene menos juguetes");
        }
        if (contadorElectronico < contadorPlastico && contadorElectronico < contadorTela) {
            JOptionPane.showMessageDialog(null, "El material Electronico tiene menos juguetes");
        }
        return null;
    }

    public Juguete informeFiltroUsuario(double precioUsuario) {
        //String arregloJuguetes[];
        for (Juguete juguete : toys) {
            if (String.valueOf(juguete) != "null") {
                if(precioUsuario<=juguete.getPrecio()){
                    JOptionPane.showMessageDialog(null,"Los juguetes con un valor mayor a: "+precioUsuario+"son: \n"
                    +juguete.getNombre() +" y su precio es: "+juguete.getPrecio());
                }
            }
        }
        return null;
    }

}