package Ejercicio2;

import java.util.List;

class Teclado extends DispositivoEntrada {
    public Teclado(String fabricante, String modelo, double precio, String conector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio, conector, puertosValidos);
    }
}