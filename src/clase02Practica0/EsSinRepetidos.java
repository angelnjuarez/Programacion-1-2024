package clase02Practica0;

public class EsSinRepetidos {

	public static boolean esSinRepetidos(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String x = "caso";
		System.out.println(esSinRepetidos(x));

	}
}
