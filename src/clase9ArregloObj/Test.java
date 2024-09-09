package clase9ArregloObj;

public class Test {
	public static void main(String[] args) {
		Mazo mazo1 = new Mazo();
		mazo1.cartas[0].mostrar();
		Mazo mazo2 = mazo1.copiaSuperficial();
		Mazo mazo3 = mazo1.copiaProfunda();
		mazo2.cartas[0].palo = 2;
		mazo2.cartas[0].mostrar();
		// Mazo1 y Mazo2 son iguales debido al aliasing.
		System.out.println(mazo1.equals(mazo2));
		// Mazo3 no tiene cambios, por eso da false.
		System.out.println(mazo1.equals(mazo3));
	}
}
