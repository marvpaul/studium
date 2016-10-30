
public class Kreis extends Figur{
	private	double radius;
	
	public Kreis(double rad, Punkt anker){
		super(anker);
		radius = rad;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double berechneFlaeche(){
		double flaechenInhalt = radius * radius * Math.PI;
		return flaechenInhalt;
	}

	public double berechneUmfang(){
		double umfang = 2 * Math.PI * radius;
		return umfang;
	}

	public String toString(){
		String ausgabe = super.toString();
		ausgabe += "Der Radius lautet: " + radius + "\n";
		return ausgabe;
	}

}
