package co.edu.cue.practica2.controllers;

import co.edu.cue.practica2.model.Juguete;
import co.edu.cue.practica2.model.Material;
import co.edu.cue.practica2.services.impl.ToyServiceImpl;

import javax.swing.*;

public class ControlJuguete {

    ToyServiceImpl toyService = new ToyServiceImpl();


    public ToyServiceImpl getService() {
        return toyService;
    }


    public void crearJuguetes() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del juguete");
        double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del juguete"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de juguetes"));
        int material = Integer.parseInt(JOptionPane.showInputDialog("Escoja 1 para juguetes de plastico" + "\n" + " escoja 2 para juguetes electronicos" + "\n" + "Escoja 3 para juguetes de tela"));
        switch (material){
            case 1:
                 toyService.crearJuguete(nombre,precio,cantidad,Material.plastico);
                break;

            case 2:
                 toyService.crearJuguete(nombre,precio,cantidad,Material.electronico);

                break;
            case 3:
                toyService.crearJuguete(nombre,precio,cantidad,Material.tela);
                break;
        }

    }

    public void modificarExistencias(){
        int cantidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las cantidades que desea añadir o restar"+"\n"+"Ingrese la cantidad con un menos si desea restar"));
        String nombre = JOptionPane.showInputDialog("Que juguete desea modificar");
        toyService.modificarExistencia(cantidades,nombre);
    }

    public void informeFiltroUsuario(){
        double precioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su presupuesto"));
       toyService.informeFiltroUsuario(precioUsuario);
    }

    public void informeTipoJugueteMenor(){
        toyService.informeTipoJugueteMenor();
    }
    public void informeTipoJuguete(){
        toyService.informeTipoJuguete();
    }
    public void informeValorTotal(){
        toyService.informeValorTotal();
    }
    public  void juguetesPorTipos(){
        toyService.juguetesPorTipo();
    }
}


