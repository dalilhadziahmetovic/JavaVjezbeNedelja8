package JAVA;
	 class Proizvod {
	    String naziv;
	    double cijena;

	    public Proizvod(String naziv, double cijena) {
	        this.naziv = naziv;
	        this.cijena = cijena;
	    }

	    public double maloprodajnaCijena() {
	        return cijena * 1.05;
	    }

	    public String opis() {
	        return "Uredjaj: " + naziv + ", Cijena: " + maloprodajnaCijena();
	    }
	}

	class Racunar extends Proizvod{
	    String procesor;
	    int memorija;

	    public Racunar(String naziv, double cijena, String procesor, int memorija) {
	        super(naziv, cijena);
	        this.procesor = procesor;
	        this.memorija = memorija;
	    }

	    @Override
	    public double maloprodajnaCijena() {
	        return super.maloprodajnaCijena() * 1.05;
	    }

	    @Override
	    public String opis() {
	        return "Racunar: " + naziv + ", CPU: " + procesor + ", RAM: " + memorija + "GB, Cijena: " + maloprodajnaCijena();
	    }
	}
	class Telefon extends Proizvod {
	    String operativniSistem;
	    double velicinaEkrana;

	    public Telefon(String naziv, double cijena, String os, double velicinaEkrana) {
	        super(naziv, cijena);
	        this.operativniSistem = os;
	        this.velicinaEkrana = velicinaEkrana;
	    }

	    @Override
	    public double maloprodajnaCijena() {
	        double cijena = super.maloprodajnaCijena();
	        if (velicinaEkrana > 6.0) {
	            cijena *= 1.03;
	        }
	        return cijena;
	    }

	    @Override
	    public String opis() {
	        return "Telefon: " + naziv + ", OS: " + operativniSistem + ", Ekran: " + velicinaEkrana + "\", Cijena: " + maloprodajnaCijena();
	    }
	}

	class TV extends Proizvod {
	    double velicinaEkrana;

	    public TV(String naziv, double cijena, double velicinaEkrana) {
	        super(naziv, cijena);
	        this.velicinaEkrana = velicinaEkrana;
	    }

	    @Override
	    public double maloprodajnaCijena() {
	        double cijena = super.maloprodajnaCijena();
	        if (velicinaEkrana > 65.0) {
	            cijena *= 1.10;
	        }
	        return cijena;
	    }

	    @Override
	    public String opis() {
	        return "TV: " + naziv + ", Ekran: " + velicinaEkrana + "\", Cijena: " + maloprodajnaCijena();
	    }
	}


