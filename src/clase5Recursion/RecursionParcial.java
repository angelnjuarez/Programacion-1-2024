package clase5Recursion;

public class RecursionParcial {

	/*
	 * Ej 1
	 */
	public static String espejar(String s) {
		if (s.length() == 0) {
			return "";
		}
		return s.charAt(0) + espejar(s.substring(1)) + s.charAt(0);
	}

//	public static String espejar1(String s) {
//		
//		
//		String nueva=reversa(s);
//		return s+nueva;
//	}

	/*
	 * Ej 2
	 */
	public static String estaPrimera(String s1, String s2) {
		if (s1.length() == 0 || s2.length() == 0) {
			return "";
		}
		if (s1.charAt(0) < s2.charAt(0)) {
			return s1;
		} else if (s1.charAt(0) == s2.charAt(0)) {
			return s1.charAt(0) + 
				   estaPrimera(s1.substring(1),
						       s2.substring(1));
		} else {
			return s2;
		}
	}

}
