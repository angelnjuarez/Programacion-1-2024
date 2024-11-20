package Parcial3Objetos;

public class Venta {
	Libro[] libros;
	Cliente cliente;
	String tipoPago;// debito, credito, efectivo
	
	public boolean todasDelMismoGenero(String genero) {
		for(Libro l : this.libros) {
			if (l.genero != genero)
				return false;
		}
		return true;
	}
}
