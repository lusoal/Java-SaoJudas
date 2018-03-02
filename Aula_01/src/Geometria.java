import java.util.ArrayList;
public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> figuras = new ArrayList<>();
		
		Circulo circulo = new Circulo(5);
		Losango losango = new Losango(15,5);
		Quadrado quadrado = new Quadrado(10,10);
		Retangulo retangulo = new Retangulo(15,10);
		Triangulo triangulo = new Triangulo(6,6);
		Trapezio trapezio = new Trapezio(10,4,5,8,8);
		Esfera esfera = new Esfera(circulo);
		Cilindro cilindro = new Cilindro(circulo,10);
		Piramide piramide = new Piramide(triangulo);
		Cubo cubo = new Cubo(quadrado);
		
		figuras.add(circulo);
		figuras.add(losango);
		figuras.add(quadrado);
		figuras.add(retangulo);
		figuras.add(triangulo);
		figuras.add(trapezio);
		figuras.add(esfera);
		figuras.add(cilindro);
		figuras.add(piramide);
		figuras.add(cubo);
		
		for(Figura fig:figuras) {
			
			String nomeClasse = fig.getClass().getName();
			
			System.out.println(nomeClasse+": \n"+fig+"\n");
			
		}
		
		
	}

}
