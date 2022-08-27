package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.Juguete;

public interface Toy {
    public abstract Juguete crearJuguete(String nombre, double precio, int cantidad,String material);
    public abstract Juguete modificarExistencia(int cantidad, String nombre);
    public abstract Juguete juguetesPorTipo();
    public abstract Juguete informeValorTotal();
    public abstract Juguete informeTipoJuguete();
    public abstract Juguete informeTipoJugueteMenor();

}

