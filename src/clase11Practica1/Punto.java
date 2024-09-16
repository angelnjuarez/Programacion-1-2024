package clase11Practica1;

public class Punto {
	double x;
	double y;

	public Punto(){
		this.x=0.0;
		this.y=0.0;
	}
	public Punto (double x, double y){
		this.x=x;
		this.y=y;
	}
	void imprimir() {
		System.out.println("("+ this.x+","+this.y+")");
	}
	void desplazar(double desp_x, double desp_y) {
		this.x +=desp_x;
		this.y += desp_y;
	}
	static double distancia(Punto p1, Punto p2) {
		return Math.sqrt((p2.x-p1.x) * (p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y));
	}


}
