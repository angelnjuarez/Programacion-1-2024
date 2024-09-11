package clase06Objetos;

import java.awt.*;

public class PointRectangle {

	/*
	 * Ej 1
	 */
	public static double distancia(Point p1, Point p2) {
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
	}

	/*
	 * Ej 2
	 */
	public static double diagonal(Rectangle r) {
		Point v1 = new Point(r.x, r.y); // uno de los vertices
		Point v2 = new Point(r.x + r.width, r.y + r.height); // el otro vertice de la diagonal
		return distancia(v1, v2);
	}

	/*
	 * Ej 3
	 */
	public static Point puntoMedio(Point p1, Point p2) {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

	/*
	 * Ej 4
	 */
	public static Point centro(Rectangle r) {
		return new Point(r.x + r.width / 2, r.y + r.height / 2);
	}

	/*
	 * Ej 5
	 */
	public static boolean estaDentro(Point p, Rectangle r) {
		return !((p.x > r.x + r.width) || (p.y > r.y + r.height) 
			   || (p.x < r.x) || (p.y < r.y)); // por la negación
		// return ((p.x >= r.x) && (p.x <= r.x+r.width) && (p.y >= r.y) && (p.y <=
		// r.y+r.height));
	}

	/*
	 * Ej 6
	 */
	public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		Rectangle r3 = new Rectangle(); // toma el constructor vacio
		r3.x = Math.min(r1.x, r2.x);
		r3.y = Math.min(r1.y, r2.y);
		r3.width = Math.max(r1.x + r1.width, r2.x + r2.width) - r3.x;
		r3.height = Math.max(r1.y + r1.height, r2.y + r2.height) - r3.y;
		return r3;
	}

	/*
	 * Ej 7
	 */
	public static boolean estaContenido(Rectangle r1, Rectangle r2) { // analiza los puntos de la diagonal
//		if (r2.equals(encuadrar(r1, r2))) {
//			return true;
//		}
		Point a = new Point(r1.x, r1.y); // punto de la disgonal
		Point b = new Point(r1.x + r1.width, r1.y + r1.height); // el otro extremos de la diagonal
		return (estaDentro(a, r2) && estaDentro(b, r2));

	}

	public static boolean estaContenidoV1(Rectangle r1, Rectangle r2) {
		return !((r1.x + r1.width < r2.x) || (r1.x > r2.x + r2.width) || (r1.y + r1.height < r2.y)
				|| (r1.y > r2.y + r2.height));
	}

	/*
	 * Ej 8
	 */
	public static Rectangle interseccion(Rectangle r1, Rectangle r2) {
		if (!estaContenido(r1, r2) || !estaContenido(r2, r1)) {
			return null;
		}
		if (estaContenido(r1, r2)) {
			return r1;
		}
		if (estaContenido(r2, r1)) {
			return r2;
		}
		Rectangle r3 = new Rectangle();
		r3.x = Math.max(r1.x, r2.x);
		r3.y = Math.max(r1.y, r2.y);
		r3.width = Math.min(r1.x + r1.width, r2.x + r2.width) - r3.x;
		r3.height = Math.min(r1.y + r1.height, r2.y + r2.height) - r3.y;
		return r3;
	}














}
