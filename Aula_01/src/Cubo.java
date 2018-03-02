
public class Cubo extends FiguraTridimensional implements Volume{

	private double base;
	
	public Cubo(Quadrado quadrado) {
		this.base = quadrado.getBase();
	}
	
	
	@Override
	public double volume() {
		double v = base * 3;
		return v;
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();
	}

}
