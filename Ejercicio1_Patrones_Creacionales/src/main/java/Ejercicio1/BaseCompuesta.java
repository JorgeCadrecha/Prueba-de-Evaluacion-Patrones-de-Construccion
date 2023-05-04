package Ejercicio1;

public class BaseCompuesta implements Base{


    public BaseCompuesta(String nombre) {

    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public int getNumeroAmbulancias() {
        return 0;
    }

    @Override
    public double getTiempoMedioAsistencia() {
        return 0;
    }

    public void agregarBase(Base basePuertaDeHierro) {

    }
}
