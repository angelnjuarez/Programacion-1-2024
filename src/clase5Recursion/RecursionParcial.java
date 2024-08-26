package clase5Recursion;

public class RecursionParcial {

	public static String espejar(String s) {
		if (s.length() == 0) {
			return "";
		}
		return s.charAt(0) + espejar(s.substring(1)) + s.charAt(0);
	}
}
