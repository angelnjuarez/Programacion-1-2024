package clase11Practica1;

public class Fractales {

	double radio;
	Punto centro;

	Fractales(double x, double y, double r) {
		this.centro = new Punto(x, y);
		this.radio = r;
	}

	// Aproximando a los fractales se presentan los métodos dibujarCirculos y
	// dibujarCirculos2.
	static void dibujarCirculos(Dibujador dib, double x, double y, double r) {
		/*
		 * círculo de radio r en el punto (x,y) del dibujador pasado como parámetro y
		 * luego se llame recursivamente para dibujar dos círculos de la mitad del radio
		 * a izquierda y a derecha del punto (x,y), a una distancia de r. Cuando r sea
		 * más chico que 10, el método debe retornar sin dibujar nada, este sería su
		 * caso base.
		 */

		if (r >= 4) {
			Circulo circulo = new Circulo(x, y, r);
			dib.dibujar(circulo);
			dibujarCirculos(dib, x - r, y, r / 2);
			dibujarCirculos(dib, x + r, y, r / 2);
			dibujarCirculos(dib, x, y - r, r / 2);
			dibujarCirculos(dib, x, y + r, r / 2);
		}
	}

	static void dibujarCirculos2(Dibujador dib, double x, double y, double r) { // a distancia r/2

		if (r >= 4) {
			Circulo circulo = new Circulo(x, y, r);
			dib.dibujar(circulo);
			dibujarCirculos2(dib, x - r / 2, y, r / 2);
			dibujarCirculos2(dib, x + r / 2, y, r / 2);
			dibujarCirculos2(dib, x, y - r / 2, r / 2);
			dibujarCirculos2(dib, x, y + r / 2, r / 2);
		}
	}

	static void dibujarCirculosConcentricos(Dibujador dib, double x, double y, double r) {
		if (r >= 5) {
			Circulo circulo = new Circulo(x, y, r);
			dib.dibujar(circulo);
			dibujarCirculosConcentricos(dib, x, y, r - 20);
		}
	}

}
