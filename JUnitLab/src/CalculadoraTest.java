import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		int esperado = 5;
		int suma = Calculadora.sumar(3, 2);
		assertEquals(esperado, suma);		
	}
	
	@Test
	void testResta() {
		int esperado = 4;
		int resta = Calculadora.restar(7, 3);
		assertEquals(esperado, resta);
	}
	
	@Test
	void testDivision() {
		int esperado = 7;
		int division = Calculadora.dividir(21, 3);
		assertEquals(esperado, division);
	}
	
	@Test
	void testMultiplicar() {
		int esperado = 30;
		int multiplicacion = Calculadora.multiplicar(4, 8);
		assertEquals(esperado, multiplicacion);
	}

}
