/**
* VInteger-Klasse
* @version 1.0
* @author
*/
public class VInteger extends Integer implements Vergleichbar {

	public VInteger(int w) {
		super(w);
	}

	@Override
	public int vergleicheMit(Vergleichbar obj) {
		VInteger VIn1 = (VInteger)this;
		VInteger VIn2 = (VInteger)obj; // Voraussetzung: obj ist auch ein VInteger!
		if (VIn1.getWert() == VIn2.getWert())
			return 0;
		else if (VIn1.getWert() < VIn2.getWert())
			return -1;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "VInteger mit Wert = " + getWert();
	}

}
