
public class Quadrat extends Figur{
	private	double breite;

	public Quadrat(double breite, Punkt anker){
		super(anker);
		this.breite = breite;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		this.breite = breite;
	}

	public double berechneFlaeche(){
		double flaechenInhalt = breite * breite;
		return flaechenInhalt;
	}

	public double berechneUmfang(){
		double umfang = breite * 4;
		return umfang;
	}

	public String toString() {
		String ausgabe = "";
		ausgabe += "Die x-Koordinate des Ankerpunktes lautet: " + getAnker().getX() + "\n";
		ausgabe += "Die y-Koordinate des Ankerpunktes lautet: " + getAnker().getY() + "\n";
		ausgabe += "Die Breite ist: " + breite + "\n";
		return ausgabe;
	}
}

