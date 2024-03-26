package pbB1_FactoryMethod.clase.fabrica;

import pbB1_FactoryMethod.clase.Supa;
import pbB1_FactoryMethod.clase.SupaDeVita;

public class FabricaSupaDeVita implements FabricaSupa {
    @Override
    public Supa createSupa(String nume, int gramaj) {
        return new SupaDeVita(nume, gramaj);
    }
}
