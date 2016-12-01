/**
* Test-Klasse fuer Vergleiche
* @version 1.0
* @author
*/
public class VergleichbarTest {

	public static void main(String[] args) {
		VInteger[] testArray1 = new VInteger[5];
		System.out.println("Normal (Array mit Laenge 5):");
		for (int i = 0; i < testArray1.length; i++) {
			testArray1[i] = new VInteger(i);
			System.out.println("Stelle " + i + ": " + testArray1[i]);
		}
		Vergleichbar kleinstes1 = NuetzlicheFunktionen.kleinstesElement(testArray1);
		System.out.println("Kleinstes Element: " + (VInteger)kleinstes1);

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Leeres Array:");
		VInteger[] testArray2 = new VInteger[0];
		Vergleichbar kleinstes2 = NuetzlicheFunktionen.kleinstesElement(testArray2);
		System.out.println("Kleinstes Element: " + (VInteger)kleinstes2);

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Nur 1 Element im Array:");
		VInteger[] testArray3 = new VInteger[1];
		testArray3[0] = new VInteger(2000000);
		Vergleichbar kleinstes3 = NuetzlicheFunktionen.kleinstesElement(testArray3);
		System.out.println("Kleinstes Element: " + (VInteger)kleinstes3);

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Negative Zahl im Array (+ kommt zweimal vor):");
		VInteger[] testArray4 = new VInteger[3];
		testArray4[0] = new VInteger(2000000);
		testArray4[1] = new VInteger(-2000000);
		testArray4[2] = new VInteger(-2000000);
		Vergleichbar kleinstes4 = NuetzlicheFunktionen.kleinstesElement(testArray4);
		System.out.println("Kleinstes Element: " + (VInteger)kleinstes4);

	}

}
