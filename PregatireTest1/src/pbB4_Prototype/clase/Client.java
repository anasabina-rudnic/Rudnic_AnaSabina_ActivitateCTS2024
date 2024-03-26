package pbB4_Prototype.clase;

public class Client implements ClientAbstract {
    private String nume;
    private boolean fumator;
    private int varsta;

    public Client() {
        this.nume = "Necunoscut";
        this.fumator = false;
        this.varsta = 0;
    }

    public Client(String nume, boolean fumator, int varsta) {
        this.nume = nume;
        this.fumator = fumator;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isFumator() {
        return fumator;
    }

    public void setFumator(boolean fumator) {
        this.fumator = fumator;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", fumator=" + fumator +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public ClientAbstract clone() {
        Client client = new Client();
        client.setNume(this.nume);
        client.setFumator(this.fumator);
        client.setVarsta(this.varsta);
        return client;
    }
}
