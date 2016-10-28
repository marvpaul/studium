
public class Punkt {
	private double x;
	private double y;

	// Konstruktor
	public Punkt(double a, double b){
		x = a;
		y = b;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void verschiebe(double verschiebungX, double verschiebungY){
		x += verschiebungX;
		y += verschiebungY;
	}

	public String toString(){
		String ausgabe = "";
		ausgabe += "Die x-Koordinate lautet: " + x + "\n";
		ausgabe += "Die y-Koordinate lautet: " + y + "\n";
		return ausgabe;
	}

}
