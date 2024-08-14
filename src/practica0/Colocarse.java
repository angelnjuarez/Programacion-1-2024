package practica0;

public class Colocarse {

	//EJERCICIO A CORREGIR
	public static boolean puedenColocarse(String a, String b, String c) {
		for (int i = 0; i < b.length(); i++) {
			if (a.indexOf(b.charAt(i)) != -1) {
				i++;
				if (c.indexOf(b.charAt(i)) != -1) {
					return true;
				}
			}
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
