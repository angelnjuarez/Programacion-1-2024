package clase02Practica0;

import java.util.Scanner;

public class Abecedaria {

	public static boolean esAbecedaria(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Ingrese una cadena");
		String a = sca.next();
		System.out.println(esAbecedaria(a));

	}
}
