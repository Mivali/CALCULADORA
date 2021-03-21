package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Operaciones;


/**
 * @author AlumnoManana20-21
 * 
 */
class OperacionesTest {

	@Test
	void testSuma() {
		
		Operaciones op = new Operaciones();
		
		int resultado = op.suma(2, 2);
		assertEquals(4, resultado);
		
	
	}
	
	
	
	@Test
void testSuma2() {
		
		Operaciones op = new Operaciones();
		
		int resultado = op.suma(2, 3);
		assertEquals(5, resultado);
		
	
	}
}
