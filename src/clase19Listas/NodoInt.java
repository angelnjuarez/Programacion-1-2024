package clase19Listas;

public class NodoInt {
	int elemento;
	NodoInt siguiente;

	public NodoInt(int n) {
		this.elemento=n;
		this.siguiente=null;
	}

	@Override
	public String toString() {
		return "NodoInt [elemento=" + elemento + ", siguiente=" + siguiente + "]";
	}
	
}
