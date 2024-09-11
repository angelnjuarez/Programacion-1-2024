package clase02Practica0;

import java.util.Scanner;

public class PonerNota {

	public static void promedioDeDosNotas(double n1, double n2) {
		double promedio = (n1 + n2) / 2;

		if (promedio >= 7) {
			System.out.println("Promocionó");
		} else {
			if (promedio >= 4) {
				System.out.println("Aprobó, debe final");
			} else {
				System.out.println("Debe recursar");
			}
		}
	}

	public static void main(String[] args) {
		double n1, n2;
		Scanner sca = new Scanner(System.in);
		System.out.println("Ingrese una nota");
		n1 = sca.nextDouble();
		System.out.println("Ingrese otra nota");
		n2 = sca.nextDouble();
		promedioDeDosNotas(n1, n2);
	}

}
