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
		VInteger vergleichVIn;
		if (obj instanceof VInteger)
			vergleichVIn = (VInteger)obj;
		else {
			System.out.println("Kann Objekte unterschiedlichen Typs nicht vergleichen!");
			return 0;
		}

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
