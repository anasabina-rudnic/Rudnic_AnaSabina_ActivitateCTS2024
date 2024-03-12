package pbA3_FactoryMethod.clase;

import pbA2_SimpleFactory.clase.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicul " + getNume() + " are salariul " + getSalariu() + ".");
    }
}
