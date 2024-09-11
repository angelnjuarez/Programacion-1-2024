package clase04Recursion;

public class RecursionPractica {

	/*
	 * Ej 32
	 */
	public static void collatz(int n) {
		// caso base
		if (n == 1) {
			System.out.println();
			return;
		}
		// caso recursivo
		if (n % 2 == 0) {
			System.out.print(n / 2 + " ");
			collatz(n / 2);
		} else {
			System.out.print(3 * n + 1 + " ");
			collatz(3 * n + 1);
		}
	}

	/*
	 * Ej 33
	 */
	public static int mcd(int a, int b) {
		// caso base
		if (a % b == 0) {
			return b;
		}
		// caso recursivo
		return mcd(b, a % b);
	}

	/*
	 * Función auxiliar resto Devuelve una cadena s sin su primer caracter
	 */
	public static String resto(String s) {
		String nueva = "";
		for (int i = 1; i < s.length(); i++) {
			nueva = nueva + s.charAt(i);
		}
		return nueva;
	}

	// Alternativa a resto: s = s.substring(1)

	/*
	 * Ej 34
	 */
	public static String concatenarAst(String s) {
		if (s.length() == 1) {
			return s;
		}
		return s.charAt(0) + "*" + concatenarAst(s.substring(1));
	}

	/*
	 * Ej 35
	 */
	public static String eliminarContiguos(String s) {
		// caso base
		if (s.length() == 1) {
			return s;
		}
		// caso recursivo
		if (s.charAt(0) == s.charAt(1)) {
			return eliminarContiguos(s.substring(1));
		}
		return s.charAt(0) + eliminarContiguos(s.substring(1));
	}

	public static void main(String[] args) {
		// System.out.println(mcd(36, 20));
		// System.out.println(concatenarAst("Hola"));
		//System.out.println(eliminarContiguos("gggeeeeeuddduuu"));
		//collatz(6);
	}
}
