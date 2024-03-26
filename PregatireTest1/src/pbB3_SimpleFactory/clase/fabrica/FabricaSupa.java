package pbB3_SimpleFactory.clase.fabrica;


import pbB3_SimpleFactory.clase.Supa;
import pbB3_SimpleFactory.clase.SupaDeCiuperci;
import pbB3_SimpleFactory.clase.SupaDeLegume;
import pbB3_SimpleFactory.clase.SupaDeVita;

public class FabricaSupa {
    public Supa createSupa (TipSupa tipSupa, String nume, int gramaj) throws Exception {
        switch (tipSupa) {
            case SUPA_DE_CIUPERCI:
                return new SupaDeCiuperci(nume, gramaj);
            case SUPA_DE_LEGUME:
                return new SupaDeLegume(nume, gramaj);
            case SUPA_DE_VITA:
                return new SupaDeVita(nume, gramaj);
            default:
                throw new Exception("Tipul nu este returnat!");
        }
    }
}
