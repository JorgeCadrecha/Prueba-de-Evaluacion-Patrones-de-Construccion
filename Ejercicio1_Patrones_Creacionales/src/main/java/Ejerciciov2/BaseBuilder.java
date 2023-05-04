package Ejerciciov2;

public class BaseBuilder {
    private String nombre;
    private int numeroDeAmbulancias;
    private double tiempoMedioDeAsistencia;
    private boolean esCompuesta;

    public BaseBuilder(String nombre) {
        this.nombre = nombre;
    }

    public BaseBuilder setNumeroDeAmbulancias(int numeroDeAmbulancias) {
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        return this;
    }

    public BaseBuilder setTiempoMedioDeAsistencia(double tiempoMedioDeAsistencia) {
        this.tiempoMedioDeAsistencia = tiempoMedioDeAsistencia;
        return this;
    }

    public BaseBuilder setEsCompuesta(boolean esCompuesta) {
        this.esCompuesta = esCompuesta;
        return this;
    }

    public Base build() {
        if (esCompuesta) {
            return new BaseCompuesta(nombre);
        } else {
            return new BaseSimple(nombre, numeroDeAmbulancias, tiempoMedioDeAsistencia);
        }
    }
}


