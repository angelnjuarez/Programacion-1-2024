package clase11Practica1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Imagen {
	Pixel[][] pixels;
	int alto;
	int ancho;

	public Imagen(String rutaArchivo) {
		File file = new File(rutaArchivo);
		try {
			BufferedImage image = ImageIO.read(file);
			ancho = image.getWidth();
			alto = image.getHeight();
			pixels = new Pixel[alto][ancho];
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					pixels[i][j] = new Pixel(image.getRGB(j, i));
				}
			}
		} catch (IOException e) {
			System.err.println("No se encontro el archivo " + rutaArchivo);
			System.exit(0);
		}
	}

	/**
	 * Guarda la imagen en un archivo segun el formato indicado
	 * 
	 * @param archivo El nombre de archivo, e.g., "lena.bmp"
	 * @param formato El formato de imagen: "bmp", "png", "jpg", etc.
	 **/
	void guardar(String archivo, String formato) {
		BufferedImage image = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++)
				image.setRGB(j, i, pixels[i][j].aInt());
		}

		try {
			ImageIO.write(image, formato, new File(archivo));
		} catch (IOException e) {
			System.err.println("Error al guardar en el archivo " + archivo);
			e.printStackTrace();
		}
	}

	public void enrojecer(int cant) {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].enrojecer(cant);
			}
		}
	}

	public void enverdecer(int cant) {
		int aux = 0;
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				aux = pixels[i][j].verde + cant;
				if (aux > 255) {
					aux = 255;
				}
				pixels[i][j].verde = aux;
			}
		}
	}

	public void abrillantar(int cant) {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].abrillantar(cant);
			}
		}
	}

	public void aGrises() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].aGrises();
			}
		}
	}

	public void invertir() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].invertir();
			}
		}
	}

	public void espejar() {
		Pixel[][] p = new Pixel[alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				p[i][j] = pixels[i][ancho - 1 - j];
			}
		}
		this.pixels = p;
	}

	public void girarDerecha() {
		int ancho = this.alto;
		int alto = this.ancho;
		Pixel[][] p = new Pixel[alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				p[i][j] = pixels[j][i];
			}
		}
		this.pixels = p;
		this.alto = alto;
		this.ancho = ancho;
	}
}
