package pbA3_FactoryMethod.clase;

import pbA2_SimpleFactory.clase.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Asistentul " + getNume() + " are salariul " + getSalariu() + ".");
    }
}
