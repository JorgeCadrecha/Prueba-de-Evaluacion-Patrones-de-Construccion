package Ejerciciov2;

public class Main {
    public static void main(String[] args) {
        // Crear bases simples
        Base baseVillanueva = new BaseBuilder("Villanueva de la Cañada")
                .setNumeroDeAmbulancias(5)
                .setTiempoMedioDeAsistencia(30)
                .setEsCompuesta(false)
                .build();

        Base baseAlcobendas = new BaseBuilder("Alcobendas")
                .setNumeroDeAmbulancias(8)
                .setTiempoMedioDeAsistencia(25)
                .setEsCompuesta(false)
                .build();

        Base basePuertaDeHierro = new BaseBuilder("Hospital Clínico Universitario Puerta de Hierro")
                .setNumeroDeAmbulancias(10)
                .setTiempoMedioDeAsistencia(20)
                .setEsCompuesta(false)
                .build();

        // Crear base compuesta
        Base baseMajadahonda = new BaseBuilder("Majadahonda")
                .setEsCompuesta(true)
                .build();

        // Añadir bases simples a la base compuesta
        BaseCompuesta compuestaMajadahonda = (BaseCompuesta) baseMajadahonda;
        compuestaMajadahonda.addBase(basePuertaDeHierro);
        compuestaMajadahonda.addBase(baseAlcobendas);

        // Imprimir información de las bases
        System.out.println(baseVillanueva);
        System.out.println(baseAlcobendas);
        System.out.println(basePuertaDeHierro);
        System.out.println(baseMajadahonda);
    }
}

