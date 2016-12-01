/**
* Fax-Geraet-Klasse
* @version 1.0
* @author
*/
public class Faxgeraet implements Fax {

	private static int instanzenZaehler = 0;
	private int namenNummer;

	public Faxgeraet() {
		instanzenZaehler++;
		namenNummer = instanzenZaehler;
	}

	@Override
	public void senden(String sendeRef) {
		System.out.println("Absender ist: Fax" + String.valueOf(this.namenNummer) 
		+ "\n" + faxsimulation + "\n" + sendeRef);
	}

}
