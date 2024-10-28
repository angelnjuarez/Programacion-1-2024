package clases192021Listas;

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
		if (this.primero != null && this.primero.elemento == e) {
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
	public void descomponerPares(){
		NodoInt actual = this.primero;
		while(actual != null) {
			if(actual.elemento%2==0) {
				NodoInt nuevo = new NodoInt(actual.elemento*2);
				nuevo.siguiente = actual.siguiente;
				actual.siguiente = nuevo;
				actual.elemento = actual.elemento/2;
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
				lNueva.agregarAdelante(actual.siguiente.elemento);
				actual.siguiente = actual.siguiente.siguiente;
			}
			actual = actual.siguiente;
		}
		if (this.primero.elemento % 2 == 0) {
			lNueva.agregarAdelante(this.primero.elemento);
			this.primero = this.primero.siguiente;
		}
		ListaInt nueva2 = new ListaInt();
		NodoInt actuall2 = lNueva.primero;
		while (actuall2 != null) {
			nueva2.agregarAdelante(actuall2.elemento);
			actuall2 = actuall2.siguiente;
		}
		return nueva2;
	}

	public void agregarAdelante(int e) {
		NodoInt nuevo = new NodoInt(e);
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
	}

	public static void main(String[] args) {
		ListaInt aDescomponer = new ListaInt();
		aDescomponer.agregarAtras(1);
		aDescomponer.agregarAtras(12);
		aDescomponer.agregarAtras(3);
		aDescomponer.imprimir();
		aDescomponer.descomponerPares();
		aDescomponer.imprimir();
		
		ListaInt caso1 = new ListaInt();
		caso1.agregarAtras(2);
		caso1.agregarAtras(5);
		caso1.agregarAtras(4);
		caso1.agregarAtras(3);
		caso1.imprimir();
		caso1.extraerPares().imprimir();
		caso1.imprimir();
		ListaInt caso2 = new ListaInt();
		caso2.agregarAtras(3);
		caso2.agregarAtras(8);
		caso2.agregarAtras(3);
		caso2.imprimir();
		caso2.extraerPares().imprimir();
		caso2.imprimir();
	}

}
