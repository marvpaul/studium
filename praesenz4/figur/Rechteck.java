
public class Rechteck extends Quadrat{
	private	double laenge;

	public Rechteck(double laenge, double breite, Punkt anker){
		super(breite, anker);
		this.laenge = laenge;
	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		this.laenge = laenge;
	}

	public double berechneFlaeche(){
		double flaechenInhalt = getBreite() * laenge;
		return flaechenInhalt;
	}

	public double berechneUmfang(){
		double umfang = super.berechneUmfang()/2 + laenge*2;
		return umfang;
	}

	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "Die Laenge ist: " + laenge + "\n";
		return ausgabe;
	}

}
