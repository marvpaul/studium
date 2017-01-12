/**
* Warteschlange-Klasse
* @version 1.0
* 
*/


public class Warteschlange extends Liste implements WarteschlangeSchnittstelle {

	@Override
	public void enqueue(int wert) {
		addLast(wert);
	}

	@Override
	public int dequeue() throws NullPointerException {
		return removeFirst();
	}

	public String toString() {
		String result = "<--- ";
		Node temp = head;
		while ( temp != null) {
			result += temp.data + " ";
			temp = temp.next;
		}
		return result + "<---";
	}
}
