

public class Persoana {
    protected String nume;
    protected String prenume;
    protected Adresa adresa;

    public Persoana(String nume, String prenume, Adresa adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;
    }

    public void changeAddress(Adresa newAddress) {
        this.adresa = newAddress;
        System.out.println(nume + " și-a schimbat adresa în: " + newAddress);
    }
}
