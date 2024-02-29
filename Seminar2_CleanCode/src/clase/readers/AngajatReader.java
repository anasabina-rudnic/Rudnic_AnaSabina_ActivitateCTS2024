package clase.readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat aplicant = new Angajat();
            super.readAplicant(input, aplicant);
            int salariu = input.nextInt();
            String ocupatie = input.next();
            aplicant.setSalariu(salariu);
            aplicant.setOcupatie(ocupatie);
            angajati.add(aplicant);
        }
        input.close();
        return angajati;
    }
}
