/**
 *
 * @author:
 *
 */
public class Binary {

	public static String inBinary(int a){
		String binary = "";				// erstmal leerer Ausgabe-String
		for(int i = 0; i < 32; i++){	// 32mal, weil ein int 32 Bits hat
			if((a & 1) == 1)			// sieht nach, ob letztes Bit == 1
				binary = 1 + binary;	// dann 1 vorne an den Ausgabe-String anfuegen
			else
				binary = 0 + binary;	// sonst 0 anfuegen
			a = a >> 1;					// "schiebt" Bitfolge nach rechts
		}
		// Ausgabe ist ein 32-Stellen langer String, ggf. mit fuehrenden Nullen
		return binary; 
	}

}
