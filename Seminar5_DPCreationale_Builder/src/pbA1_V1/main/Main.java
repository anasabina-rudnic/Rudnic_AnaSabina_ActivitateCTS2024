package pbA1_V1.main;

import pbA1_V1.clase.Pacient;
import pbA1_V1.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder().setPatRabatabil(true).setMicDejunInclus(true).setPapuciDeCamera(true).setHalatPentruInterior(true).build();
        Pacient pacient2 = new PacientBuilder().setPatRabatabil(true).build();

        System.out.println(pacient1);
        System.out.println(pacient2);
    }
}
