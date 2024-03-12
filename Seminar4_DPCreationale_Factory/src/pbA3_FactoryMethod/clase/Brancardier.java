package pbA3_FactoryMethod.clase;

import pbA2_SimpleFactory.clase.PersonalSpital;

public class Brancardier extends PersonalSpital {
    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + getNume() + " are salariul " + getSalariu() + ".");
    }
}
