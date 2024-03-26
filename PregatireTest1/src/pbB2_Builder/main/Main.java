package pbB2_Builder.main;


import pbB2_Builder.clase.Rezervare;
import pbB2_Builder.clase.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder().build();
        Rezervare rezervare2 = new RezervareBuilder().setAsezareLaGeam(true).setScauneErgonomice(true).setDecorareaMesei(true).setMuzicaAmbientalaPersonalizata(true).setGenMuzica(true).build();
        Rezervare rezervare3 = new RezervareBuilder().setGenMuzica(true).build();

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
    }
}
