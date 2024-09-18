package clase12EjerObjeto;

public class UNGS {
	Comision[] comisiones;

	/**
	 * a)
	 */
	boolean cursaCon(Estudiante e, Docente d) {
		for (Comision c : this.comisiones) {
			if (c.estaDocente(d) && c.estaEstudiante(e)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * b)
	 */
	boolean suficientesDocentes() {
		for (Comision c : this.comisiones) {
			if (c.inscriptos.length / 20 + 1 < c.docentes.length) {
				return false;
			}
		}
		return true;
	}

	/**
	 * c)
	 */
	Estudiante elMasEstudioso() {
		Estudiante masEstudioso = this.comisiones[0].inscriptos[0];
		int cantEst = cantidadAprobadas(masEstudioso);
		for (Comision c : this.comisiones) {
			for (Estudiante e : c.inscriptos) {
				if (cantidadAprobadas(e) > cantEst) {
					cantEst = cantidadAprobadas(e);
					masEstudioso = e;
				}
			}
		}
		return masEstudioso;
	}

	// Aux punto C
	int cantidadAprobadas(Estudiante e) {
		int cantAprob = 0;
		for (Comision c : this.comisiones) {
			if (c.estaAprobado(e)) {
				cantAprob++;
			}
		}
		return cantAprob;
	}

	/**
	 * d) Devuelve la cantidad de estudiantes que obtuvieron la mejor nota cada
	 * comision.
	 */
	int losMejores() {
		int cantPremios = 0;
		for (Comision c : this.comisiones) {
			int calMasAlta = mayorCalificacion(c.calificaciones);
			for (int i = 0; i < c.calificaciones.length; i++) {
				if (c.calificaciones[i] == calMasAlta) {
					cantPremios++;
				}
			}
		}
		return cantPremios;
	}

	int mayorCalificacion(int[] calificaciones) {
		int masAlta = calificaciones[0];
		for (int i = 1; i < calificaciones.length; i++) {
			if (calificaciones[i] > masAlta) {
				masAlta = calificaciones[i];
			}
		}
		return masAlta;
	}
	
	int losMejores2() {
		int cantPremios = 0;
		for (Comision c : this.comisiones) {
			int calMasAlta = c.mayorCalificacion();
			cantPremios += c.cantidadPremios(calMasAlta);
		}
		return cantPremios;
	}
	
	/**
	 * e) Devuelve la cantidad de estudiantes del docente dado
	 */
	int alumnosDe(Docente d) {
		int cantEstudiantes = 0;
		for (Comision c : this.comisiones) {
			if(c.estaDocente(d))
				cantEstudiantes += c.inscriptos.length;
		}
		return cantEstudiantes;
	}
	
	
	/**
	 * f) Devuelve la cantidad de materias que tienen una unica comision
	 */
	 int unicaComision() {
		 int cantUnicas = 0;
		 for (Comision c : this.comisiones) {
			 if (esUnica(c.materia)) {
				 cantUnicas++;
			 }
		 }
		 return cantUnicas;
	 }

	//Aux punto e
	private boolean esUnica(String materia) {
		int cantApariciones = 0;
		for (Comision c : this.comisiones) {
			if(c.materia.equals(materia)) {
				cantApariciones++;
			}
		}
		return cantApariciones==1;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
