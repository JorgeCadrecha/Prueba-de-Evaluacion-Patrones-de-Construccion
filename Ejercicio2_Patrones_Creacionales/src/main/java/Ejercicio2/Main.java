package Ejercicio2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear componentes
        Componente unidadCentral = new Componente("Intel", "Core i7", 300);
        DispositivoEntrada teclado = new Teclado("Logitech", "G Pro", 100, "USB", Arrays.asList(1, 2, 3));
        DispositivoSalida pantalla = new Pantalla("Dell", "UltraSharp", 200, Arrays.asList(1, 2, 3));
        ImpresoraLaser impresoraLaser = new ImpresoraLaser("HP", "LaserJet Pro", 150, Arrays.asList(1, 2, 3), "HP 26A");

        // Construir ordenador utilizando el patrón Builder
        Ordenador ordenador = new Ordenador.Builder()
                .conUnidadCentral(unidadCentral)
                .conDispositivoEntrada(teclado)
                .conDispositivoSalida(pantalla)
                .conPeriferico(impresoraLaser)
                .build();

        // Calcular y mostrar el precio del ordenador
        double precio = ordenador.calcularPrecio();
        System.out.println("El precio del ordenador es: " + precio);
    }
}
