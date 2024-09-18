package clase12EjerObjeto;

public class Comision {
	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;

	boolean estaDocente(Docente doc) {
		for (Docente d : this.docentes) {
			if (d.equals(doc)) {
				return true;
			}
		}
		return false;
	}

	boolean estaEstudiante(Estudiante est) {
		for (Estudiante e : this.inscriptos) {
			if (e.equals(est)) {
				return true;
			}
		}
		return false;
	}

	public boolean estaAprobado(Estudiante e) {
		// Puede ser inscriptos.length o calificaciones.length
		for (int i = 0; i < calificaciones.length; i++) {
			if (this.inscriptos[i].equals(e) && this.calificaciones[i] >= 4) {
				return true;
			}
		}
		return false;
	}

	public int mayorCalificacion() {
		int masAlta = this.calificaciones[0];
		for (int i = 1; i < this.calificaciones.length; i++) {
			if (this.calificaciones[i] > masAlta) {
				masAlta = this.calificaciones[i];
			}
		}
		return masAlta;
	}

	public int cantidadPremios(int calificacion) {
		int cantPremios = 0;
		for (int i = 0; i < this.calificaciones.length; i++) {
			if (this.calificaciones[i] == calificacion) {
				cantPremios++;
			}
		}
		return cantPremios;
	}

}
