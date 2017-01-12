package binaerBaeume;

/**
* BinTreeTest-Klasse
* @version 1.0
*
*/

public class BinTreeTest {
	public static void main(String[] args) {
		BinTree<Integer> baumLeer = new BinTree<Integer>();
		System.out.println("Empty: " + baumLeer.isEmpty());
	
		BinNode<Integer> k1 = new BinNode<Integer>(1);
		BinNode<Integer> k2 = new BinNode<Integer>(3);
		BinNode<Integer> m1 = new BinNode<Integer>(2,k1,k2);
		BinNode<Integer> m2 = new BinNode<Integer>(5);
		BinNode<Integer> m3 = new BinNode<Integer>(8);
		BinNode<Integer> m = new BinNode<Integer>(4,m1,m2);
		BinNode<Integer> n = new BinNode<Integer>(9, m3);
		BinNode<Integer> o = new BinNode<Integer>(7,m,n);
		BinTree<Integer> baum = new BinTree<Integer>(o);
		
		System.out.println("Empty: " + baum.isEmpty() + "\n");
		System.out.println("Depth First:");
		baum.depthFirst();
		System.out.println("\n\nBreadth First:");
		baum.breadthFirst();
		
	}
}
