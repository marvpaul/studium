
public class Vektor extends Matrix {

	// Konstruktoren (Vektoren sind Matrizen mit 1 Spalte)
	public Vektor (float[] v) {
		super(v.length, 1);
		for (int i = 0; i < v.length; i++){
			komponenten[i][0] = v[i];
		}
	}

	public Vektor () {
		super();
	}

	// Methode zur Berechnung des Betrags eines Vektors (gemaess math. Formel)
	public double length() {
		double erg = 0.0;
		for (int i = 0; i < getZeilen(); i++) {
			erg += komponenten[i][0] * komponenten[i][0];
		}
		return Math.sqrt(erg);
	}

	// toString (gibt auch gleich den Betrag des Vektors an)
	public String toString() {
		return "\nVEKTOR:" + super.toString() + "\nDer Betrag des Vektors lautet: " 
				+ this.length();
	}

}
