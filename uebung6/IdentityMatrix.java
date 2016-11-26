
public class IdentityMatrix extends QuadraticMatrix {

	// Konstruktor
	public IdentityMatrix(int m) {
		super(m);
		for (int i = 0; i < m; i++){
			komponenten[i][i] = 1.0f;
		}
	}

	public String toString() {
		// toString() erkennt nachtraegliche Veraenderungen der komponenten
		// und gibt nur nach Pruefung den Hinweis "Einheitsmatrix" aus
		if (Matrix.equals(this, new IdentityMatrix(komponenten.length)))
			return super.toString() + "\n(Es handelt sich um die Einheitsmatrix.)";
		else
			return super.toString();
	}

}
