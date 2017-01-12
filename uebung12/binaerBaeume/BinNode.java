package binaerBaeume;


/**
* BinNode-Class
* @version 1.0
* 
*/

public class BinNode<T> {
	T data;
	BinNode<T> left, right;
	
	// Konstruktoren
	public BinNode(T d) {
	data = d;
	left = right = null;
	}
	
	public BinNode() {
		
	}
	
	public BinNode(T d, BinNode<T> l, BinNode<T> r) {
		data = d;
		left = l;
		right = r;
	}
	
	public BinNode(T d, BinNode<T> l) {
		data = d;
		left = l;
		right = null;
	}
	
	public String toString() {
		String result = "";
		return result + data;
	}

}
