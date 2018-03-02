
public class Quadrilatero extends Poligono {

	public Quadrilatero(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		return super.getBase() * super.getAltura();
	}

	@Override
	public double perimetro() {
		double perimetro = (super.getBase() * 4);
		return perimetro;
	}

	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}
	
	

}
