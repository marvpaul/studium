/**
* WarteschlangeSchnittstelle
* @version 1.0
* 
*/

public interface WarteschlangeSchnittstelle {

	/**
	 * fuegt ein Element (mit einem gegebenen Wert) ans Ende der Warteschlange hinzu
	 * @param wert der hinzuzufuegende Wert
	 */
	void enqueue(int wert);

	/**
	 * entnimmt das erste Element aus der Warteschlange und liefert seinen Wert zurueck
	 * @return Wert des ersten Elements
	 * @throws NullPointerException falls die Wartschlange leer ist
	 */
	int dequeue() throws NullPointerException;

	/**
	 * liefert den Wert des ersten Elements der Warteschlange zurueck (ohne loeschen)
	 * @return Wert des ersten Elements
	 * @throws NullPointerException falls die Wartschlange leer ist
	 */	
	int first() throws NullPointerException;

	/**
	 * liefert true zurueck, wenn die Wartschlange leer ist
	 * @return true, wenn die Wartschlange leer ist
	 */
	boolean isEmpty();
}
