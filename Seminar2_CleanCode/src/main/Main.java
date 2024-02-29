package main;

import clase.Aplicant;
import clase.readers.AngajatReader;
import clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AplicantReader angajatReader = new AngajatReader("angajati.txt");
        try {
            listaAngajati = angajatReader.read();
            for(Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}