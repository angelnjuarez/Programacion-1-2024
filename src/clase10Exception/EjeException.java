package clase10Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjeException {

	/**
	 * Recibe un String, y si no es vacio retorna el char a
	 * @param String
	 * @return 'a'
	 **/
	static char noVacioEntoncesA(String s) {
		if (s.length() == 0) {
			// System.out.println("El String está vacio");
			throw new RuntimeException("El String está vacio");
		}
		return 'a';
	}

	public static void main(String[] args) {

		/**
		 * Excepciones de Java: ArithmeticException
		 **/
		// int i = 10/0;

		/**
		 * Error al parsear
		 **/
		// String s = "5d";
		// int x = Integer.parseInt(s);

		/**
		 * Bloque try/catch
		 **/
//		String abc = "abcdefghijklmnopqrstuvwxyz";
//		boolean ok = false;
//		while (!ok) {
//			try {
//				Scanner scan = new Scanner(System.in);
//				System.out.println("Ingrese el numero de letra del abecedario " + "que quiere consultar:");
//				int i = scan.nextInt();
//
//				System.out.println("La letra numero " + i + " es " + abc.charAt(i - 1));
//				ok = true;
//			} catch (StringIndexOutOfBoundsException ex) {
//				System.out.println("El numero debe estar entre 1 y " + abc.length());
//			} catch (InputMismatchException ex) {
//				System.out.println("El valor ingresado no es un numero");
//			} catch (Exception ex) {
//				System.out.println("Tuve otro problema: " + ex.toString());
//			}
//		}

		/**
		 * Excepciones propias
		 **/

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ingrese una cadena");
			String s = scan.nextLine();
			System.out.println(noVacioEntoncesA(s));
		} catch (Exception ex) {
			System.out.println("Se produjo el error: " + ex.getMessage());
		} finally {
			System.out.println("Siempre se ejecuta esto, haya o no un error");
		}
		System.out.println("Llegué acá, se capturaron correctamente las excepciones");

	}
}