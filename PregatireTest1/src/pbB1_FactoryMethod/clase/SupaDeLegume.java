package pbB1_FactoryMethod.clase;

public class SupaDeLegume extends Supa {
    public SupaDeLegume(String nume, int gramaj) {
        super(nume, gramaj);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Aceasta este " + getNume() + " si are " + getGramaj() + " grame.");
    }
}
