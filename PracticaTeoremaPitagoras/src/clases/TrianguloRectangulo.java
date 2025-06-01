package clases;
/**
 * Representa un triángulo rectángulo con catetor a y b
 */
public class TrianguloRectangulo {
	private int a;
	private int b;
	
	/**
	 *Constructor por defecto. Catetos a = 1 y b = 1.
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/**
	 * Constructor con parametros
	 * @param a Cateto a (mayor que 0)
	 * @param b Cateto b (mayor que 0)
	 */
	public TrianguloRectangulo(int a, int b) {
		if(a <= 0 || b<= 0) {
			throw new IllegalArgumentException("Los catetos deben ser mayores que 0");
		}
		this.a = a;
		this.b = b;
		
	}
	
	/**
	 * Calcula el área del triángulo rectángulo
	 * @return Área como double
	 */
	public double getArea() {
		return(a*b)/2;
	}
	
	/**
	 * @return 0 (se implementará mas tarde)
	 */
	public double getHipotenusa() {
		return 0;
	}
	/**
	 * Calcula el perímetro.
	 * @return Perímetro como double
	 */
	public double getPerímetro() {
		return a + b + getHipotenusa();
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		if(a <= 0) throw new IllegalArgumentException("El cateto debe ser mayor que 0");
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		if (b <= 0) throw new IllegalArgumentException("El cateto debe ser mayor que 0");
		this.b = b;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + "]";
	}
	
		
	
}
