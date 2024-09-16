package clase11Practica1;

public class Pixel {
	int rojo;
	int verde;
	int azul;

	public Pixel(int rgb) {
		this.rojo = (rgb & 0x00ff0000) >> 16;
		this.verde = (rgb & 0x0000ff00) >> 8;
		this.azul = rgb & 0x000000ff;
	}

	public int aInt() {
		int rgb = 0;
		rgb += this.rojo;
		rgb = rgb << 8;
		rgb += this.verde;
		rgb = rgb << 8;
		rgb += this.azul;
		return rgb;
	}

	public void enrojecer(int cant) {
		this.rojo += cant;
		if (this.rojo > 255) {
			this.rojo = 255;
		}
	}

	public void abrillantar(int cant) {
		this.rojo += cant;
		if (this.rojo > 255) {
			this.rojo = 255;
		}
		this.verde += cant;
		if (this.verde > 255) {
			this.verde = 255;
		}
		this.azul += cant;
		if (this.azul > 255) {
			this.azul = 255;
		}
		if (this.rojo < 0) {
			this.rojo = 0;
		}
		if (this.azul < 0) {
			this.azul = 0;
		}
		if (this.verde < 0) {
			this.verde = 0;
		}

	}

	void aGrises() {
		int aux = (int) (this.rojo * 0.3 + 
				   		 this.verde * 0.6 + 
				   		 this.azul * 0.1);
		if (aux > 255) {
			aux = 255;
		}
		this.rojo = aux;
		this.verde = aux;
		this.azul = aux;
	}

	void invertir() {
		this.azul = 255 - this.azul;
		this.rojo = 255 - this.rojo;
		this.verde = 255 - this.verde;
	}

}
