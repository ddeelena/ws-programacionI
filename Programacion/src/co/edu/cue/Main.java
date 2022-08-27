package co.edu.cue;
import javax.swing.*;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Objeto>listadeObjetos=new ArrayList<>();
        Objeto objeto1=new Objeto("1111","Televisor",5,"disponible",30000);
        Objeto objeto2=new Objeto("2222","Lavadora",3,"disponible",50000);
        Objeto objeto3=new Objeto("3333","Pc",10,"disponible",45000);
        listadeObjetos.add(objeto1);
        listadeObjetos.add(objeto2);
        listadeObjetos.add(objeto3);

        List<Empleado>listadempleados=new ArrayList<>();
        Empleado empleado1=new Empleado("1212","Fernando","Fercho@gmail.com",3);
        Empleado empleado2=new Empleado("1313","Mariana","Marian@gmail.com",2);
        Empleado empleado3=new Empleado("1414","Lisardo","Lisardo@gmail.com",10);
        listadempleados.add(empleado1);
        listadempleados.add(empleado2);
        listadempleados.add(empleado3);

/*        List<Prestamo>listaPrestamos=new ArrayList<>();
        Prestamo prestamo1=new Prestamo("9898",12,12);
        Prestamo prestamo2=new Prestamo("7676",4,4);
        Prestamo prestamo3=new Prestamo("5454",7,7);
        listaPrestamos.add*/


        List<Cliente>listadeclientes=new ArrayList<>();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Presione "+"\n"+"1: Para crear un empleado"+"\n"+
                "2: para crear un cliente"+"\n"+"3: para crear un objeto"+"\n"+"4: para consultar los datos de un objeto"));
         //int opcion = Integer.parseInt(JOptionPane.showInputDialog(Presione "+"\n"+"1: Para crear un empleado"+"\n"+));
        switch (opcion) {
            case 1:
                if(listadempleados.size()<3){
                    String code=JOptionPane.showInputDialog("Ingresa tu codigo");
                    String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
                    String correo=JOptionPane.showInputDialog("Ingresa tu nombre");
                    int añosant =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de años"));

                    Empleado empleado=new Empleado(code,nombre,correo,añosant);
                }
            case 2:
                if(listadeclientes.size()<2){
                    String nombre=JOptionPane.showInputDialog("Ingresa el nombre");
                    String gender=JOptionPane.showInputDialog("Ingresa F si eres Mujer, M si eres hombre");
                    String Typedocument=JOptionPane.showInputDialog("Ingresa PP si es Pasaporte o CC si es cedula");
                    String Document=JOptionPane.showInputDialog("Ingresa tu numero de documento");
                    String city=JOptionPane.showInputDialog("Ingresa el nombre de tu ciudad");

                    Cliente cliente = new Cliente(Document,Typedocument,nombre,gender,city);
                    listadeclientes.add(cliente);
                }
                else {
                    JOptionPane.showMessageDialog(null,"lo siento no podemos aceptar mas clientes");
                }
            case 3:
                if(listadeObjetos.size()<3) {
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                    String codigo = JOptionPane.showInputDialog("Ingresa el codigo del objeto");
                    String estado = JOptionPane.showInputDialog("Ingresa el estado del objeto");
                    double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el precio que va tener el objeto"));

                }
            case 4:
                String code=JOptionPane.showInputDialog("Ingresa tu codigo");
                int contador =0;
                for(int i=0;i<listadeObjetos.size();i++){
                    if(code.equals(listadeObjetos.get(i).getCodigo())){
                        System.out.println("El objeto consultado es:"+
                                "\n"+"Nombre:"+ listadeObjetos.get(i).getNombre()+"\n"+"Precio:"+listadeObjetos.get(i).getPrecio()+"\n"+
                                "Estado:"+listadeObjetos.get(i).getEstado());
                        break;
                    }else {
                        JOptionPane.showMessageDialog(null, "No existe ese codigo");
                        break;
                    }
                }
            case 5:
                String objetoAconsultar = JOptionPane.showInputDialog("Ingresa el nombre del objeto");
                int cantidad =0;
                Prestamo prestamo = new Prestamo();
                for (int i=0; i<3;i++){
                    if(objetoAconsultar.equals(prestamo.getDetalle().getObjeto())){
                        cantidad++;
                    }
                }
                System.out.println("El objeto esta incluido "+cantidad+" veces en los prestamos");
        }
    }
}
