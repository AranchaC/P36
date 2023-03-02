package P46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasosTest {

	@Test
	void testValoracion1() {
		String esperado = "Lleva una vida sedentaria";
		Pasos aran = new Pasos (600); 
		String valoracion = aran.Valoracion(esperado);
		assertEquals(esperado, valoracion);				
	}
	
	@Test
	void testValoracion2() {
		String esperado = "Lleva una vida poco activa";
		Pasos aran = new Pasos (1500); 
		String valoracion = aran.Valoracion(esperado);
		assertEquals(esperado, valoracion);				
	}
	
	@Test
	void testValoracion3() {
		String esperado = "Se acerca al objetivo";
		Pasos aran = new Pasos (3550); 
		String valoracion = aran.Valoracion(esperado);
		assertEquals(esperado, valoracion);				
	}
	
	@Test
	void testValoracion4() {
		String esperado = "No está mal";
		Pasos aran = new Pasos (5555); 
		String valoracion = aran.Valoracion(esperado);
		assertEquals(esperado, valoracion);				
	}
	
	@Test
	void testValoracion5() {
		String esperado = "Así se hace";
		Pasos aran = new Pasos (30000); 
		String valoracion = aran.Valoracion(esperado);
		assertEquals(esperado, valoracion);				
	}

}
