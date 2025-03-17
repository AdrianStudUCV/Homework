
public class Student extends Persoana {
    private int id;

    public Student(String nume, String prenume, Adresa adresa, int id) {
        super(nume, prenume, adresa);
        this.id = id;
    }
}
