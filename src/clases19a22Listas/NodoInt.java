package clases19a22Listas;

public class NodoInt {
	int elemento;
	NodoInt siguiente;

	public NodoInt(int n) {
		this.elemento=n;
		this.siguiente=null;
	}

	public NodoInt() {
	}

	@Override
	public String toString() {
		return "NodoInt [elemento=" + elemento + ", siguiente=" + siguiente + "]";
	}
	
}
