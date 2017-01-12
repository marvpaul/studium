/**
* StapelSchnittstelle
* @version 1.0
* 
*/

public interface StapelSchnittstelle {

	/**
	 * legt ein Element oben auf den Stapel
	 * @param wert der hinzuzufuegende Wert
	 */
	void push(int wert);

	/**
	 * nimmt das oberste Element vom Stack herunter und gibt seinen Wert zurueck
	 * @return Wert des obenliegenden Elements
	 * @throws NullPointerException falls der Stapel leer ist
	 */
	int pop() throws NullPointerException;

	/**
	 * liefert den Wert des obersten Elements des Stacks zurueck (ohne loeschen)
	 * @return Wert des obenliegenden Elements
	 * @throws NullPointerException falls der Stapel leer ist
	 */	
	int top() throws NullPointerException;

	/**
	 * liefert true zurueck, wenn der Stack leer ist
	 * @return true, wenn der Stapel leer ist
	 */
	boolean isEmpty();
}
