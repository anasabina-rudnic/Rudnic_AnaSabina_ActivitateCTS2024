package pbA2_SimpleFactory.main;

import pbA2_SimpleFactory.clase.PersonalSpital;
import pbA2_SimpleFactory.clase.fabrica.FabricaPersonal;
import pbA2_SimpleFactory.clase.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        try {
            PersonalSpital medic = fabricaPersonal.createPersonalSpital(TipPersonal.MEDIC, "Popescu Mihai", 12000);
            PersonalSpital asistent = fabricaPersonal.createPersonalSpital(TipPersonal.ASISTENT, "Ionescu Ana", 5000);
            PersonalSpital brancardier = fabricaPersonal.createPersonalSpital(TipPersonal.BRANCARDIER, "Vasilescu Marian", 3500);
            PersonalSpital infirmier = fabricaPersonal.createPersonalSpital(TipPersonal.INFIRMIER, "Pop Maria", 3000);

            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
            infirmier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
