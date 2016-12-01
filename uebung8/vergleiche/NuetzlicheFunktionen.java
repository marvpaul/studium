/**
* NuetzlicheFunktionen-Klasse
* @version 1.0
* @author
*/
public class NuetzlicheFunktionen {

	/**
	* bestimmt ein kleinstes (auf Basis der Vergleichbar-Implementierung)
	Element des Parameter-Arrays
	* @param array übergebenes Array
	* @return ein kleinstes Element des übergebenen Arrays
	*/
	public static Vergleichbar kleinstesElement(Vergleichbar[] array) {
		if (array.length <= 0) {
			System.out.println("WARNUNG! Array-Laenge ist zu gering!");
			return null;
		}
		else if (array.length == 1)
			return array[0];
		else {
			Vergleichbar tempKleinstes = array[0];
			for (int i = 1; i < array.length; i++) {
				if (tempKleinstes.vergleicheMit(array[i]) > 0 )
					tempKleinstes = array[i];
			}
			return tempKleinstes;
		}
	}

}
