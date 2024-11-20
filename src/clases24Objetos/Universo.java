package clases24Objetos;

import java.util.ArrayList;

public class Universo {
	public Cuadrante[] cuadrantes;

	/*
	 * a)
	 */
	public ArrayList<Planeta> planetasConRazasDeNivelSuperior(int r) {
		ArrayList<Planeta> arr = new ArrayList<>();
		for (Cuadrante c : this.cuadrantes) {
			for (Planeta p : c.planetas) {
				if (p.tieneNivel(r) && !arr.contains(p)) {
					arr.add(p);
				}
			}
		}
		return arr;
	}

	/*
	 * b)
	 */
	public int cantidadDePlanetasConEnemigos() {
		int cant = 0;
		for (Cuadrante c : this.cuadrantes) {
			for (Planeta p : c.planetas) {
				if (p.cantEnemigas() >= 2) {
					cant++;
				}
			}
		}
		return cant;
	}

	/*
	 * c) BONUS TRACK
	 */
	public Capitan capitanMasTrabajador() {
		Capitan maximo = cuadrantes[0].naves[0].capitanes[0];
		int cantViajesMax = cantViajes(maximo);
		for (Cuadrante c : this.cuadrantes) {
			for (Nave n : c.naves) {
				for (Capitan cap : n.capitanes) {
					int cantOtroCap = cantViajes(cap);
					if (cantOtroCap > cantViajesMax) {
						maximo = cap;
						cantViajesMax = cantOtroCap;
					}
				}
			}
		}
		return maximo;
	}

	private int cantViajes(Capitan unCap) {
		int cantViajes = 0;
		for (Cuadrante c : this.cuadrantes) {
			for (Nave n : c.naves) {
				for (Capitan cap : n.capitanes) {
					if(cap.equals(unCap)) {
						cantViajes++;
					}
				}
			}
		}
		return cantViajes;
	}

}