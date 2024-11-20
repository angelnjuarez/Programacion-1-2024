package ParcialTarde2Recursion;

public class Recursion {

	public static String recortarAN(String s, int n) {
		if (s.length() == 0)
			return s;
		if (s.length() == n)
			return s;
		if (s.length() > n) {
			return recortarAN(s.substring(1), n);
		}
		return recortarAN(s.charAt(0) + s, n);
	}

	public static void main(String[] args) {
		System.out.println(recortarAN("casa", 3));
		System.out.println(recortarAN("x", 7) );
	}

}
