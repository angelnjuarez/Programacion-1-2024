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

}
