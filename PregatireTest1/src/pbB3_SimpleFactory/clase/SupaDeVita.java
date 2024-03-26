package pbB3_SimpleFactory.clase;

public class SupaDeVita extends Supa {
    public SupaDeVita(String nume, int gramaj) {
        super(nume, gramaj);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Aceasta este " + getNume() + " si are " + getGramaj() + " grame.");
    }
}
