package pbB1_FactoryMethod.clase.fabrica;

import pbB1_FactoryMethod.clase.Supa;
import pbB1_FactoryMethod.clase.SupaDeLegume;

public class FabricaSupaDeLegume implements FabricaSupa {
    @Override
    public Supa createSupa(String nume, int gramaj) {
        return new SupaDeLegume(nume, gramaj);
    }
}
