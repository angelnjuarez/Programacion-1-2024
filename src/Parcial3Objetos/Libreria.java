package Parcial3Objetos;

import java.util.LinkedList;

public class Libreria {
	Libro[] disponibles;
	Venta[] ventas;
	String direccion;

	/*
	 * a)
	 */
	public int cantidadDeVentasDeGenero(String genero) {
		int ventaMismoGenero = 0;
		for (Venta v : this.ventas) {
			if (v.todasDelMismoGenero(genero))
				ventaMismoGenero++;
		}
		return ventaMismoGenero;
	}

	/*
	 * b)
	 */
	public LinkedList<Libro> compradoPor(Cliente c, Autor a) {
		LinkedList<Libro> compradosPor = new LinkedList<Libro>();
		for (Venta v : this.ventas) {
			if (v.cliente.equals(c)) {
				for (Libro l : v.libros) {
					for (Autor al : l.autores) {
						if (al.equals(a))
							compradosPor.add(l);
					}
				}
			}
		}
		return compradosPor;
	}

	/*
	 * c) bonus track
	 */
	public Autor masParticipativo() {
		Autor autorMasParticipativo = null;
		int maxParticipaciones = 0;
		for (Venta v : this.ventas) {
			for (Libro l : v.libros) {
				for (Autor a : l.autores) {
					int participacionAutor = participacionesPorAutor(a);
					if (participacionAutor > maxParticipaciones) {
						maxParticipaciones = participacionAutor;
						autorMasParticipativo = a;
					}
				}
			}
		}
		return autorMasParticipativo;
	}

	private int participacionesPorAutor(Autor a) {
		int participacionesAutor = 0;
		for (Venta v : this.ventas) {
			for (Libro l : v.libros) {
				for (Autor au : l.autores) {
					if (au.equals(a)) {
						participacionesAutor++;
					}
				}
			}
		}
		return participacionesAutor;
	}

}
