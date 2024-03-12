package pbA3_FactoryMethod.main;

import pbA2_SimpleFactory.clase.PersonalSpital;
import pbA3_FactoryMethod.clase.Medic;
import pbA3_FactoryMethod.clase.fabrica.FabricaAsistent;
import pbA3_FactoryMethod.clase.fabrica.FabricaBrancardier;
import pbA3_FactoryMethod.clase.fabrica.FabricaMedic;
import pbA3_FactoryMethod.clase.fabrica.FabricaPersonal;

public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personalSpital = fabricaPersonal.createPersonalSpital(nume, salariu);

        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {
//        FabricaPersonal fabricaMedic = new FabricaMedic();
//        FabricaPersonal fabricaAsistent = new FabricaAsistent();
//        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();
//
//        PersonalSpital medic = fabricaMedic.createPersonalSpital("Popescu Mihai", 12000);
//        PersonalSpital asistent = fabricaAsistent.createPersonalSpital("Ionescu Ana", 5000);
//        PersonalSpital brancardier = fabricaBrancardier.createPersonalSpital("Vasilescu Marian", 3500);
//
//        medic.afisareDetalii();
//        asistent.afisareDetalii();
//        brancardier.afisareDetalii();

        prelucrarePersonal(new FabricaMedic(), "Popescu Mihai", 12000);
        prelucrarePersonal(new FabricaAsistent(), "Ionescu Ana", 5000);
        prelucrarePersonal(new FabricaBrancardier(), "Vasilescu Marian", 3500);
    }
}
