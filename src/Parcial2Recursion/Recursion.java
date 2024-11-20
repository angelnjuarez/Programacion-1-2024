package Parcial2Recursion;

public class Recursion {

	public static String duplicarLetras(String s, char a, char b) {
		if (s.length() == 1) {
			return s;
		}
		if (s.charAt(0) == a && s.charAt(1) == b) {
			return "" + s.charAt(0) + s.charAt(0) + duplicarLetras(s.substring(1), a, b);
		}
		return s.charAt(0) + duplicarLetras(s.substring(1), a, b);
	}
	
	public static void main(String[] args) {
		System.out.println(duplicarLetras("contorsion",'o','n'));
	}

}
