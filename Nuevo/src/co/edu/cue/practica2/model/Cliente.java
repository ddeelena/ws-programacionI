package co.edu.cue.practica2.model;

public class Cliente extends Usuario{

    private String cumpleaños;
    private String email;

    public Cliente(String nombre, String cedula, String telefono, String direccion, String cumpleaños, String email) {
        super(nombre, cedula, telefono, direccion);
        this.cumpleaños=cumpleaños;
        this.email=email;
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
