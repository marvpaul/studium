package stapel_warteschlange;

/**
* Stapel-Klasse
* @version 1.0
* 
*/

public class Stapel<T> {
	private Node<T> head;
		
	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		
		if ( head == null) {
			newNode.next = null;
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public T pop() throws NullPointerException {
		if ( head == null)
			throw new NullPointerException("It's empty.");
		
		Node<T> result = new Node<T>(head.data);
		if ( head.next == null) {
			head = null;
			return result.data;
		}
		else {
			head = head.next;
			return result.data;
		}
	}

	public T top() throws NullPointerException {
		if (head == null) {
			throw new NullPointerException ("It's empty.");
		}
		return head.data;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public String toString() {
		String result = "";
		Node<T> p = head;
		while ( p != null) {
			result += "**" + p.data + "**\n";
			p = p.next;
		}
		return result + "*******\n";
	}
	
}
