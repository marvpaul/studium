
public class Gehalt {
	private double betrag = 0.0;

	//Konstruktor(en)
	public Gehalt(double betrag){
		setBetrag(betrag);
	}

	public Gehalt(){
	}

	//Getter und Setter
	public double getBetrag() {
		return betrag;
	}

	public void setBetrag(double betrag) {
		if (betrag < 0.0){
			System.out.println("Das Gehalt kann nicht im negativen Bereich liegen!");
			System.out.println("Addiere Null...");
		}
		else
			this.betrag = betrag;
	}

	// Instanzmethode Gehaltserhoehung
	public void gehaltsErhoehung(double erhoehung){
		if (erhoehung < 0.0)
			System.out.println("Die ERHOEHUNG kann nicht im negativen Bereich liegen! (Tue nichts.)");
		else
			betrag += erhoehung;
	}

	// toString()
	public String toString(){
		String ausgabe = "Der aktuelle Betrag des Gehalts lautet: " + betrag + " EUR\n";
		return ausgabe;
	}

}
