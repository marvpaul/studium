
public class QuadraticMatrix extends Matrix {

	// Konstruktoren
	public QuadraticMatrix(float[][] k) {
		super(checkQuadraticMatrix(k));
		if (checkQuadraticMatrix(k) > 0) 
			komponenten = k;
		else
			System.out.println("WARNUNG! Sie gaben KEINE quadratische Matrix ein...");
	}

	public QuadraticMatrix(int m) {
		super(m, m);
	}

	public QuadraticMatrix() {
		super();
	}

	// Check-Methode
	private static int checkQuadraticMatrix(float[][] k) {
		if (k.length != k[0].length)
			return -1;
		else
			return k.length;
	}

	// Potenzmethode fuer quadratische Matrizen
	public Matrix pow(int n){
		Matrix ergebnis = this;
		// Pruefung wegen moeglicher nachtraeglicher Veraenderungen:
		if ((komponenten.length == komponenten[0].length) && (n >= 0)) {
			if (n > 0) {
				for (int i = 1; i < n; i++) { // n-mal Multiplikation mit sich selbst
					ergebnis = Matrix.multiply(ergebnis, this);
				}
			}
			else { // Potenz == 0 ergibt die Einheitsmatrix (in richtigen Massen)
				ergebnis = new IdentityMatrix(komponenten.length); 
			}
			return ergebnis;
		}
		else {
			System.out.println("WARNUNG. Sie muessen eine quadratische Matrix verwenden. "
					+ "Und n muss >= 0 sein. Eingegebene Matrix wird ausgegeben.");
		}
		return ergebnis;
	}

	public String toString() {
		// toString() erkennt nachtraegliche Veraenderungen der komponenten
		// und gibt nur nach Pruefung den Hinweis "QUADRATISCHE MATRIX" aus
		String ausgabe = "";
		if (komponenten.length == komponenten[0].length)
			ausgabe += "\nQUADRATISCHE MATRIX:";
		return ausgabe + super.toString();
	}
}
