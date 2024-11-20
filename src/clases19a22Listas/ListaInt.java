package clases19a22Listas;

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

	public void quitar(int e) {
		if (this.primero == null) {
			return;
		}
		if (this.primero.elemento == e) {
			this.primero = this.primero.siguiente;
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null && actual.siguiente.elemento != e) {
			actual = actual.siguiente;
		}
		actual.siguiente = actual.siguiente.siguiente;
		return;
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

	public int largo() {
		NodoInt actual = this.primero;
		int cant = 0;
		while (actual != null) {
			cant++;
			actual = actual.siguiente;
		}
		return cant;
	}

	public int max() {
		int max = this.primero.elemento;
		NodoInt actual = this.primero.siguiente;
		while (actual != null) {
			if (actual.elemento > max) {
				max = actual.elemento;
			}
			actual = actual.siguiente;
		}
		return max;
	}

	public boolean pertence(int e) {
		NodoInt actual = this.primero;
		while (actual != null) {
			if (actual.elemento == e) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	public int iesimo(int pos) {
		int indice = 0;
		NodoInt actual = this.primero;
		while (actual != null) {
			if (indice == pos) {
				return actual.elemento;
			}
			indice++;
			actual = actual.siguiente;
		}
		return -1;
	}

	@Override
	public String toString() {
		return "ListaInt [primero=" + primero + "]";
	}

	/*
	 * Ej 1
	 */
	public void descomponerPares() {
		NodoInt actual = this.primero;
		while (actual != null) {
			if (actual.elemento % 2 == 0) {
				NodoInt nuevo = new NodoInt(actual.elemento * 2);
				nuevo.siguiente = actual.siguiente;
				actual.siguiente = nuevo;
				actual.elemento = actual.elemento / 2;
				actual = actual.siguiente.siguiente;
			} else {
				actual = actual.siguiente;
			}
		}
	}

	/*
	 * Ej 3 tipo parcial
	 */
	public ListaInt extraerPares() {
		ListaInt lNueva = new ListaInt();
		NodoInt actual = this.primero;
		while (actual.siguiente != null || actual.siguiente != null) {
			if (actual.siguiente.elemento % 2 == 0) {
				lNueva.agregarAdelante(actual.siguiente.elemento); // O(1)
				actual.siguiente = actual.siguiente.siguiente;
			}
			actual = actual.siguiente;
		}
		if (this.primero.elemento % 2 == 0) {
			lNueva.agregarAdelante(this.primero.elemento); // O(1)
			this.primero = this.primero.siguiente;
		}
		// return lNueva;
		// Si deseo recuperar el orden original de la lista
		return lNueva.invertirLista();
	}

	public ListaInt invertirLista() {
		ListaInt nueva = new ListaInt();
		NodoInt actual = this.primero;
		while (actual != null) {
			nueva.agregarAdelante(actual.elemento);
			actual = actual.siguiente;
		}
		return nueva;
	}

	public void agregarAdelante(int e) {
		NodoInt nuevo = new NodoInt(e);
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
	}

	/*
	 * Parcial (turno tarde) – 8/11/2023
	 */

	public ListaInt extraerConsecutivos() {
		ListaInt nueva = new ListaInt();
		NodoInt menor = extraerMenor(); // O(n)

		nueva.primero = new NodoInt(menor.elemento); // O(1)
		NodoInt actual = this.primero;
		NodoInt anterior = null;
		NodoInt ultimo = nueva.primero;

		// Eliminamos el menor nodo O(n)
		if (actual == menor) {
			this.primero = actual.siguiente;
			actual = actual.siguiente;
		} else {
			while (actual != null && actual != menor) {
				anterior = actual;
				actual = actual.siguiente;
			}
			if (actual != null) {
				anterior.siguiente = actual.siguiente;
				actual = actual.siguiente;
			}
		}

		// Eliminamos y agregamos los consecutivos O(n)
		while (actual != null) {
			if (actual.elemento == ultimo.elemento + 1) {
				ultimo = nueva.agregarAtras(actual.elemento, ultimo); // O(1)
				if (anterior == null) {
					this.primero = actual.siguiente;
				} else {
					anterior.siguiente = actual.siguiente;
				}
				actual = actual.siguiente;
			} else {
				anterior = actual;
				actual = actual.siguiente;
			}
		}
		return nueva;
	}

	private NodoInt extraerMenor() {
		NodoInt actual = this.primero;
		NodoInt menorNodo = actual;
		while (actual != null) {
			if (actual.elemento < menorNodo.elemento) {
				menorNodo = actual;
			}
			actual = actual.siguiente;
		}
		return menorNodo;
	}
	
	private NodoInt agregarAtras(int elem, NodoInt ultimo) {
		NodoInt nuevo = new NodoInt(elem);
		ultimo.siguiente = nuevo;
		return nuevo;
	}

	// Fin del ejercicio
	
}
