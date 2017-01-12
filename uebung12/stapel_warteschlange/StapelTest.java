package stapel_warteschlange;

/**
* StapelTest-Klasse
* @version 1.0
* 
*/

public class StapelTest {

	public static void main(String[] args) {
		System.out.println("---Stapel mit Floats ----");
		Stapel<Float> floatStapel = new Stapel<Float>();
		floatStapel.push(1.0f);
		floatStapel.push(2.0f);
		floatStapel.push(3.0f);
		System.out.println(floatStapel);
		floatStapel.pop();
		System.out.println("Oberstes Element ist: " + floatStapel.top());
		System.out.println("Ist der Stack leer: " + floatStapel.isEmpty() + "\n");
		System.out.println(floatStapel);

		System.out.println("---Stapel mit Integers ----");
		Stapel<Integer> integerStapel = new Stapel<Integer>();
		integerStapel.push(1);
		integerStapel.push(2);
		integerStapel.push(3);
		System.out.println(integerStapel);
		integerStapel.pop();
		System.out.println("Oberstes Element ist: " + integerStapel.top());
		System.out.println("Ist der Stack leer: " + integerStapel.isEmpty() + "\n");
		System.out.println(integerStapel);
	}

}
