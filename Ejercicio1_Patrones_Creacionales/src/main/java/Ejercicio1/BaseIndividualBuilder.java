package Ejercicio1;

public class BaseIndividualBuilder extends  BaseBuilder {

    private int numeroAmbulancias;

    private double tiempoMedioAsistencia;

    public BaseIndividualBuilder setNumeroAmbulancias(int numeroAmbulancias){
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    public BaseIndividualBuilder setTiempoMedioAsistencia(double tiempoMedioAsistencia){
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    @Override
    public Base build(){
        return new BaseIndividual(this.nombre, this.numeroAmbulancias, this.tiempoMedioAsistencia);
    }
}
