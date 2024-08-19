package clase2Practica0;

import java.util.Scanner;

public class Divisible {

	public static boolean esDivisible(int n, int m) {
		return n % m == 0;
	}

	public static int ingresarNroEntero() {
		Scanner sca = new Scanner(System.in);
		System.out.println("Ingrese un entero");
		return sca.nextInt();
	}

	public static void main(String[] args) {
		int n = ingresarNroEntero();
		int m = ingresarNroEntero();
		System.out.println(esDivisible(n, m));
	}

}
