package JAVA;

	public class Restoran {
	    private String naziv;
	    private String adresa;
	    private String pib;
	    private Zaposleni[] zaposleni;

	    public Restoran(String naziv, String adresa, String pib, int brojZaposlenih) {
	        this.naziv = naziv;
	        this.adresa = adresa;
	        this.pib = pib;
	        this.zaposleni = new Zaposleni[brojZaposlenih];
	    }

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public String getAdresa() {
			return adresa;
		}

		public void setAdresa(String adresa) {
			this.adresa = adresa;
		}

		public String getPib() {
			return pib;
		}

		public void setPib(String pib) {
			this.pib = pib;
		}

		public Zaposleni[] getZaposleni() {
			return zaposleni;
		}

		public void setZaposleni(Zaposleni[] zaposleni) {
			this.zaposleni = zaposleni;
		}

}
	

