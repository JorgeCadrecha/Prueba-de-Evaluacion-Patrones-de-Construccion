package Ejerciciov2;

import java.util.ArrayList;
import java.util.List;

public class BaseCompuesta extends Base {
    private List<Base> bases;

    public BaseCompuesta(String nombre) {
        super(nombre);
        bases = new ArrayList<>();
    }

    public void addBase(Base base) {
        bases.add(base);
    }

    public void removeBase(Base base) {
        bases.remove(base);
    }

    @Override
    public int getNumeroDeAmbulancias() {
        int totalAmbulancias = 0;
        for (Base base : bases) {
            totalAmbulancias += base.getNumeroDeAmbulancias();
        }
        return totalAmbulancias;
    }

    @Override
    public double getTiempoMedioDeAsistencia() {
        double tiempoTotal = 0;
        for (Base base : bases) {
            tiempoTotal += base.getTiempoMedioDeAsistencia();
        }
        return tiempoTotal / bases.size();
    }
}

