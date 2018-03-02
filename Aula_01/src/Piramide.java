
public class Piramide extends FiguraTridimensional implements Volume{

	private double base, altura;
	
	public Piramide(Triangulo triangulo) {
		this.base = triangulo.getBase();
		this.altura = triangulo.getAltura();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double volume() {
		double v = ((base*base)*altura)/3;
		return v;
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();
	}


}
