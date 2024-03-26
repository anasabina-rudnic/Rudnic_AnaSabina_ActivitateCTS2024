package pbB1_FactoryMethod.clase;

public class SupaDeCiuperci extends Supa {
    public SupaDeCiuperci(String nume, int gramaj) {
        super(nume, gramaj);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Aceasta este " + getNume() + " si are " + getGramaj() + " grame.");
    }
}
