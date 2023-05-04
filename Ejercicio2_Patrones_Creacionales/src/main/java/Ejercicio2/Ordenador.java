package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

class Ordenador {
    private Componente unidadCentral;
    private DispositivoEntrada dispositivoEntrada;
    private DispositivoSalida dispositivoSalida;
    private List<Componente> perifericos;

    private Ordenador() {
        perifericos = new ArrayList<>();
    }

    public static class Builder {
        private Ordenador ordenador;

        public Builder() {
            ordenador = new Ordenador();
        }

        public Builder conUnidadCentral(Componente unidadCentral) {
            ordenador.unidadCentral = unidadCentral;
            return this;
        }

        public Builder conDispositivoEntrada(DispositivoEntrada dispositivoEntrada) {
            ordenador.dispositivoEntrada = dispositivoEntrada;
            return this;
        }

        public Builder conDispositivoSalida(DispositivoSalida dispositivoSalida) {
            ordenador.dispositivoSalida = dispositivoSalida;
            return this;
        }

        public Builder conPeriferico(Componente periferico) {
            ordenador.perifericos.add(periferico);
            return this;
        }

        public Ordenador build() {
            if (ordenador.unidadCentral == null || ordenador.dispositivoEntrada == null || ordenador.dispositivoSalida == null) {
                throw new IllegalStateException("construir un ordenador.");
            }
            return ordenador;
        }
    }
    public double calcularPrecio() {
        double precioTotal = unidadCentral.getPrecio() + dispositivoEntrada.getPrecio() + dispositivoSalida.getPrecio();
        for (Componente periferico : perifericos) {
            precioTotal += periferico.getPrecio();
        }
        return precioTotal;
    }
}
