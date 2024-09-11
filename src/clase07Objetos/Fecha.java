package clase07Objetos;

public class Fecha {
	// variables de instancia
	int dia;
	int mes;
	int anio;
	String nombreMes;

	public Fecha() {
		this.anio = 2024;
	}

	public Fecha(int a) {
		this.anio = a;
	}

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public void mostrar() {
		System.out.println(this.dia + "/" + this.mes + "/" + this.anio);
	}

	public boolean esVerano() {
		if (this.mes == 1 || this.mes == 2) {
			return true;
		}
		if (this.mes == 12 && this.dia >= 21) {
			return true;
		}
		if (this.mes == 3 && this.dia < 21) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Fecha f = new Fecha();
		Fecha f1 = new Fecha(2025);
		Fecha f2 = new Fecha(2, 1, 2024);
		f.mostrar();
		f1.mostrar();
		f2.mostrar();
		System.out.println(f2.esVerano());
	}
}
