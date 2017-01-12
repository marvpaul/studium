package stapel_warteschlange;

/**
* Node-Klasse
* @version 1.0
* 
*/

public class Node<T> {
	public T data;
	public Node<T> next;

	public Node() {
		super();
	}
	
	public Node(T d) {
		data = d;
		next = null;
	}
}
