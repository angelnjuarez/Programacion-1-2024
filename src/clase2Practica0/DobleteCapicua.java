package clase2Practica0;

public class DobleteCapicua {
	public static boolean esCapicua(String s) {
		String nueva = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			nueva = nueva + s.charAt(i);
		}
		return s.equals(nueva);
	}

	public static boolean dobleteCapicua(String s) {
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			s1 = s.substring(i);
			s2 = s.substring(0, i);
			if (esCapicua(s1) && esCapicua(s2)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(dobleteCapicua("neuquenor"));

	}

}
