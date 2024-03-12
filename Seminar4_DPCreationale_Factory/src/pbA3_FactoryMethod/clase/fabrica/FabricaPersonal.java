package pbA3_FactoryMethod.clase.fabrica;

import pbA2_SimpleFactory.clase.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonalSpital(String nume, int salariu);
}
