package Ejerciciov2;

public class BaseSimple extends Base {

    public BaseSimple(String nombre, int numeroDeAmbulancias, double tiempoMedioDeAsistencia) {
        super(nombre);
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        this.tiempoMedioDeAsistencia = tiempoMedioDeAsistencia;
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

