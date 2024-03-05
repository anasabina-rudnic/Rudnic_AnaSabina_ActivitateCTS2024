package exemplu_clasic.main;

import exemplu_clasic.clase.ConexiuneBD;

public class Main {
    public static void main(String[] args) {
        ConexiuneBD conexiuneBD = ConexiuneBD.getInstance("Baza de Date", 10, "link");
        ConexiuneBD conexiuneBD2 = ConexiuneBD.getInstance("Baza de Date 2", 15, "link2");

        conexiuneBD.setNumeBaza("Baza de Date Noua");
        conexiuneBD2.setNumeBaza("Baza de Date Noua 2");

        System.out.println(conexiuneBD);
        System.out.println(conexiuneBD2);
    }
}
