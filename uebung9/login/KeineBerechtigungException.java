/**
* KeineBerechtigungException-Klasse
* @version 1.0
* @author
*/

public class KeineBerechtigungException extends Exception {

	private static final long serialVersionUID = 2L;
	private String message;

	public KeineBerechtigungException() {
		super();
	}

	public KeineBerechtigungException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
