

public class Adresa {
    private String strada;
    private String oras;

    public Adresa(String strada, String oras) {
        this.strada = strada;
        this.oras = oras;
    }

    public String toString() {
        return strada + ", " + oras;
    }
}
