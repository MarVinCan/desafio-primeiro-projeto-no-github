package entities;

public class Circulo extends Forma{
	
	private double raio;
	
	public Circulo() {
		
	}
	
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double perimetro() {
		
		return 2 * Math.PI * raio;
	}

	@Override
	public double area() {
		
		return Math.PI * raio * raio;
	}
	
	
}
