package Ejercicio2;

import java.util.List;

class ImpresoraLaser extends DispositivoSalida {
    private String tipoCartucho;
    private int numPaginasDesdeCambio;

    public ImpresoraLaser(String fabricante, String modelo, double precio, List<Integer> puertosValidos, String tipoCartucho) {
        super(fabricante, modelo, precio, puertosValidos);
        this.tipoCartucho = tipoCartucho;
        this.numPaginasDesdeCambio = 0;
    }
}
