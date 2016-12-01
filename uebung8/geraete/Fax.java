/**
* Dieses Interface ist ein Faxsimulator
* @version 1.0
* @author
*/
public interface Fax {

	String faxsimulation = "Das Senden wird simuliert" ;

	/**
	* Simuliert das Senden eines Faxes
	* @param sendeRef uebergebener String, der ausgegeben wird
	*/
	public void senden (String sendeRef);

}
