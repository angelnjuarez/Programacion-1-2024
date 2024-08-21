package clase4Recursion;

public class RecursionMoodle {

	/*
	 * Ej 2
	 */
	public static void imprimirHasta(int n) {
		if (n == 1) {
			System.out.print(n + " ");
			return;
		} else {
			imprimirHasta(n - 1);
			System.out.print(n + " ");
		}
	}

	/*
	 * 5
	 */
	public static int cantidadPrimosEntre(int n, int m) {
		// caso base
		if (n > m) {
			return 0;
		}
		// caso recursivo
		if (esPrimo(n)) {
			return 1 + cantidadPrimosEntre(n + 1, m);
		}
		return cantidadPrimosEntre(n + 1, m);
	}

	// Auxiliar
	public static boolean esPrimo(int m) {
		for (int i = 2; i < m; i++) {
			if (m % i == 0) {
				return false;
			}
		}
		return true;
	}

	/*
	 * 6
	 */
	public static int siguientePrimo(int n) {
		if (esPrimo(n + 1)) {
			return n + 1;
		}
		return siguientePrimo(n + 1);
	}

	/*
	 * Ej 7
	 */
	public static boolean esPar(int n) {
		// caso base
		if (n == 0) {
			return true;
		}
		if (n == 1) {
			return false;
		}
		// caso recursivo
		return esPar(n - 2);
	}

	/*
	 * Ej 8
	 */
	public static int cantidadDeDigitos(int n) {
		if (n < 10) {
			return 1;
		}
		return 1 + cantidadDeDigitos(n / 10);
	}

	public static void main(String[] args) {
		// imprimirHasta(6);
		// System.out.println(cantidadPrimosEntre(8, 18));
		// System.out.println(siguientePrimo(13));
		// System.out.println(esPar(7));
		//System.out.println(cantidadDeDigitos(382940));
	}
}
