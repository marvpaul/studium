
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
		String ausgabe = "";
		ausgabe += "Die x-Koordinate des Mittelpunktes lautet: " + getAnker().getX() + "\n";
		ausgabe += "Die y-Koordinate des Mittelpunktes lautet: " + getAnker().getY() + "\n";
		ausgabe += "Der Radius lautet: " + radius + "\n";
		return ausgabe;
	}

}
