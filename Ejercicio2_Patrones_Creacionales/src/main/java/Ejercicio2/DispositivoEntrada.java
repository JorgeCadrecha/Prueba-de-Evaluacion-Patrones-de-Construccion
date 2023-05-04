package Ejercicio2;

import java.util.List;

abstract class DispositivoEntrada extends Componente {
    protected String conector;
    protected List<Integer> puertosValidos;

    public DispositivoEntrada(String fabricante, String modelo, double precio, String conector, List<Integer> puertosValidos) {
        super(fabricante, modelo, precio);
        this.conector = conector;
        this.puertosValidos = puertosValidos;
    }
}