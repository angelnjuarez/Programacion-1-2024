package clase11Practica1;

public class Circulo {
	double radio;
	Punto centro;
	
	public Circulo(double centro_x, double centro_y, double radio){
		this.radio=radio;
		this.centro=new Punto(centro_x,centro_y);
	}
	void imprimir() {
		System.out.print("Punto: "); 
		this.centro.imprimir();
		System.out.println("Radio: "+this.radio);

	}
	void escalar(double factor) {
		this.radio +=factor;
	}
	void desplazar(double desp_x, double desp_y) {
		this.centro.x +=desp_x;
		this.centro.y +=desp_y;
	}
	static double distancia(Circulo c1, Circulo c2) {
		return Punto.distancia(c1.centro, c2.centro)-c1.radio-c2.radio <=0?
				0:Punto.distancia(c1.centro, c2.centro)-c1.radio-c2.radio;
	}
	static boolean seTocan(Circulo c1, Circulo c2) {
		return distancia(c1,c2)<=0;
	}
	boolean loContiene(Circulo otro) {
		return Punto.distancia(this.centro,otro.centro)+
				otro.radio<=this.radio;
	}
}










