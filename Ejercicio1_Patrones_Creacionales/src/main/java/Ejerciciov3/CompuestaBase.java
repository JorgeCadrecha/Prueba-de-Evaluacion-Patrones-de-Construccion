package Ejerciciov3;

import java.util.ArrayList;
import java.util.List;

public class CompuestaBase implements Base {
    private String nombre;
    private List<Base> bases;

    public CompuestaBase(String nombre) {
        this.nombre = nombre;
        bases = new ArrayList<>();
    }

    public void addBase(Base base) {
        bases.add(base);
    }

    public void removeBase(Base base) {
        bases.remove(base);
    }

    @Override
    public String getNombre() {
        return nombre;
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

