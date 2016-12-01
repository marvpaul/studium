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
		VInteger vergleichVIn = (VInteger)obj; // Voraussetzung: obj ist auch ein VInteger!
		if (this.getWert() == vergleichVIn.getWert())
			return 0;
		else if (this.getWert() < vergleichVIn.getWert())
			return -1;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "VInteger mit Wert = " + getWert();
	}

}
