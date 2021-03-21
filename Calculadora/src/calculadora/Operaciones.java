package calculadora;

public class Operaciones {
	
	/**
	 * este metodo sirve para sumar
	 * @param variable a, que es el primer operando de la suma
	 * @param variable b, que es el segundo operando de la suma
	 * @return variable c, que es el resultado de la operacion
	 */

	public int suma(int a ,int b) {
		
		int c = 0;
		c = a+b;
		return c;
	}
	
	/**
	 * este metodo sirve para restar
	 * @param variable a, que es el primer operando de la resta
	 * @param variable b, que es el segundo operando de la resta
	 * @return variable c, que es el resultado de la operacion
	 */
	
	public int resta (int a, int b) {
		
		int c=0;
		c= a-b;
		
		return c;
	}
	
	/**
	 * este metodo sirve para dividir
	 * @param variable a, que es el primer operando de la division
	 * @param variable b, que es el segundo operando de la division
	 * @return variable c, que es el resultado de la operacion
	 */
	
	public int division (int a, int b) {
		
		int c=0;
		c=a%b;
		
		return c;
	}
	
	/**
	 * este metodo sirve para multiplicar
	 * @param variable a, que es el primer operando de la multiplicacion
	 * @param variable b, que es el segundo operando de la multiplicacion
	 * @return variable c, que es el resultado de la operacion
	 */
	
	public int multiplicacion (int a, int b) {
		
		int c=0;
		c=a*b;
		
		return c;
	}
	
}
