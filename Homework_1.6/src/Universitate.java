import java.util.ArrayList;
import java.util.List;

public class Universitate {
    public static void main(String[] args) {
        Adresa adresa1 = new Adresa("Strada Victoriei", "București");
        Adresa adresa2 = new Adresa("Strada Mihai Eminescu", "Cluj");

        Profesor prof1 = new Profesor("Ion", "Popescu", adresa1, "Matematică");
        Student student1 = new Student("Maria", "Ionescu", adresa2, 101);
        Student student2 = new Student("Alex", "Georgescu", adresa2, 102);

        List<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(student1);
        listaStudenti.add(student2);

        Curs curs1 = Curs.createNewCourse("Algebră", prof1, listaStudenti);
        curs1.addStudentToCourse(new Student("Ana", "Dumitrescu", adresa1, 103));
        curs1.removeStudentFromCourse(student2);

        prof1.changeAddress(new Adresa("Strada Libertății", "Timișoara"));
        student1.changeAddress(new Adresa("Strada Unirii", "Iași"));

        curs1.removeTeacherFromCourse();
    }
}
