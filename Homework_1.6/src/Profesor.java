

public class Profesor extends Persoana {
    private String specializare;

    public Profesor(String nume, String prenume, Adresa adresa, String specializare) {
        super(nume, prenume, adresa);
        this.specializare = specializare;
    }
}
