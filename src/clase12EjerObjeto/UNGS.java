package clase12EjerObjeto;

public class UNGS {
	Comision[] comisiones;

	boolean cursaCon(Estudiantes e, Docente d) {
		for (Comision c : this.comisiones) {
			if (c.estaDocente(d) && c.estaEstudiante(e)) {
				return true;
			}
		}
		return false;
	}
}
