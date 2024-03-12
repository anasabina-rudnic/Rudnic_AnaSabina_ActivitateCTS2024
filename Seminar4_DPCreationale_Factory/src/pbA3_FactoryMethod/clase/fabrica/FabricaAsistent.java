package pbA3_FactoryMethod.clase.fabrica;

import pbA2_SimpleFactory.clase.Asistent;
import pbA2_SimpleFactory.clase.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonalSpital(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
