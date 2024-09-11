package clase02Practica0;

public class SinRepetidos {

	public static String sinRepetidos(String s) {
		String nueva = "";
		for (int i = 0; i < s.length(); i++) {
			if (nueva.indexOf(s.charAt(i)) == -1) {
				nueva = nueva + s.charAt(i);
			}
		}
		return nueva;
	}

	public static void main(String[] args) {
		String x = "casos";
		System.out.println(sinRepetidos(x));
	}

}
