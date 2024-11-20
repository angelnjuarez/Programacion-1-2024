package Parcial4Listas;

public class ListaInt {
	NodoInt primero;

	public ListaInt() {

	}

	public void agregarAtras(int e) {
		NodoInt nuevo = new NodoInt(e);
		if (this.primero == null) {
			this.primero = nuevo;
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
		}
		actual.siguiente = nuevo;
	}

	public void imprimir() {
		System.out.print("[");
		NodoInt actual = this.primero;
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
	}

	/*
	 * Ejercicio Listas
	 */
	public ListaInt sublistaDesdePos(int pos, int n) {
		ListaInt nueva = new ListaInt();
		NodoInt actual = this.primero;
		// Guardo una referencia al ultimo de la nueva lista
		NodoInt ultimo = nueva.primero;
		int indice = 0;

		while (actual != null && indice < pos) {
			actual = actual.siguiente;
			indice++;
		}

		while (actual != null) {
			if (actual.elemento < n) {

				ultimo = nueva.agregarAtras(actual.elemento, ultimo);
			}
			actual = actual.siguiente;
		}

		return nueva;
	}

	private NodoInt agregarAtras(int elem, NodoInt ultimo) {
		NodoInt nuevo = new NodoInt(elem);
		// Si es null el primero, entonces el nodo que
		// agrego va a ser el ultimo y primero a la vez
		if (this.primero == null) {
			this.primero = nuevo;
		} else {
			// si no, mi ultimo actual apunta al nuevo ultimo
			ultimo.siguiente = nuevo;
		}
		// Retorno el nodo que ahora es mi ultimo
		return nuevo;
	}

	public static void main(String[] args) {
		ListaInt caso1 = new ListaInt();
		caso1.agregarAtras(7);
		caso1.agregarAtras(2);
		caso1.agregarAtras(8);
		caso1.agregarAtras(2);
		caso1.agregarAtras(3);
		caso1.agregarAtras(11);

		caso1.sublistaDesdePos(2, 5).imprimir();

		ListaInt caso2 = new ListaInt();
		caso2.agregarAtras(0);
		caso2.agregarAtras(1);
		caso2.agregarAtras(2);
		caso2.agregarAtras(3);
		caso2.agregarAtras(4);

		caso2.sublistaDesdePos(3, 2).imprimir();

		ListaInt caso3 = new ListaInt();
		caso3.agregarAtras(5);
		caso3.agregarAtras(6);
		caso3.agregarAtras(7);
		caso3.agregarAtras(8);
		caso3.agregarAtras(9);
		caso3.agregarAtras(0);

		caso3.sublistaDesdePos(0, 2).imprimir();

		ListaInt caso4 = new ListaInt();
		caso4.agregarAtras(1);
		caso4.agregarAtras(3);
		caso4.agregarAtras(1);
		caso4.agregarAtras(3);
		caso4.agregarAtras(1);

		caso4.sublistaDesdePos(2, 2).imprimir();

		ListaInt caso5 = new ListaInt();
		caso5.agregarAtras(2);
		caso5.agregarAtras(2);
		caso5.agregarAtras(2);
		caso5.agregarAtras(2);
		caso5.agregarAtras(2);

		caso5.sublistaDesdePos(3, 3).imprimir();
	}
}
