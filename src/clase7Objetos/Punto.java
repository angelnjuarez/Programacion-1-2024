package clase7Objetos;

public class Punto {
	int x;
	int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		Punto punto = new Punto(10,10);
		System.out.println(punto);
		System.out.println(punto.x + " " + punto.y);
	}
}
