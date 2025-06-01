package test;
import clases.TrianguloRectangulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testTrianguloRectangulo {

	@Test
	public void testAreaPorDefecto() {
		TrianguloRectangulo t = new TrianguloRectangulo();
        assertEquals(0.5, t.getArea());
	}
	@Test
    public void testPerimetroPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        double esperado = 1 + 1 + Math.sqrt(2); // a + b + hipotenusa
        assertEquals(esperado, t.getPerimetro(), 0.0001);
    }

    @Test
    public void testHipotenusaPorDefecto() {
        TrianguloRectangulo t = new TrianguloRectangulo();
        assertEquals(Math.sqrt(2), t.getHipotenusa(), 0.0001);
    }

    @Test
    public void testAreaConValores() {
        TrianguloRectangulo t = new TrianguloRectangulo(4, 6);
        assertEquals(12.0, t.getArea());
    }

    @Test
    public void testPerimetroConValores() {
        TrianguloRectangulo t = new TrianguloRectangulo(3, 4);
        double esperado = 3 + 4 + 5; // hipotenusa = 5
        assertEquals(esperado, t.getPerimetro(), 0.0001);
    }

    @Test
    public void testCatetoCero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TrianguloRectangulo(0, 5);
        });
    }

    @Test
    public void testCatetoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new TrianguloRectangulo(3, -2);
        });
    }
}

