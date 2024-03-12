package pbA3_FactoryMethod.clase.fabrica;

import pbA2_SimpleFactory.clase.Brancardier;
import pbA2_SimpleFactory.clase.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonalSpital(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
