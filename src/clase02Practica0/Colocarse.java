package clase02Practica0;

public class Colocarse {
	public static boolean puedenColocarse(String a, String b, String c) {
		int i = 0;
		while (i < b.length()) {
			if (a.indexOf(b.charAt(i)) != -1) {
				i++;
				while (i < b.length()) {
					if (c.indexOf(b.charAt(i)) != -1) {
						return true;
					}
					i++;
				}
			}
			i++;
		}
		return false;

	}

	public static void main(String[] args) {
		String b = "BUENO";
		String a = "JUGO";
		String c = "ANANA";
		System.out.println(puedenColocarse(a, b, c));

	}
}
