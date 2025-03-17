import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private Profesor profesor;
    private List<Student> studenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.studenti = new ArrayList<>();
    }

    public void addStudentToCourse(Student s) {
        studenti.add(s);
        System.out.println(s.nume + " a fost adăugat la cursul " + numeCurs);
    }

    public void removeStudentFromCourse(Student s) {
        studenti.remove(s);
        System.out.println(s.nume + " a fost eliminat din cursul " + numeCurs);
    }

    public void addTeacherToCourse(Profesor p) {
        this.profesor = p;
        System.out.println("Profesorul " + p.nume + " a fost asignat la cursul " + numeCurs);
    }

    public void removeTeacherFromCourse() {
        System.out.println("Profesorul " + profesor.nume + " a fost eliminat de la cursul " + numeCurs);
        this.profesor = null;
    }

    public static Curs createNewCourse(String name, Profesor teacher, List<Student> students) {
        Curs newCourse = new Curs(name, teacher);
        newCourse.studenti.addAll(students);
        System.out.println("Cursul " + name + " a fost creat cu profesorul " + teacher.nume);
        return newCourse;
    }
}
