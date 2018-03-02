
public class NaoQuadrilatero extends Poligono {
	
	public NaoQuadrilatero(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {

		return (super.getBase() * super.getAltura())/2;
		
	}

	@Override
	public double perimetro() {
		
		double base = super.getBase();
		double altura = super.getAltura();
		
		double perimetro = (Math.sqrt((base*base)+(altura*altura))) + base + altura; 
		
		return perimetro;
		
	}

	@Override
	public String toString() {
		
		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}
	
	

}
