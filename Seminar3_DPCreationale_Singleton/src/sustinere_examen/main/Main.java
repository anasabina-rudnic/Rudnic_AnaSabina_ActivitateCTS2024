package sustinere_examen.main;

import exemplu_clasic.clase.ConexiuneBD;
import sustinere_examen.clase.Student;
import sustinere_examen.clase.SustinereExamen;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Ana Rudnic", "ana.rudnic@gmail.com", 3);
        Student student2 = new Student(145, "Maria Pana", "maria.pana@gmail.com", 2);
        Student student3 = new Student(579, "Cristian Popescu", "cristian.popescu@gmail.com", 3);
        Student student4 = new Student(243, "Andreea Ispas", "andreea.ispas@gmail.com", 1);

        SustinereExamen examenPoo = new SustinereExamen("Programare Orientata Obiect");
        SustinereExamen examenCts = new SustinereExamen("Calitate si Testare Software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);
        examenPoo.inregistrareStudent(student4);
        examenPoo.inregistrareStudent(student2);

        System.out.println("\n");

        examenCts.inregistrareStudent(student1);
        examenCts.inregistrareStudent(student2);
        examenCts.inregistrareStudent(student1);
        examenCts.inregistrareStudent(student3);
        examenCts.inregistrareStudent(student4);
        examenCts.inregistrareStudent(student2);
    }
}
