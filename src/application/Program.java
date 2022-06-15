package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Retangulo;
import entities.TrianguloRetangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha a forma:");
		System.out.println("Retangulo: R");
		System.out.println("Circulo: C");
		System.out.println("Triangulo Retangulo: T");
		Character forma = sc.nextLine().charAt(0);
		double area = 0.0;
		double perimetro = 0.0;
		if (forma == 'R') {
			System.out.print("Digite a altura do retangulo: ");
			double altura = sc.nextDouble();
			System.out.print("Digite a base do retangulo: ");
			double base = sc.nextDouble();

			Retangulo retangulo = new Retangulo(altura, base);
			area = retangulo.area();
			perimetro = retangulo.perimetro();

		} else if (forma == 'C') {
			System.out.print("Digite o raio do circulo: ");
			double raio = sc.nextDouble();

			Circulo circulo = new Circulo(raio);

			area = circulo.area();
			perimetro = circulo.perimetro();

		} else {
			System.out.print("Digite a altura do triangulo retangulo: ");
			double altura = sc.nextDouble();
			System.out.print("Digite a base triangulo retangulo: ");
			double base = sc.nextDouble();

			TrianguloRetangulo triangulo = new TrianguloRetangulo(base, altura);
			
			area = triangulo.area();
			perimetro = triangulo.perimetro();
			
		}
		System.out.println();
		System.out.println("Valores:");
		System.out.printf("Área: %.2f %n", area);
		System.out.printf("Perimetro: %.2f %n", perimetro);
		sc.close();
	}

}
