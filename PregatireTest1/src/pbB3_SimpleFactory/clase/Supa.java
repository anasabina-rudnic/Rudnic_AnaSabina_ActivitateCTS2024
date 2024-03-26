package pbB3_SimpleFactory.clase;

public abstract class Supa {
    private String nume;
    private int gramaj;

    public Supa(String nume, int gramaj) {
        this.nume = nume;
        this.gramaj = gramaj;
    }

    public String getNume() {
        return nume;
    }

    public int getGramaj() {
        return gramaj;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "nume='" + nume + '\'' +
                ", gramaj=" + gramaj +
                '}';
    }

    public abstract void afisareDetalii();
}
