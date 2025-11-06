package JAVA;

public class Menadzer extends Zaposleni {
    public Menadzer(int id, String ime, String prezime, double satnica, int brojSati) {
        super(id, ime, prezime, satnica, brojSati);
    }

    @Override
    public double izracunajPlatu() {
        return super.izracunajPlatu() + 1300;
    }
}
	
	

