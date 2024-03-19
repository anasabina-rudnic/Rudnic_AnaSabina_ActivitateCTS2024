package pbA4.main;

import pbA4.clase.Reteta;
import pbA4.clase.RetetaAbstracta;
import pbA4.clase.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("Solutie 1", 21.03);
        solutii.put("Solutie 2", 135.23);
        solutii.put("Solutie 3", 356.00);

        Reteta prototip = new Reteta(solutii, "Medicament 1");
        RetetaAbstracta reteta = prototip.clone();
        System.out.println(reteta);

        RetetaCrema retetaCremaPrototip = new RetetaCrema("Crema 1", 1);
        RetetaAbstracta retetaCrema = retetaCremaPrototip.clone();
        System.out.println(retetaCrema);
    }
}
