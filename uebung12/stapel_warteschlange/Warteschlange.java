package stapel_warteschlange;

/**
* Warteschlange-Klasse
* @version 1.0
* 
*/

public class Warteschlange<T> {
	
	private Node<T> head;
	
	
	public void enqueue(T data) {
		// add after last element (NOT effective in Singly linked list)
		Node<T> newNode = new Node<T>(data);
		
		if ( head == null){
			head = newNode;
		} 
		else {
			Node<T> temp = head;
			while ( temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public T dequeue() throws NullPointerException {
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

	public T first() throws NullPointerException {
		if(	head == null)
			throw new NullPointerException ("It's empty.");
		return head.data;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public String toString() {
		String result = "<--- ";
		Node<T> temp = head;
		while ( temp != null) {
			result += temp.data + " ";
			temp = temp.next;
		}
		return result + "<---";
	}
}
