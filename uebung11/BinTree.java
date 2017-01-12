/**
* BinTree-Class
* @version 1.0
* 
*/


public class BinTree {
	private BinNode root = null;
	private Stapel storedAsStapel = new Stapel();

	BinTree() {
		root = null;
	}

	BinTree(BinNode rn) {
		root = rn;
	}

	/**
	 * ermittelt, ob der Binaerbaum gefuellt ist
	 * @return true, wenn nicht leer
	 */
	public boolean isNotEmpty() {
		return ( root != null);
	}

	/**
	 * zaehlt die Blaetter in einem Baum (unter einem Knoten)
	 * @param Knoten, unter dem gesucht werden soll
	 * @return Anzahl der Blaetter
	 */
	private int countLeaves(BinNode k) {
		if (k == null)
			return 0;
		if (k.left == null && k.right == null)
			return 1;
		else
			return countLeaves(k.left) + countLeaves(k.right);
	}

	/**
	 * zaehlt die Blaetter im gesamten Baum (ab der Wurzel)
	 * @return Anzahl der Blaetter
	 */
	public int countLeaves() {
		return countLeaves(root);
	}

	/**
	 * ermittelt, ob der Binaerbaum sortiert ist (unter einem Knoten)
	 * @param Knoten, unter dem die Sortierung geprueft werden soll
	 * @return true, wenn sortiert
	 */
	private boolean isSorted(BinNode k) {
		if (k == null)
			return true;
		else if (k != null && k.left == null && k.right == null)
			return true;
		else {
			storedAsStapel.clear();
			storeAsStapelInorder(k);
			while (storedAsStapel.size() > 1) {
				int max = storedAsStapel.pop();
				int min = storedAsStapel.top();
				if (min >= max)
					return false;
			}
		}
		return true;
	}

	/**
	 * ermittelt, ob der Binaerbaum sortiert ist (ab der Wurzel)
	 * @return true, wenn sortiert
	 */
	public boolean isSorted() {
		return isSorted(root);
	}

	/**
	 * speichert Binaerbaum als Stapel (Inorder)
	 * @param Knoten, ab dem als Stapel gespeichert werden soll
	 */
	private void storeAsStapelInorder(BinNode k) {
		if (k != null) {
			storeAsStapelInorder(k.left);
			storedAsStapel.push(k.data);
			storeAsStapelInorder(k.right);
		}
	}

	/**
	 * gibt die Blaetter des Baums (ab einem Knoten) auf der Konsole aus
	 * @param knoten ab dem ausgedruckt werden soll
	 */
	public void printBinTree(BinNode knoten) {
		if (knoten != null){
			System.out.print("(");
			//System.out.print(knoten.data); // Preorder
			printBinTree(knoten.left);
			System.out.print(knoten.data); // Inorder
			printBinTree(knoten.right);
			//System.out.print(knoten.data); // Postorder
			System.out.print(")");
		}
	}

	/**
	 * gibt die Blaetter des gesamten Baums (ab der Wurzel) auf der Konsole aus
	 */
	public void printBinTree() {
		printBinTree(root);
	}
}
