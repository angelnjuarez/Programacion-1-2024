package ParcialTarde3Objetos;

public class Compra {
	Comercio local;
	Producto[] productos;
	boolean aprobada;
	int cuotas;
	int descuento; // en %

	int calculoDescuento() {
		int baseDescuento = 0;
		for(Producto p : this.productos) {
			baseDescuento+= p.precio;
		}
		return baseDescuento * descuento;
	}
	
}
