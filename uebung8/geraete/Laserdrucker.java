/**
* Laserdrucker-Klasse
* @version 1.0
* @author
*/
public class Laserdrucker implements Drucker {

	private static int instanzenZaehler = 0;
	private int namenNummer;

	public Laserdrucker() {
		instanzenZaehler++;
		namenNummer = instanzenZaehler;
	}

	@Override
	public void drucken(String druckRef) {
		System.out.println("Drucker Laser" + String.valueOf(this.namenNummer) + " meldet sich\n" 
							+ drucksimulation + "\n" + druckRef);
		}

}
