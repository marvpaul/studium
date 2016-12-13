/**
* KeineBerechtigungException-Klasse
* @version 1.0
* @author
*/

public class KeineBerechtigungException extends Exception {

	private static final long serialVersionUID = 1L;

	public KeineBerechtigungException() {
		super("Keine Berechtigung!");
	}

	public KeineBerechtigungException(String message) {
		super(message);
	}

}
