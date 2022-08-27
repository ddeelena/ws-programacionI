package co.edu.cue.practica2.model;

public class Empleado extends Usuario{



    private String experiencia;
    private String salario;

    public Empleado(String nombre, String cedula, String telefono, String direccion, String experiencia, String salario){
        super(nombre, cedula, telefono, direccion);
        this.experiencia=experiencia;
        this.salario= salario;

    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
