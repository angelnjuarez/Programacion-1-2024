package clase08IrepObj;

public class Fecha {
//variables de instancia
	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		this.dia = 2;
		this.mes = 9;
		this.anio = 2024;
	}

	public Fecha(int dia, int mes, int anio) {
		setMes(mes);
		setAnio(anio);
		setDia(dia); //Dia depende del mes y del anio
	}

	public void mostrar() {
		String[] aux = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		System.out.println(this.dia + " de " + aux[this.mes] + " de " + this.anio);
		// System.out.println(this.dia+"/"+this.mes+"/"+this.anio);

	}

	public boolean esVerano() {
		if (this.mes < 3) {
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

	public static boolean esBisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0) {
			return true;
		}
		if (anio % 400 == 0) {
			return true;
		}
		return false;
	}

	public static int diasDelMes(int mes, int anio) {
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}
		if (mes == 2) {
			return 28 + (esBisiesto(anio) ? 1 : 0);
		}
		return 31;
	}

	public boolean esValida() {
		if (this.mes < 1 || this.mes > 12) {
			return false;

		}
		if (this.dia < 1 || this.dia > diasDelMes(this.mes, this.anio)) {
			return false;
		}
		return true;
	}

	// public [static?] void avanzarDia()
	// Hace avanzar un día a la fecha
	public void avanzarDia() {
		if (this.mes == 12 && this.dia == 31) {
			this.dia = 1;
			this.mes = 1;
			this.anio++;
			return;
		}
		if (this.dia == diasDelMes(this.mes, this.anio)) {
			this.dia = 1;
			this.mes++;
			return;
		}
		this.dia++;
	}

	public void avanzarDia(int n) {
		for (int i = 0; i < n; i++) {
			this.avanzarDia();
		}
	}

	public boolean antesQueI(Fecha otra) {
		if (this.anio > otra.anio) {
			return false;
		}
		if (this.anio < otra.anio) {
			return true;
		}
		if (this.mes > otra.mes) {
			return false;
		}
		if (this.mes < otra.mes) {
			return true;
		}
		return this.dia >= otra.dia ? false : true;
	}

	public int diaDelAnio() {
		int cont = 0;
		for (int i = 1; i < this.mes; i++) {
			cont = cont + diasDelMes(i, this.anio);
		}
		cont = cont + this.dia;
		return cont;
	}

	public int numSerie() {
		int cont = 0;
		for (int i = 1900; i < this.anio; i++) {
			cont = cont + 365 + (esBisiesto(i) ? 1 : 0);
		}
		cont = cont + this.diaDelAnio();
		return cont;
	}

	public int diasDeDiferenciaCon(Fecha otra) {
		return Math.abs(this.numSerie() - otra.numSerie());
	}

	public boolean antesQue(Fecha otra) {
		return this.numSerie() < otra.numSerie();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia < 1 || dia > diasDelMes(this.mes, this.anio)) {
			System.out.println("Dia no valido");
			return;
		}
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes < 1 || mes > 12) {
			System.out.println("Mes no valido");
			return;
		}
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

}
