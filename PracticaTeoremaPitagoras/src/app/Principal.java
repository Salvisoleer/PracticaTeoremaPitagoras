package app;

import clases.TrianguloRectangulo;

public class Principal {
	
	
	public static void main(String[] args) {
		//Catetos aleatorios entre 1 y 10
		int a = (int) (Math.random() *10) +1;
		int b = (int) (Math.random() * 10) +1;
		
		//Triángulo con catetos aleatorios
		TrianguloRectangulo t1 = new TrianguloRectangulo(a,b);
		TrianguloRectangulo t2 = new TrianguloRectangulo();
		
		//Cálculo de área y perímetro (no se imprimen)
		double area1 = t1.getArea();
		double perimetro1 = t1.getPerímetro();
		
		double area2 = t2.getArea();
		double perimetro2 = t2.getPerímetro();
		
		//Valores visibles en el depurador de eclipse
	}
}
