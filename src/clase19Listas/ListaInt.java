package clase19Listas;

public class ListaInt {
	NodoInt primero;

	public ListaInt() {

	}

	public void agregarAdelante(int e) {
		NodoInt nuevo = new NodoInt(e);
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
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
		if (this.primero != null && this.primero.elemento == e) {
			this.primero = this.primero.siguiente;
			return;
		}
		NodoInt actual = this.primero;
		while (actual.siguiente != null && actual.siguiente.elemento != e) {
			actual = actual.siguiente;
		}
		actual.siguiente = actual.siguiente.siguiente;
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

}
