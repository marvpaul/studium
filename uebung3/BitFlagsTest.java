/**
*
* @author:
*
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BitFlagsTest {
	private BitFlags eins;
	private BitFlags zwei;
	private BitFlags drei;
	private BitFlags vier;
	private BitFlags fuenf;

	private int indexMin;
	private int indexNormal;
	private int indexMax;
	private int indexNotEnough;
	private int indexTooMuch;


	@Before
	public void testBitFlagsErzeugen(){
		// Besondere Integer-Werte
		eins = new BitFlags(-2147483648);
		zwei = new BitFlags(-1);
		drei = new BitFlags(0);
		vier = new BitFlags(1);
		fuenf = new BitFlags(2147483647);

		// Besondere Indexmoeglichkeiten
		indexMin = 0;
		indexNormal= 15; // "normal" means something like "in the middle"
		indexMax = 31;
		indexNotEnough = -1;
		indexTooMuch = 32;
	}

	@Test
	public void testIsSetNormal() {
		// Test des Normalfalls beim Index
		assertTrue(eins.isSet(indexNormal) == false);
		assertTrue(zwei.isSet(indexNormal) == true);
		assertTrue(drei.isSet(indexNormal) == false);
		assertTrue(vier.isSet(indexNormal) == false);
		assertTrue(fuenf.isSet(indexNormal) == true);
	}

	@Test
	public void testIsSetExtrem() {
		// Test der Extremwerte beim Index
		assertTrue(eins.isSet(indexMin) == false);
		assertTrue(eins.isSet(indexMax) == true);

		assertTrue(zwei.isSet(indexMin) == true);
		assertTrue(zwei.isSet(indexMax) == true);

		assertTrue(drei.isSet(indexMin) == false);
		assertTrue(drei.isSet(indexMax) == false);

		assertTrue(vier.isSet(indexMin) == true);
		assertTrue(vier.isSet(indexMax) == false);

		assertTrue(fuenf.isSet(indexMin) == true);
		assertTrue(fuenf.isSet(indexMax) == false);
	}

	@Test
	public void testIsSetFalseIndex() {
		/* Test unzulaessiger Indexeingaben
		 * Eine Warnausgabe erscheint auf der Konsole.
		 * Der Index wird auf noch zulaessigen Minmal- oder Maximal-Wert gesetzt.
		 * (Die Methoden swap, switchOn und switchOff greifen fruehzeitig auf isSet zu
		 * liefern so ebenfalls diese Warnung, danach arbeiten die mit dem neuen Index.)
		*/
		assertTrue(eins.isSet(indexNotEnough) == eins.isSet(indexMin));
		assertTrue(eins.isSet(indexTooMuch) == eins.isSet(indexMax));

		assertTrue(zwei.isSet(indexNotEnough) == zwei.isSet(indexMin));
		assertTrue(zwei.isSet(indexTooMuch) == zwei.isSet(indexMax));

		assertTrue(drei.isSet(indexNotEnough) == drei.isSet(indexMin));
		assertTrue(drei.isSet(indexTooMuch) == drei.isSet(indexMax));

		assertTrue(vier.isSet(indexNotEnough) == vier.isSet(indexMin));
		assertTrue(vier.isSet(indexTooMuch) == vier.isSet(indexMax));

		assertTrue(fuenf.isSet(indexNotEnough) == fuenf.isSet(indexMin));
		assertTrue(fuenf.isSet(indexTooMuch) == fuenf.isSet(indexMax));
	}

	@Test
	public void testSwitchOnNormal() {
		eins.switchOn(indexNormal);
		assertTrue(eins.isSet(indexNormal) == true);
		zwei.switchOn(indexNormal);
		assertTrue(zwei.isSet(indexNormal) == true);
		drei.switchOn(indexNormal);
		assertTrue(drei.isSet(indexNormal) == true);
		vier.switchOn(indexNormal);
		assertTrue(vier.isSet(indexNormal) == true);
		fuenf.switchOn(indexNormal);
		assertTrue(fuenf.isSet(indexNormal) == true);
	}

	@Test
	public void testSwitchOnExtrem() {
	eins.switchOn(indexMin);
	eins.switchOn(indexMax);
	assertTrue(eins.isSet(indexMin) == true);
	assertTrue(eins.isSet(indexMax) == true);

	zwei.switchOn(indexMin);
	zwei.switchOn(indexMax);
	assertTrue(zwei.isSet(indexMin) == true);
	assertTrue(zwei.isSet(indexMax) == true);

	drei.switchOn(indexMin);
	drei.switchOn(indexMax);
	assertTrue(drei.isSet(indexMin) == true);
	assertTrue(drei.isSet(indexMax) == true);

	vier.switchOn(indexMin);
	vier.switchOn(indexMax);
	assertTrue(vier.isSet(indexMin) == true);
	assertTrue(vier.isSet(indexMax) == true);

	fuenf.switchOn(indexMin);
	fuenf.switchOn(indexMax);
	assertTrue(fuenf.isSet(indexMin) == true);
	assertTrue(fuenf.isSet(indexMax) == true);
	}

	@Test
	public void testSwitchOffNormal() {
		eins.switchOff(indexNormal);
		assertTrue(eins.isSet(indexNormal) == false);
		zwei.switchOff(indexNormal);
		assertTrue(zwei.isSet(indexNormal) == false);
		drei.switchOff(indexNormal);
		assertTrue(drei.isSet(indexNormal) == false);
		vier.switchOff(indexNormal);
		assertTrue(vier.isSet(indexNormal) == false);
		fuenf.switchOff(indexNormal);
		assertTrue(fuenf.isSet(indexNormal) == false);
	}

	@Test
	public void testSwitchOffExtrem() {
	eins.switchOff(indexMin);
	eins.switchOff(indexMax);
	assertTrue(eins.isSet(indexMin) == false);
	assertTrue(eins.isSet(indexMax) == false);

	zwei.switchOff(indexMin);
	zwei.switchOff(indexMax);
	assertTrue(zwei.isSet(indexMin) == false);
	assertTrue(zwei.isSet(indexMax) == false);

	drei.switchOff(indexMin);
	drei.switchOff(indexMax);
	assertTrue(drei.isSet(indexMin) == false);
	assertTrue(drei.isSet(indexMax) == false);

	vier.switchOff(indexMin);
	vier.switchOff(indexMax);
	assertTrue(vier.isSet(indexMin) == false);
	assertTrue(vier.isSet(indexMax) == false);

	fuenf.switchOff(indexMin);
	fuenf.switchOff(indexMax);
	assertTrue(fuenf.isSet(indexMin) == false);
	assertTrue(fuenf.isSet(indexMax) == false);
	}

	@Test
	public void testSwapNormal() {
		//Nur dieser Test, da alle von swap benutzten Methoden zuvor intensiv getestet
		assertTrue(eins.isSet(indexNormal) == false);
		eins.swap(indexNormal); //aus false wird true
		assertTrue(eins.isSet(indexNormal) == true);
		eins.swap(indexNormal); //aus true wird false
		assertTrue(eins.isSet(indexNormal) == false);
	}
}
