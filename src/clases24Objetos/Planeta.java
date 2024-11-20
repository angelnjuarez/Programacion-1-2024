package clases24Objetos;

public class Planeta {
	public Raza[] razas;
	public int porcentajeDeOxigeno;
	public int porcentajeDeNitrogeno;
	public int temperaturaPromedio;

	// Checkear evaluacion perezosa
	public boolean tieneNivel(int r) {
		int cantRazas = 0;
		for (Raza raz : this.razas) {
			if (raz.nivelTecnologico >= 9) {
				cantRazas++;
				if (cantRazas > r) {
					return true;
				}
			}
		}
		return false;
	}

	public int cantEnemigas() {
		int cant = 0;
		for (Raza raz : this.razas) {
			if (raz.razaEnemiga != null) {
				cant++;
			}
		}
		return cant;
	}

}
