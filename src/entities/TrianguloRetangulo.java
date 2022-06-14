package entities;

public class TrianguloRetangulo extends Forma {

	private double base;
	private double altura;
	
	public TrianguloRetangulo() {
	}
	
	public TrianguloRetangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		double hipotenusa = Math.sqrt(altura * altura + base * base);
		return hipotenusa + altura + base;
	}

	@Override
	public double area() {
		return base * altura / 2;
	}

}