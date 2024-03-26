package pbB3_SimpleFactory.main;

import pbB3_SimpleFactory.clase.Supa;
import pbB3_SimpleFactory.clase.fabrica.FabricaSupa;
import pbB3_SimpleFactory.clase.fabrica.TipSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();
        try {
            Supa supaDeCiuperci = fabricaSupa.createSupa(TipSupa.SUPA_DE_CIUPERCI, "Supa de ciuperci", 250);
            Supa supaDeLegume = fabricaSupa.createSupa(TipSupa.SUPA_DE_LEGUME, "Supa de legume", 350);
            Supa supaDeVita = fabricaSupa.createSupa(TipSupa.SUPA_DE_VITA, "Supa de vita", 300);

            supaDeCiuperci.afisareDetalii();
            supaDeLegume.afisareDetalii();
            supaDeVita.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
