/**
* Stapel-Klasse
* @version 1.0
* 
*/

public class Stapel extends Liste implements StapelSchnittstelle {

	@Override
	public void push(int wert) {
		addFirst(wert);
	}

	@Override
	public int pop() throws NullPointerException {
		return removeFirst();
	}

	@Override
	public int top() throws NullPointerException {
		return first();
	}

	public String toString() {
		String result = "";
		Node p = head;
		while ( p != null) {
			result += "**" + p.data + "**\n";
			p = p.next;
		}
		return result + "*******\n";
	}

}
