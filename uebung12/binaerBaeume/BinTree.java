package binaerBaeume;

import stapel_warteschlange.Stapel;
import stapel_warteschlange.Warteschlange;

/**
* BinTree-Class
* @version 1.0
*
*/

public class BinTree<T> {
	private BinNode<T> root = null;
	
	// Konstruktoren	
	BinTree() {
		root = null;
	}
	
	BinTree(BinNode<T> rn) {
		root = rn;
	}
		
	/**
	 * prueft, ob ein BinTree leer ist
	 * @return true, wenn BinTree leer ist
	 */
	public boolean isEmpty() {
		return ( root == null);
	}
	
	/**
	 * traversiert einen BinTree nach dem Verfahren der Tiefensuche und gibt den
	 * Wert eines jeden besuchten Knotens aus
	 * @throws NullPointerException wenn der BinTree leer ist
	 */
	public void depthFirst() throws NullPointerException {
		if ( root == null)
			throw new NullPointerException("It's empty.");
		
		Stapel<BinNode<T>> binNodeStapel = new Stapel<BinNode<T>>();
		BinNode<T> temp = root;
		while (temp != null) {
			System.out.print(temp + " ");
			if (temp.right != null)
				binNodeStapel.push(temp.right);
			temp = temp.left;
			if (temp == null && !binNodeStapel.isEmpty())
				temp = binNodeStapel.pop();
		}
	}
	
	/**
	 * traversiert einen BinTree nach dem Verfahren der Breitensuche und gibt den
	 * Wert eines jeden besuchten Knotens aus
	 * @throws NullPointerException wenn der BinTree leer ist
	 */
	public void breadthFirst() throws NullPointerException {
		if ( root == null)
			throw new NullPointerException("It's empty.");
		
		Warteschlange<BinNode<T>> binNodeWarteschlange = new Warteschlange<BinNode<T>>();
		binNodeWarteschlange.enqueue(root);
		while (!binNodeWarteschlange.isEmpty()) {
			BinNode<T> temp = binNodeWarteschlange.dequeue();
			if (temp != null) {
				System.out.print(temp.data + " " );
				binNodeWarteschlange.enqueue(temp.left);
				binNodeWarteschlange.enqueue(temp.right);
			}
		}
	}

}
