package Ejercicio2;

import java.util.List;

abstract class DispositivoSalida extends Componente {
    protected List<Integer> puertosValidos;

    public DispositivoSalida(String fabricante, String modelo, double precio, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio);
        this.puertosValidos = puertosValidos;
    }
}