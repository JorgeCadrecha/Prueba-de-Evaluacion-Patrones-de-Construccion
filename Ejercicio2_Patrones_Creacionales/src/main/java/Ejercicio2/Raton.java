package Ejercicio2;

import java.util.List;

class Raton extends DispositivoEntrada {
    public Raton(String fabricante, String modelo, double precio, String conector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio, conector, puertosValidos);
    }
}
