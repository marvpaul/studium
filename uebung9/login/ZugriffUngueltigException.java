/**
* ZugriffUngueltigException-Klasse
* @version 1.0
* @author
*/

public class ZugriffUngueltigException extends Exception {

	private static final long serialVersionUID = 1L;

	public ZugriffUngueltigException() {
		super("Zugriff ungueltig!");
	}

	public ZugriffUngueltigException(String message) {
		super(message);
	}

}
