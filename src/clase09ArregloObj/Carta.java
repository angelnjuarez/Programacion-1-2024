package clase09ArregloObj;

import java.util.Objects;

public class Carta {
	int palo;
	int numero;

	public Carta(int palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	public void mostrar() {
		String[] palos = { "Espada", "Basto", "Copa", "Oro" };
		System.out.println("Palo: " + palos[this.palo] + ", Numero: " + this.numero);
	}
	
	
	//Para comparar objetos debo implementar equals
	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return numero == other.numero && palo == other.palo;
	}

	public static void main(String[] args) {
		Carta ancho = new Carta(0,1);
		ancho.mostrar();
	}
}
