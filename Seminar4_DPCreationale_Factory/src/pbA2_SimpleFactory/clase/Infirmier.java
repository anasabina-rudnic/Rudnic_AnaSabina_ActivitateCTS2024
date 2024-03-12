package pbA2_SimpleFactory.clase;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul  " + getNume() + " are salariul " + getSalariu() + ".");
    }
}
