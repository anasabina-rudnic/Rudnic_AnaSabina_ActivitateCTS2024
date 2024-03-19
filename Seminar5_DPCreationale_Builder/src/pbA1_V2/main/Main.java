package pbA1_V2.main;


import pbA1_V1.clase.Pacient;
import pbA1_V1.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new PacientBuilder().setPatRabatabil(true).build();

        System.out.println(pacient);
    }
}
