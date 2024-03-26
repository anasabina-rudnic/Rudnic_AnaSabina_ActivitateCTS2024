package pbB1_FactoryMethod.clase.fabrica;

import pbB1_FactoryMethod.clase.Supa;
import pbB1_FactoryMethod.clase.SupaDeCiuperci;

public class FabricaSupaDeCiuperci implements FabricaSupa {
    @Override
    public Supa createSupa(String nume, int gramaj) {
        return new SupaDeCiuperci(nume, gramaj);
    }
}
