package pbA4.clase;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private Map<String, Double> solutii;
    private String numeMedicament;

    public Reteta() {
        solutii = null;
        numeMedicament = "Nume medicament";
    }

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for (String solutie : solutii.keySet()) {
            this.solutii.put(solutie, solutii.get(solutie));
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta reteta = new Reteta();
        reteta.setSolutii(this.solutii);
        reteta.setNumeMedicament(this.numeMedicament);

        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
