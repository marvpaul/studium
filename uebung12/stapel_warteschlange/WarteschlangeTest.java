package stapel_warteschlange;

/**
* WarteschlangeTest-Klasse
* @version 1.0
* 
*/

public class WarteschlangeTest {
	
	public static void main(String[] args) {
		System.out.println("---Warteschlange mit Doubles ----");
		Warteschlange<Double> doubleWarteschlange = new Warteschlange<Double>();
		doubleWarteschlange.enqueue(1.0);
		doubleWarteschlange.enqueue(2.0);
		doubleWarteschlange.enqueue(3.0);
		System.out.println(doubleWarteschlange);
		doubleWarteschlange.dequeue();
		System.out.println("Oberstes Element ist: " + doubleWarteschlange.first());
		System.out.println("Ist die Warteschlange leer: " + doubleWarteschlange.isEmpty() + "\n");
		System.out.println(doubleWarteschlange);
		
		System.out.println("\n---Warteschlange mit Characters ----");
		Warteschlange<Character> characterWarteschlange = new Warteschlange<Character>();
		characterWarteschlange.enqueue('a');
		characterWarteschlange.enqueue('b');
		characterWarteschlange.enqueue('c');
		System.out.println(characterWarteschlange);
		characterWarteschlange.dequeue();
		System.out.println("Oberstes Element ist: " + characterWarteschlange.first());
		System.out.println("Ist die Warteschlange leer: " + characterWarteschlange.isEmpty() + "\n");
		System.out.println(characterWarteschlange);
	
	}
}
