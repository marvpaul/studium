
public class FigurenTest {

	public static void main(String[] args) {
		// Ad-hoc-Teste fuer Punkt
		Punkt p = new Punkt(1.4, 1.3);
		System.out.println("Punkt:\n" + p);
		p.verschiebe(1.0, 1.0);
		System.out.println("Nach Verschiebung gilt:\n" + p);

		// Ad-hoc-Teste fuer Figur (Anker)
		Figur f = new Figur(p);
		System.out.println("Anker:\n" + f);
		f.verschiebeAnker(1.0, 1.0);
		System.out.println("Nach Verschiebung gilt:\n" + f);

		// Ad-hoc-Teste fuer Kreis
		double kRadius = 3;
		Punkt kPunkt = new Punkt(1.0, 2.0);
		Kreis k = new Kreis(kRadius, kPunkt);
		System.out.println("Kreis:\n" + k);
		k.getAnker().verschiebe(1.0, 1.5);
		System.out.println("Nach Verschiebung gilt:\n" + k);
		System.out.println("Der Flaecheninhalt des Kreises ist: " + k.berechneFlaeche() + "\n");
		System.out.println("Der Umfang des Kreises ist: " + k.berechneUmfang() + "\n");

		// Ad-hoc-Teste fuer Quadrat
		Quadrat q = new Quadrat(4.0, new Punkt(1.0, 1.0));
		System.out.println("Quadrat:\n" + q);
		q.verschiebeAnker(2.0, 1.5);
		System.out.println("Nach Verschiebung gilt:\n" + q);
		System.out.println("Der Flaecheninhalt des Quadrates ist: " + q.berechneFlaeche() + "\n");
		System.out.println("Der Umfang des Quadrates ist: " + q.berechneUmfang() + "\n");

		// Ad-hoc-Teste fuer Rechteck
		Rechteck r = new Rechteck(2.0, 3.0, new Punkt(2.0, 2.0));
		System.out.println("Rechteck:\n" + r);
		r.verschiebeAnker(0.5, 0.5);
		System.out.println("Nach Verschiebung gilt:\n" + r);
		System.out.println("Der Flaecheninhalt des Rechtecks ist: " + r.berechneFlaeche() + "\n");
		System.out.println("Der Umfang des Rechtecks ist: " + r.berechneUmfang() + "\n");
	}

}
