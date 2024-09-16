package clase11Practica1;

public class Main {

	public static void main(String[] args) {

		Dibujador dib = new Dibujador();
		// Fractales.dibujarCirculosConcentricos(dib, 400, 400, 100);
		// Fractales.dibujarCirculos(dib, 400, 400, 100);
		Fractales.dibujarCirculos2(dib, 400, 400, 100);
		Imagen img = new Imagen("lena.bmp");
		dib.dibujar(img);
		// img.enrojecer(100);
		// img.abrillantar(100);
		// img.aGrises();
		// img.invertir();
		// img.espejar();
		img.girarDerecha();
		dib.dibujar(img);
	}
}