package clase06Objetos;

public class RecursionCierre {
	public static String repetirLetras(String s) {
		// caso base
		if (s.length() == 1) {
			return s;
		}
		// caso recursivo
		if (esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
			return "" + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1));
		} else {
			if (!esVocal(s.charAt(0)) && !esVocal(s.charAt(1))) {
				return "" + s.charAt(0) + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1));
			}
			return "" + s.charAt(0) + repetirLetras(s.substring(1));
		}
	}

	public static boolean esVocal(char c) {
		String aux = "aAeEiIoOuU";
		if (aux.indexOf(c) == -1) {
			return false;
		}
		return true;
		// return aux.indexOf(c)==-1?false:true;
	}

	public static void main(String[] args) {
		System.out.println("" + repetirLetras("bcd"));
	}

}
