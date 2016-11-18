
public class Matrix {
	private int zeilen = 1;
	private int spalten = 1;
	float[][] komponenten = new float[zeilen][spalten];

	// Konstruktoren
	public Matrix (int m, int n, float[][] k) {
		boolean dimensionenCheck = false;
		if ((m == k.length) && (n == k[0].length)) {
			dimensionenCheck = true;
		}
		if ((n > 0) && (m > 0) && dimensionenCheck == true) {
			zeilen = m;
			spalten = n;
			komponenten = k;
		}
		else {
			System.out.println("Eingabe ergibt keinen Sinn. Default-Matrix erstellt.");
		}
	}

	public Matrix (int m, int n) {
		if ((n > 0) && (m > 0)) {
			zeilen = m;
			spalten = n;
			komponenten = new float[zeilen][spalten];
			for (int i = 0; i < zeilen; i++){
				for (int j = 0; j < spalten; j++){
					komponenten[i][j] = 0;
				}
			}
		}
		else {
			System.out.println("Eingabe ergibt keinen Sinn. Default-Matrix erstellt.");
		}
	}

	public Matrix () {
		// default-Matrix bei leerer Eingabe: 1 Zeile, 1 Spalte, Inhalt: 0
	}

	public int getZeilen() {
		return zeilen;
	}

	// Klassenmethode prüft, ob 2 Matrizen identisch sind
	public static boolean equals(Matrix eins, Matrix zwei) {
		boolean identisch = false;
		if ((eins.spalten == zwei.spalten) && (eins.zeilen == zwei.zeilen)) {
			for (int i = 0; i < eins.zeilen; i++) {
				for (int j = 0; j < eins.spalten; j++) {
					if (eins.komponenten[i][j] != zwei.komponenten[i][j])
						return identisch;
				}
			}
			identisch = true;
		}
		return identisch;
	}

	// Klassenmethode addiert 2 Matrizen
	public static Matrix add(Matrix eins, Matrix zwei) {
		Matrix ergebnis;
		ergebnis = new Matrix();
		if ((eins.spalten == zwei.spalten) && (eins.zeilen == zwei.zeilen)) {
			ergebnis = new Matrix(eins.zeilen, eins.spalten);
			for (int i = 0; i < eins.zeilen; i++) {
				for (int j = 0; j < eins.spalten; j++) {
					ergebnis.komponenten[i][j] = eins.komponenten[i][j] + zwei.komponenten[i][j];
				}
			}
		}
		else{
			System.out.println("Kann nicht addieren. Default-Matrix ausgegeben.");
		}
		return ergebnis;
	}

	// Klassenmethode multipliziert 2 Matrizen
	public static Matrix multiply(Matrix eins, Matrix zwei) {
		Matrix ergebnis = new Matrix();
		if ((eins.spalten == zwei.zeilen)){
			ergebnis = new Matrix(eins.zeilen, zwei.spalten);
			for (int i = 0; i < ergebnis.zeilen; i++) {
				for (int j = 0; j < ergebnis.spalten; j++) {
					for (int k = 0; k < ergebnis.spalten; k++) {
						ergebnis.komponenten[i][j] += eins.komponenten[i][k] * zwei.komponenten[k][j];
					}
				}
			}
		}
		else {
			System.out.println("Kann nicht multiplizieren. Default-Matrix ausgegeben.");
		}
		return ergebnis;
	}

	// Instanzmethode multipliziert Matrix mit einem Skalar
	public void multiplyScalar(float skalar){
		for (int i = 0; i < zeilen; i++){
			for (int j = 0; j < spalten; j++){
				komponenten[i][j] *= skalar;
			}
		}
	}

	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < zeilen; i++) {
			ausgabe += "\n";
			for (int j = 0; j < spalten; j++) {
				ausgabe += komponenten[i][j] + "  ";
			}
		}
		ausgabe += "\n\nAnzahl der Zeilen: " + zeilen;
		ausgabe += "\nAnzahl der Spalten: " + spalten;
		return ausgabe;
	}

}
