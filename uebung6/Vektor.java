
public class Vektor extends Matrix {

	public Vektor (float[] v) {
		super(v.length, 1);
		for (int i = 0; i < v.length; i++) {
			komponenten[i][0] = v[i];
		}
	}

	public double length() {
		double erg = 0.0;
		for (int i = 0; i < getZeilen(); i++) {
			erg += komponenten[i][0] * komponenten[i][0];
		}
		return Math.sqrt(erg);
	}

	public String toString() {
		return "\nVEKTOR:" + super.toString() + "\nDer Betrag des Vektors lautet: "
				+ this.length();
	}

}
