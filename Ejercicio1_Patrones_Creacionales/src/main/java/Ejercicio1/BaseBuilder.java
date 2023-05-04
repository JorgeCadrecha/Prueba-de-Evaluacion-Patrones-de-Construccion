package Ejercicio1;

public abstract class BaseBuilder {

    protected String nombre;

    public BaseBuilder setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public abstract Base build();

    public BaseIndividualBuilder setNumeroAmbulancias(int i) {
        return null;
    }
}
