
public class IdentityMatrix extends QuadraticMatrix {

	public IdentityMatrix(int m) {
		super(m);
		for (int i = 0; i < m; i++) {
			komponenten[i][i] = 1.0f;
		}
	}

	public String toString() {
		return super.toString() + "\n(Es handelt sich um die Einheitsmatrix.)";
	}

}
