
public class Mitarbeiter {
	private Gehalt gehalt;
	private String vorname;
	private String nachname;

	//Konstruktor(en)
	public Mitarbeiter(Gehalt gehalt, String... namen){
		this.gehalt = gehalt;
		vorname = namen[0]; 				// der erste der Vornamen wird genommen
		nachname = namen[namen.length - 1]; // und der letzte der Nachnamen
	}

	//Getter und Setter
	public Gehalt getGehalt() {
		return gehalt;
	}

	public void setGehalt(Gehalt gehalt) {
		this.gehalt = gehalt;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	// toString()
	public String toString(){
		String ausgabe = "";
		ausgabe += "Der (erste) Vorname ist: " + vorname + "\n";
		ausgabe += "Der (letzte) Nachname ist: " + nachname + "\n";
		ausgabe += gehalt.toString();
		return ausgabe;
	}

}
