
public class Circulo extends FiguraBidimensional {
	
	private double pi;
	private double raio;
	
	public Circulo(double raio) {
		this.pi = 3.14;
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return pi * (raio*raio);
	}

	@Override
	public double perimetro() {
		double perimetro = (2 * pi) * raio;
		return perimetro;
	}
	
	public String toString() {

		return "Area: "+area()+"\nPerimetro: "+perimetro();
	}
}
