
public class Rechner {

	public static void main(String[] args) {
		double ergebnis = 0.0;
		boolean fehler = false;

		//Ueberpruefung der Eingabe in Check-Methode
		fehler = checker(args);

		//Wahl der gewuenschten Methode (Umwandlung in doubles)
		if ((fehler == false) && args[1].equals("add"))
			ergebnis = add(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		else if ((fehler == false) && args[1].equals("sub"))
			ergebnis = sub(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		else if ((fehler == false) && args[1].equals("mul"))
			ergebnis = mul(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		else if ((fehler == false) && args[1].equals("div")){
			if (Double.parseDouble(args[2]) != 0)
				ergebnis = div(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
			else{
				System.out.println("Sie können nicht durch 0 teilen.");
				fehler = true;
			}
		}
		else //falls der 2.String keiner der 4 moeglichen Operationen entspricht
			fehler = true;
		}

		//Ergebnis-Ausdruck
		if (fehler)
			System.out.println("Mit Ihrer Eingabe stimmt leider etwas nicht. Pruefen Sie diese."
					+ "\nRichtig ist: < rechner [Zahl1] [Operation(add, sub, mul, div)] [Zahl2] >");
		else{
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " ist: " + ergebnis);
			System.out.println("(Bitte beachten Sie, dass das Ergebnis auf ca. 15 Nachkommastellen genau ist.)");
		}
	}

	//Eingabe-Check-Methode
	private static boolean checker(String[] zuPruefen){
		boolean testFehler = false;
		@SuppressWarnings("unused") //testDouble soll nicht verwendet werden
		double testDouble;
		//Test, ob genau 3 Parameter eingegeben wurden: 
		if (zuPruefen.length != 3){
			System.out.println("Falsche ANZAHL an Parametern.");
			return testFehler = true;
		}
		//Test, ob sich der 1. und 3. Parameter in Doubles umwandeln lassen
		try {
			testDouble = Double.parseDouble(zuPruefen[0]);
			testDouble = Double.parseDouble(zuPruefen[2]);

		} catch (IllegalArgumentException keineZahlen) {
			System.out.println("Falscher TYP unter den Parametern.");
			return testFehler = true;
		}
		return testFehler;
	}
	
	
	//Addieren-Methode
	private static double add(double a, double b){
		double erg = a + b;
		return erg;
	}
	
	//Subtrahieren-Methode
	private static double sub(double a, double b){
		double erg = a - b;
		return erg;
	}

	//Multiplizieren-Methode
	private static double mul(double a, double b){
		double erg = a * b;
		return erg;
	}

	//Dividieren-Methode
	private static double div(double a, double b){
		double erg = a / b;
		return erg;
	}

}
