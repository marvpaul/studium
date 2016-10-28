
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
		double umfang = getBreite()*2 + laenge*2;
		return umfang;
	}

	public String toString() {
		String ausgabe = "";
		ausgabe += "Die x-Koordinate des Ankerpunktes lautet: " + getAnker().getX() + "\n";
		ausgabe += "Die y-Koordinate des Ankerpunktes lautet: " + getAnker().getY() + "\n";
		ausgabe += "Die Laenge ist: " + laenge + "\n";
		ausgabe += "Die Breite ist: " + getBreite() + "\n";
		return ausgabe;
	}

}
