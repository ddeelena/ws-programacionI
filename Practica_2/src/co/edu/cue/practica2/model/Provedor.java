package co.edu.cue.practica2.model;

public class Provedor {
    private String codigo;
    private String fechaIngreso;
    private String fechaDeEntrega;
    private String material;

    public Provedor(String codigo, String fechaIngreso, String fechaDeEntrega, String material) {
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.fechaDeEntrega = fechaDeEntrega;
        this.material = material;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(String fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
