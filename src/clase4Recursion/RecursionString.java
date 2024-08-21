package clase4Recursion;

public class RecursionString {

	/*
	 * Ej 1
	 */
	public static int longitud(String s) {
		// caso base
		if (s.length() == 0) {
			return 0;
		}
		// caso recursivo
		return 1 + longitud(s.substring(1));
	}

	/*
	 * Ej 2
	 */
	public static String reverso(String s) {
		// caso base
		if (s.isEmpty()) { // Es equivalente a s.length()==0
			return s;
		}
		// caso recursivo
		return reverso(s.substring(1)) + s.charAt(0);
	}

	/*
	 * Ej 3
	 */
	public static String combinar(String s, String t) {
		// caso base
		if (s.length() == 0) {
			return s;
		}
		if (t.length() == 0) {
			return t;
		}
		// caso recursivo
		if (s.charAt(0) <= t.charAt(0)) {
			return s.charAt(0) + combinar(s.substring(1), t.substring(1));
		} else {
			return t.charAt(0) + combinar(s.substring(1), t.substring(1));
		}
	}
}
