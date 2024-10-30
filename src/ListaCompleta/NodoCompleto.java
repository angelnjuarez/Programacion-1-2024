package ListaCompleta;

public class NodoCompleto {
	int elemento;
	NodoCompleto anterior;
	NodoCompleto siguiente;

	public NodoCompleto(int n) {
		this.elemento = n;
		this.anterior = null;
		this.siguiente = null;
	}

	@Override
	public String toString() {
		return "NodoInt [ Elemento: " +  this.elemento + " ]";
	}

}