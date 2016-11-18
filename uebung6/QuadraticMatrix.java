
public class QuadraticMatrix extends Matrix {

	public QuadraticMatrix(float[][] k) {
		super(k.length, k[0].length, k);
		if (k.length != k[0].length)
			System.out.println("\nWARNUNG! Sie erstellten KEINE quadratische Matrix...");
	}

	public QuadraticMatrix(int m) {
		super(m, m);
	}

	public QuadraticMatrix() {
		super();
	}

	public Matrix pow(int n) {
		Matrix ergebnis = this;
		if ((komponenten.length == komponenten[0].length) && (n >= 0)) {
			if (n > 0) {
				for (int i = 1; i < n; i++) {
					ergebnis = Matrix.multiply(ergebnis, this);
				}
			}
			else {
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
		String ausgabe = "";
		if (komponenten.length == komponenten[0].length)
			ausgabe += "\nQUADRATISCHE MATRIX:";
		return ausgabe + super.toString();
	}
}
