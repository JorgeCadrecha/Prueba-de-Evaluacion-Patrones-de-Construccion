package Ejerciciov3;

public class SimpleBase implements Base {
    private String nombre;
    private int numeroDeAmbulancias;
    private double tiempoMedioDeAsistencia;

    public SimpleBase(String nombre, int numeroDeAmbulancias, double tiempoMedioDeAsistencia) {
        this.nombre = nombre;
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        this.tiempoMedioDeAsistencia = tiempoMedioDeAsistencia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumeroDeAmbulancias() {
        return numeroDeAmbulancias;
    }

    @Override
    public double getTiempoMedioDeAsistencia() {
        return tiempoMedioDeAsistencia;
    }
}

