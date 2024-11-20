package ParcialTarde3Objetos;

public class Tarjeta {
	Compra[] compras;
	double limite;
	boolean valida;

	public double montoCompra() {
		double monto = 0;
		for (Compra ca : this.compras) {
			for (Producto prod : ca.productos) {
				monto += prod.precio;
			}
		}
		return monto;
	}

	public boolean montoComprasDescuento(int desc) {
		for (Compra ca: this.compras)
			if (ca.calculoDescuento() < desc ) {
				return false;
			}
		return true;
	}
}
