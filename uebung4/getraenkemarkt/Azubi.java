
public class Azubi extends Mitarbeiter{
	private int ausbildungsJahr = 0;
	private String ausbildungsBeruf = "?";

	//Konstruktor(en)
	public Azubi(int ausbildungsJahr, String ausbildungsBeruf, Gehalt gehalt, String... namen){
		super(gehalt, namen);
		setAusbildungsJahr(ausbildungsJahr);
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

	public Azubi(int ausbildungsJahr, Gehalt gehalt, String... namen){
		super(gehalt, namen);
		setAusbildungsJahr(ausbildungsJahr);
	}

	public Azubi(String ausbildungsBeruf, Gehalt gehalt, String... namen){
		super(gehalt, namen);
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

	public Azubi(int ausbildungsJahr, String ausbildungsBeruf, String... namen){
		super(namen);
		setAusbildungsJahr(ausbildungsJahr);
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

	public Azubi(Gehalt gehalt, String... namen){
		super(gehalt, namen);
	}

	public Azubi(int ausbildungsJahr, String... namen){
		super(namen);
		setAusbildungsJahr(ausbildungsJahr);
	}

	public Azubi(String ausbildungsBeruf, String... namen){
		super(namen);
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

	public Azubi(String... namen){
		super(namen);
	}

	//Getter und Setter
	public String getAusbildungsberuf() {
		return ausbildungsBeruf;
	}

	public void setAusbildungsberuf(String ausbildungsBeruf) {
		this.ausbildungsBeruf = ausbildungsBeruf;
	}

	public int getAusbildungsJahr() {
		return ausbildungsJahr;
	}

	public void setAusbildungsJahr(int ausbildungsJahr) {
		if (ausbildungsJahr < 0){
			System.out.println("Das Ausbildungsjahr kann nicht im negativen Bereich liegen!");
			System.out.println("Addiere Null...");
		}
		else
			this.ausbildungsJahr = ausbildungsJahr;
	}

	// toString()
	public String toString(){
		String ausgabe = super.toString();
		ausgabe += "Das Ausbildungsjahr ist: " + ausbildungsJahr + "\n";
		ausgabe += "Der Ausbildungsberuf ist: " + ausbildungsBeruf + "\n";
		return ausgabe;
	}

}
