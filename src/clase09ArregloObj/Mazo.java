package clase09ArregloObj;

import java.util.Arrays;

public class Mazo {
	Carta[] cartas;

	public Mazo() {
		this.cartas = new Carta[40];
		int j = 0;
		for (int p = 0; p <= 3; p++) {
			for (int i = 1; i <= 7; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
			for (int i = 10; i <= 12; i++) {
				cartas[j] = new Carta(p, i);
				j++;
			}
		}
	}

	public Mazo copiaSuperficial() {
		Mazo copiaMazo = new Mazo();
		for (int i = 0; i < this.cartas.length; i++) {
			copiaMazo.cartas[i] = this.cartas[i];
		}
		return copiaMazo;
	}

	public Mazo copiaProfunda() {
		Mazo copiaMazo = new Mazo();
		for (int i = 0; i < this.cartas.length; i++) {
			if (this.cartas[i] == null) {
				copiaMazo.cartas[i] = null;
			} else {
				copiaMazo.cartas[i] = new Carta(this.cartas[i].numero, this.cartas[i].palo);
			}
		}
		return copiaMazo;
	}

	//Para comparar objetos debo implementar equals
	// y tambien el equals de las cartas
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cartas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mazo other = (Mazo) obj;
		return Arrays.equals(cartas, other.cartas);
	}
}
