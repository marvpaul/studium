/**
* Login-Klasse
* @version 1.0
* @author
*/

public class Login {

	private boolean angemeldet = false;
	private String legitimerNutzerName = "Horst";
	private String legitimerNutzerPasswort = "1234";
	
	public Login(){
		super();
	}

	public void anmelden (String benutzer, String passwort) throws ZugriffUngueltigException {
		if (!benutzer.equals(legitimerNutzerName) || !passwort.equals(legitimerNutzerPasswort))
			throw new ZugriffUngueltigException();
		else
			angemeldet = true;
	}

	public void abmelden() {
		angemeldet = false;
	}

	public void bearbeiten() throws KeineBerechtigungException {
		if (angemeldet == false)
			throw new KeineBerechtigungException();
		else
			System.out.println ("Bearbeite..., Bearbeite..., Bearbeite...");
	}

}
