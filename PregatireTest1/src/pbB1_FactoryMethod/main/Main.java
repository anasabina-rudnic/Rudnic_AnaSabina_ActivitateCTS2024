package pbB1_FactoryMethod.main;


import pbB1_FactoryMethod.clase.Supa;
import pbB1_FactoryMethod.clase.fabrica.FabricaSupa;
import pbB1_FactoryMethod.clase.fabrica.FabricaSupaDeCiuperci;
import pbB1_FactoryMethod.clase.fabrica.FabricaSupaDeLegume;
import pbB1_FactoryMethod.clase.fabrica.FabricaSupaDeVita;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupaDeCiuperci = new FabricaSupaDeCiuperci();
        FabricaSupa fabricaSupaDeLegume = new FabricaSupaDeLegume();
        FabricaSupa fabricaSupaDeVita = new FabricaSupaDeVita();

        Supa supaDeCiuperci = fabricaSupaDeCiuperci.createSupa("Supa de ciuperci", 250);
        Supa supaDeLegume = fabricaSupaDeLegume.createSupa("Supa de legume", 350);
        Supa supaDeVita = fabricaSupaDeVita.createSupa("Supa de vita", 300);

        supaDeCiuperci.afisareDetalii();
        supaDeLegume.afisareDetalii();
        supaDeVita.afisareDetalii();
    }
}
