package Ejerciciov3;

public class Main {
    public static void main(String[] args) {
        // Crear bases simples
        Base baseVillanueva = new SimpleBase("Villanueva de la Cañada", 5, 30);
        Base baseAlcobendas = new SimpleBase("Alcobendas", 8, 25);
        Base basePuertaDeHierro = new SimpleBase("Hospital Clínico Universitario Puerta de Hierro", 10, 20);

        // Crear base compuesta
        CompuestaBase baseMajadahonda = new CompuestaBase("Majadahonda");

        // Añadir bases simples a la base compuesta
        baseMajadahonda.addBase(basePuertaDeHierro);
        baseMajadahonda.addBase(baseAlcobendas);

        // Imprimir información de las bases
        System.out.println("Base - " + baseVillanueva.getNombre() );
        System.out.println("Número de ambulancias: " + baseVillanueva.getNumeroDeAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseVillanueva.getTiempoMedioDeAsistencia());

        System.out.println("\nBase - " + baseAlcobendas.getNombre());
        System.out.println("Número de ambulancias: " + baseAlcobendas.getNumeroDeAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseAlcobendas.getTiempoMedioDeAsistencia());

        System.out.println("\nBase - "  + basePuertaDeHierro.getNombre());
        System.out.println("Número de ambulancias: " + basePuertaDeHierro.getNumeroDeAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + basePuertaDeHierro.getTiempoMedioDeAsistencia());

        System.out.println("\nBase - " + baseMajadahonda.getNombre());
        System.out.println("Número de ambulancias: " + baseMajadahonda.getNumeroDeAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseMajadahonda.getTiempoMedioDeAsistencia());
    }

    @Override
    public String toString() {
        return "Main{" + '}';
    }
}

