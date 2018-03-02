
public class Cilindro extends FiguraTridimensional implements Volume {
	
	private double altura, raio, pi;
	
	public Cilindro(Circulo circulo, double altura) {
		
		this.raio = circulo.getRaio();
		this.pi = circulo.getPi();
		this.altura = altura;
	}

	@Override
	public double volume(){
		double v = pi*(Math.pow(raio, 3)*altura);
		return v;
	}

	@Override
	public String toString() {
		return "Volume: "+volume();
	}
}
