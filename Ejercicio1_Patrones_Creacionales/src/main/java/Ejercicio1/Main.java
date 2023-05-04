package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Base baseVillanueva = new BaseIndividualBuilder()
                .setNombre("Villanueva de la Cañada")
                .setNumeroAmbulancias(5)
                .setTiempoMedioAsistencia(30)
                .build();

        Base baseAlcobendas = new BaseIndividualBuilder()
                .setNombre("Alcobendas")
                .setNumeroAmbulancias(3)
                .setTiempoMedioAsistencia(25)
                .build();

        Base basePuertaDeHierro = new BaseIndividualBuilder()
                .setNombre("Hospital Clínico Universitario Puerta de Hierro")
                .setNumeroAmbulancias(4)
                .setTiempoMedioAsistencia(28)
                .build();

        Base baseMajadahonda = new BaseCompuestaBuilder()
                .setNombre("Majadahonda")
                .build();

        ((BaseCompuesta) baseMajadahonda).agregarBase(basePuertaDeHierro);
        ((BaseCompuesta) baseMajadahonda).agregarBase(baseAlcobendas);

        // ...
    }
}