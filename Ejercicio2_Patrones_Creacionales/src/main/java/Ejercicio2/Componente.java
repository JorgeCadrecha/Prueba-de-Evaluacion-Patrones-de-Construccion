package Ejercicio2;

class Componente {
    protected String fabricante;
    protected String modelo;
    protected double precio;

    public Componente(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
