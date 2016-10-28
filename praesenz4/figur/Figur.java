
public class Figur {
	private Punkt anker;

	public Figur(Punkt p){
		anker = p;
	}

	public Punkt getAnker() {
		return anker;
	}

	public void setAnker(Punkt anker) {
		this.anker = anker;
	}

	public void verschiebeAnker(double a, double b){
		anker.verschiebe(a, b);
	}

	public String toString(){
		return anker.toString();
	}

}

