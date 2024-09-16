package clase11Practica1;

public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int num, int den) {
		this.numerador=num;
		setDenominador(den);
	}
	public void mostrar() {
		System.out.println(this.numerador+"/"+this.denominador);
	}
	public static int MCD(int a, int b) {
		if(b==0) {
			return a;
		}
		return MCD(b,a%b);
	}
	public void reducir() {
		int calcular=MCD(this.numerador, this.denominador);
		this.numerador /= calcular;
		this.denominador /= calcular;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		if(denominador == 0) {
			throw new RuntimeException("Denominador invalido");
		}
		this.denominador = denominador;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
