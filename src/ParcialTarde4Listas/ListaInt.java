package ParcialTarde4Listas;

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

	public ListaInt extraerCada(int c) {
		ListaInt nueva = new ListaInt();
		int cont = 1;
		NodoInt actual = this.primero;
		while (actual != null && actual.siguiente != null) {
			if (cont + 1 != c) {
				cont++;
				actual = actual.siguiente;
			} else {
				NodoInt nuevo = new NodoInt(actual.siguiente.elemento);
				nuevo.siguiente = nueva.primero;
				nueva.primero = nuevo;
				actual.siguiente = actual.siguiente.siguiente;
				actual = actual.siguiente;
				cont = 1;
			}
		}
		return nueva;
	}

	public static void main(String[] args) {
		ListaInt caso1 = new ListaInt();
		caso1.agregarAtras(1);
		caso1.agregarAtras(3);
		caso1.agregarAtras(2);
		caso1.agregarAtras(7);
		caso1.agregarAtras(5);
		caso1.agregarAtras(4);
		caso1.extraerCada(3).imprimir();
		caso1.imprimir();
		
		ListaInt caso2 = new ListaInt();
		caso2.agregarAtras(0);
		caso2.agregarAtras(1);
		caso2.agregarAtras(2);
		caso2.agregarAtras(3);
		caso2.agregarAtras(4);
		caso2.agregarAtras(5);
		caso2.agregarAtras(6);
		caso2.extraerCada(2).imprimir();
		caso2.imprimir();

		ListaInt caso3 = new ListaInt();
		caso3.agregarAtras(0);
		caso3.agregarAtras(1);
		caso3.agregarAtras(2);
		caso3.agregarAtras(3);
		caso3.agregarAtras(4);
		caso3.agregarAtras(5);
		caso3.agregarAtras(6);
		caso3.extraerCada(4).imprimir();
		caso3.imprimir();
		
		ListaInt caso4 = new ListaInt();
		caso4.agregarAtras(1);
		caso4.agregarAtras(2);
		caso4.agregarAtras(3);
		caso4.extraerCada(4).imprimir();
		caso4.imprimir();
		
		ListaInt caso5 = new ListaInt();
		caso5.extraerCada(2).imprimir();
		caso5.imprimir();

	}
}
