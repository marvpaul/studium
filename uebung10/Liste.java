/**
* Liste-Klasse
* @version 1.0
* 
*/

public class Liste implements AbstrakteListe {

	protected Node head;
	
	@Override
	public int size() {
		int count = 0;
		Node temp = head;
		while ( temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	@Override
	public boolean contains(int wert) {
		Node temp = head;
		while ( temp != null) {
			if ( temp.data == wert)
				return true;
			temp = temp.next;
		}
		return false;
	}

	@Override
	public int get(int index) throws NullPointerException {
		int count = 0;
		Node temp = head;
		while ( temp != null) {
			if ( count == index) {
				return temp.data;
			}
			count++;
			temp = temp.next;
		}
		throw new NullPointerException("No data at index.");
	}

	@Override
	public int set(int wert, int index) throws NullPointerException {
		if ( head == null || index < 0)
			throw new NullPointerException("No data at Index.");
		
		int count = 0;
		Node temp = head;
		Node result = new Node(temp.data);
		while ( temp != null){
			if ( count == index) {
				result.data = temp.data;
				temp.data = wert;
				return result.data;
			}
			count++;
			temp = temp.next;
		}
		throw new NullPointerException("No data at Index.");	
	}

	@Override
	public void addFirst(int wert) {
		// add before first element (effective in Singly linked list)
		Node newNode = new Node(wert);
		
		if ( head == null) {
			newNode.next = null;
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	@Override
	public void addLast(int wert) {
		// add after last element (NOT effective in Singly linked list)
		Node newNode = new Node(wert);
		
		if ( head == null){
			head = newNode;
		} 
		else {
			Node temp = head;
			while ( temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	@Override
	public boolean remove(int wert) {
		if ( head == null)
			return false;
		if ( head.data == wert) {
			removeFirst();
			return true; 
		}
		Node temp = head;
		while ( temp != null) {
			if (temp.next != null && temp.next.data == wert) {
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	@Override
	public int removeFirst() throws NullPointerException {
		if ( head == null)
			throw new NullPointerException("It's empty.");
		
		Node result = new Node(head.data);
		if ( head.next == null) {
			head = null;
			return result.data;
		}
		else {
			head = head.next;
			return result.data;
		}
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public int first() throws NullPointerException {
		if(	head == null)
			throw new NullPointerException ("It's empty.");
		return head.data;
	}

	@Override
	public int removeLast() throws NullPointerException {
		// NOT effective in singly linked list
		if ( head == null)
			throw new NullPointerException("It's empty.");
		else
			return removeAtIndex(size()-1);
	}

	@Override
	public int removeAtIndex(int index) throws NullPointerException {
		if ( head == null || index < 0)
			throw new NullPointerException("No data at Index.");
		else if ( index == 0)
			return removeFirst();
		else {
			int count = 0;
			Node result = new Node(head.data);
			Node temp = head;
			while ( temp != null) {
				if ( count == index-1 && temp.next != null) {
					result.data = temp.next.data;
					temp.next = temp.next.next;
					return result.data;
				}
				count++;
				temp = temp.next;
			}
			throw new NullPointerException("No data at Index.");
		}
	}

	@Override
	public boolean add(int wert, int index) {
		if ( index == 0) {
			addFirst(wert);
			return true;
		}
		Node newNode = new Node(wert);
		int count = 0;
		Node temp = head;
		while ( temp != null){
			if ( count == index-1 && temp.next != null) {
				newNode.next = temp.next;
				temp.next = newNode;
				return true;
			}
			count++;
			temp = temp.next;
		}
		return false;
	}

	@Override
	public String toString() {
		String result = "[ ";
		Node temp = head;
		while ( temp != null) {
			result += temp.data + " ";
			temp = temp.next;
		}
		return result + "]";
	}

}
