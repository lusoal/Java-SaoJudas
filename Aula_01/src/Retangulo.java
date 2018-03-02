
public class Retangulo extends Quadrilatero implements Diagonal{

	public Retangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double diagonal() {
		
		double base = super.getBase();
		double altura = super.getAltura();
		
		return Math.sqrt((base*base)+(altura*altura));	
	}


	@Override
	public double perimetro() {
		
		double perimetro = (2 * (super.getBase() + super.getAltura()));
		return perimetro ;
	}
	
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro()+"\nDiagonal: "+diagonal();
	}
	

}


