/**
* Dieses Interface ist ein Drucksimulator
* @version 1.0
* @author
*/
public interface Drucker {

	String drucksimulation = "Das Drucken wird simuliert" ;

	/**
	* Simuliert das Drucken
	* @param druckRef uebergebener String, der ausgegeben wird
	*/
	public void drucken (String druckRef);
}
