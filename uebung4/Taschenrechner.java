// old Version, Check: rechner.java

public class Taschenrechner {

	public static void main(String[] args) {
		double ergebnis = 0.0;
		if (args[1].equals("add"))
			ergebnis = add(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		if (args[1].equals("sub"))
			ergebnis = sub(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		if (args[1].equals("mul"))
			ergebnis = mul(Double.parseDouble(args[0]), Double.parseDouble(args[2]));
		if (args[1].equals("div"))
			ergebnis = div(Double.parseDouble(args[0]), Double.parseDouble(args[2]));

		System.out.println(args[0] + " " + args[1] + " " + args[2] + " ist: " + ergebnis);
	}

	public static double add(double a, double b){
		double erg = a + b;
		return erg;
	}

	public static double sub(double a, double b){
		double erg = a - b;
		return erg;
	}

	public static double mul(double a, double b){
		double erg = a * b;
		return erg;
	}

	public static double div(double a, double b){
		double erg = a / b;
		return erg;
	}

}
