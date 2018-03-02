
public class Trapezio extends Poligono{

	private double baseMaior;
	private double ladoA;
	private double ladoB;
	
	public Trapezio(double base, double altura, double baseMaior, double ladoA, double ladoB){
		super(base, altura);
		this.baseMaior = baseMaior;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	@Override
	public double area() {
		
		double a = ((super.getBase()+ baseMaior )* super.getAltura())/2;
		return a;
	}
	
	@Override
	public double perimetro() {
		
		double p = super.getBase() + baseMaior + ladoA + ladoB;
		return p;
	}

	@Override
	public String toString() {
		
		return "Area: "+area()+"\nPerimetro: "+perimetro();
		
	}

}
