/**
* TestBinTree-JUnit-Class
* @version 1.0
* 
*/

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestBinTree {
	BinTree	baumLeer = new BinTree();
	BinTree	baum1Element = new BinTree(new BinNode(1));
	BinTree	baumNormal;

	@Before
	public void baeumeErzeugen() {
		BinNode	k1 = new BinNode(1);
		BinNode	k2 = new BinNode(3);
		BinNode	m1 = new BinNode(2,k1,k2);
		BinNode	m2 = new BinNode(5);
		BinNode	m3 = new BinNode(8);
		BinNode	m =	new	BinNode(4,m1,m2);
		BinNode	n =	new	BinNode(9, m3);
		BinNode	o =	new	BinNode(7,m,n);
		baumNormal = new BinTree(o);
	}

	// Tests fuer Methode isNotEmpty()
	@Test
	public void testIsNotEmptyLeer() {
		assertTrue(baumLeer.isNotEmpty() == false);
	}

	@Test
	public void testIsNotEmpty1Element() {
		assertTrue(baum1Element.isNotEmpty() == true);
	}

	@Test
	public void testIsNotEmptyNormal() {
		assertTrue(baumNormal.isNotEmpty() == true);
	}
	
	// Tests fuer Methode countLeaves()
	@Test
	public void testCountLeavesLeer() {
		assertTrue(baumLeer.countLeaves() == 0);
	}

	@Test
	public void testCountLeaves1Element() {
		assertTrue(baum1Element.countLeaves() == 1);
	}

	@Test
	public void testCountLeavesNormal() {
		assertTrue(baumNormal.countLeaves() == 4);
	}

	// Tests fuer Methode isSorted()
	@Test
	public void testIsSortedLeer() {
		assertTrue(baumLeer.isSorted() == true);
	}

	@Test
	public void testIsSorted1Element() {
		assertTrue(baum1Element.isSorted() == true);
	}

	@Test
	public void testIsSortedNormal() {
		assertTrue(baumNormal.isSorted() == true);
	}

}
