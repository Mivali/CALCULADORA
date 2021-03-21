package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		
		Operaciones c=new Operaciones();
		int res=c.suma(4,4);
		
		assertEquals(8,res);
		
		Operaciones c_2=new Operaciones();
		int res_2=c_2.resta(10,5);
		
		assertEquals(5, res_2);
		
		Operaciones c_3=new Operaciones();
		int res_3=c_3.division(30,3);
		
		assertEquals(10, res_3);
		
		Operaciones c_4=new Operaciones();
		int res_4=c_4.multiplicacion(2,10);
		
		assertEquals(20, res_4);
	}

}
