package clase12EjerObjeto;

public class Comision {
	String materia;
	int numero;
	Docente[] docentes;
	Estudiantes[] inscriptos;
	int[] calificaciones;

	boolean estaDocente(Docente doc) {
		for (Docente d : this.docentes) {
			if (d.equals(doc)) {
				return true;
			}
		}
		return false;
	}

	boolean estaEstudiante(Estudiantes est) {
		for (Estudiantes e : this.inscriptos) {
			if (e.equals(est)) {
				return true;
			}
		}
		return false;
	}
}
