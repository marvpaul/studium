/**
*
* @author:
*
*/

public class BinaryTest {

	public static void main(String[] args) {
		// Pruefung der Methode anhand der Integer-Grenzwerte
		int eingabe1 = -2147483648;
		int eingabe2 = -1;
		int eingabe3 = 0;
		int eingabe4 = 1;
		int eingabe5 = 2147483647;

		/* Die Ausgaben auf der Konsole geben die erwarteten korrekten Ergebnisse
		* - Das Vorhandensein fuehrender Nullen ist ok und dient der Uebersichtlichkeit
		* - Das Ausgeben des Ergebnisses der vordef. Java-Methode dient nur der Illustration
		*/
		System.out.println("Integer-Zahl:    " + eingabe1);
		System.out.println("Eigen binaer:    " + Binary.inBinary(eingabe1));
		System.out.println("(Vordef. binaer: " + Integer.toBinaryString(eingabe1) + " )\n");

		System.out.println("Integer-Zahl:    " + eingabe2);
		System.out.println("Eigen binaer:    " + Binary.inBinary(eingabe2));
		System.out.println("(Vordef. binaer: " + Integer.toBinaryString(eingabe2) + " )\n");

		System.out.println("Integer-Zahl:    " + eingabe3);
		System.out.println("Eigen binaer:    " + Binary.inBinary(eingabe3));
		System.out.println("(Vordef. binaer: " + Integer.toBinaryString(eingabe3) + " )\n");

		System.out.println("Integer-Zahl:    " + eingabe4);
		System.out.println("Eigen binaer:    " + Binary.inBinary(eingabe4));
		System.out.println("(Vordef. binaer: " + Integer.toBinaryString(eingabe4) + " )\n");

		System.out.println("Integer-Zahl:    " + eingabe5);
		System.out.println("Eigen binaer:    " + Binary.inBinary(eingabe5));
		System.out.println("(Vordef. binaer: " + Integer.toBinaryString(eingabe5) + " )");
	}

}
