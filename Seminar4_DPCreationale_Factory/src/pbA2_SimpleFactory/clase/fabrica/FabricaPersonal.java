package pbA2_SimpleFactory.clase.fabrica;

import pbA2_SimpleFactory.clase.*;

public class FabricaPersonal {
    public PersonalSpital createPersonalSpital (TipPersonal tipPersonal, String nume, int salariu) throws Exception {
        switch (tipPersonal) {
            case MEDIC:
                return new Medic(nume, salariu);
            case ASISTENT:
                return new Asistent(nume, salariu);
            case BRANCARDIER:
                return new Brancardier(nume, salariu);
            case INFIRMIER:
                return new Infirmier(nume, salariu);
            default:
                throw new Exception("Tipul nu este returnat!");
        }
    }
}
