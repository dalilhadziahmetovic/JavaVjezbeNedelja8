package JAVA;

public class Zaposleni {
    int id;
    String ime;
    String prezime;
    double satnica;
    int brojSati;
    
    public Zaposleni(int id, String ime, String prezime, double satnica, int brojSati) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.satnica = satnica;
        this.brojSati = brojSati;
    }

    public double izracunajPlatu() {
        return satnica * brojSati;
    }

    public void prikaziPodatke() {
        System.out.println(ime + " " + prezime + " - Plata: " + izracunajPlatu() + " EUR");
    }
}