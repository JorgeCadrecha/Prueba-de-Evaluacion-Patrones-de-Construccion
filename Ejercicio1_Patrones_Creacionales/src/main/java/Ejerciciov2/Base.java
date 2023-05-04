package Ejerciciov2;

public abstract class Base {
    protected String nombre;
    protected int numeroDeAmbulancias;
    protected double tiempoMedioDeAsistencia;

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getNumeroDeAmbulancias();
    public abstract double getTiempoMedioDeAsistencia();

    @Override
    public String toString() {
        return "Base - " + nombre  + " tiene " + numeroDeAmbulancias + " ambulancias y tiene un tiempo de asistencia de: " + tiempoMedioDeAsistencia ;
    }
}

