
public class Quadrado extends Quadrilatero implements Diagonal{

	public Quadrado(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double diagonal() {
		
		double base = super.getBase();
		double altura = super.getAltura();
		
		double pitagoras = Math.sqrt((base*base)+(altura*altura));
		
		return pitagoras;
	}
	
	@Override
	public String toString() {
		return "Area: "+area()+"\nPerimetro: "+perimetro()+"\nDiagonal: "+diagonal();
	}
	
}
