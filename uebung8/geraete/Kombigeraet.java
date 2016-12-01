/**
* Kombi-Geraet-Klasse
* @version 1.0
* @author
*/
public class Kombigeraet implements Drucker, Fax {

	private static int instanzenZaehler = 0;
	private int namenNummer;

	public Kombigeraet(){
		instanzenZaehler++;
		namenNummer = instanzenZaehler;
	}

	@Override
	public void drucken(String druckRef) {
		System.out.println("Kombigerät Kombigerät" + String.valueOf(this.namenNummer) 
							+ " meldet sich\n" + drucksimulation + "\n" + druckRef);
	}

	@Override
	public void senden(String sendeRef) {
		System.out.println("Absender ist: Kombigerät" + String.valueOf(this.namenNummer) 
							+ "\n" + faxsimulation + "\n" + sendeRef);
		}

}
