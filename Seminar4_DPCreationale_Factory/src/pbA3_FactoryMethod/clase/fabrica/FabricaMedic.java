package pbA3_FactoryMethod.clase.fabrica;

import pbA2_SimpleFactory.clase.Medic;
import pbA2_SimpleFactory.clase.PersonalSpital;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonalSpital(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
