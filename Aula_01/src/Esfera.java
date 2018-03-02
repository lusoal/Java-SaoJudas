
public class Esfera extends FiguraTridimensional implements Volume {

	private double raio, pi;
	
	public Esfera(Circulo circulo){
		this.raio = circulo.getRaio();
		this.pi = circulo.getPi();
	}
	
	@Override
	public double volume() {
		double vol = (4*pi*(Math.pow(raio,3))/3);
		return vol;
		
	}

	@Override
	public String toString() {
		return "Volume: "+volume();
	}
	
	
}
