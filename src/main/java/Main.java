/**
 * Esta clase representa un programa simple que realiza operaciones matemáticas básicas.
 */
public class Main {

	public static void main(String[] args) throws Exception {
		try {
			int valor1 = 0;
			int valor2 = 0;
			String op = "";
			int res = 0;

			valor1 = Integer.parseInt(args[0]);
			valor2 = Integer.parseInt(args[1]);
			op = args[2];

			if ("+".equals(op)) {
				res = suma(valor1, valor2);
			} else if ("-".equals(op)) {
				res = resta(valor1, valor2);
			} else if ("x".equals(op)) {
				res = multiplica(valor1, valor2);
			} else if ("/".equals(op)) {
				res = divide(valor1, valor2);
			} else {
				throw new IllegalArgumentException("Valor inesperado: " + op);
			}
			System.out.print("El resultado de " + valor1 + " " + op + " " + valor2 + " = " + res);
		} catch (Exception e) {
			System.out.print("Ha ocurrido un error: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Realiza una suma de dos valores enteros.
	 *
	 * @param valor1 El primer valor a sumar.
	 * @param valor2 El segundo valor a sumar.
	 * @return El resultado de la suma.
	 */
	public static int suma(int valor1, int valor2) {
		int v1 = valor1;
		int v2 = valor2;
		int resultado = v1 + v2;
		return resultado;
	}

	/**
	 * Realiza una resta de dos valores enteros.
	 *
	 * @param valor1 El valor del cual se resta.
	 * @param valor2 El valor a restar.
	 * @return El resultado de la resta.
	 */
	public static int resta(int valor1, int valor2) {
		int v1 = valor1;
		int v2 = valor2;
		int resultado = v1 - v2;
		return resultado;
	}

	/**
	 * Realiza una multiplicación de dos valores enteros.
	 *
	 * @param valor1 El primer valor a multiplicar.
	 * @param valor2 El segundo valor a multiplicar.
	 * @return El resultado de la multiplicación.
	 */
	public static int multiplica(int valor1, int valor2) {
		int v1 = valor1;
		int v2 = valor2;
		int resultado = v1 * v2;
		return resultado;
	}

	/**
	 * Realiza una división de dos valores enteros.
	 *
	 * @param valor1 El valor del cual se divide.
	 * @param valor2 El valor divisor.
	 * @return El resultado de la división.
	 * @throws ArithmeticException Si se intenta dividir por cero.
	 */
	public static int divide(int valor1, int valor2) {
		int v1 = valor1;
		int v2 = valor2;
		if (v2 == 0) {
			throw new ArithmeticException("División por cero no permitida.");
		}
		int resultado = v1 / v2;
		return resultado;
	}
}
