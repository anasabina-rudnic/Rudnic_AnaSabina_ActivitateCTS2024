package pbB2_Builder.clase;

public class RezervareBuilder implements Builder {
    Rezervare rezervare;

    public RezervareBuilder() {
        rezervare = new Rezervare(false, false, false, false, false);
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.rezervare.setAsezareLaGeam(asezareLaGeam);
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.rezervare.setScauneErgonomice(scauneErgonomice);
        return this;
    }

    public RezervareBuilder setDecorareaMesei(boolean decorareaMesei) {
        this.rezervare.setDecorareaMesei(decorareaMesei);
        return this;
    }

    public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
