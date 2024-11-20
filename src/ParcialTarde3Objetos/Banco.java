package ParcialTarde3Objetos;

import java.util.LinkedList;

public class Banco {
	Cliente[] clientes;

	/*
	 * a)
	 */
	public LinkedList<Cliente> buenosClientes() {
		LinkedList<Cliente> clientes = new LinkedList<>();
		for (Cliente cli : this.clientes) {
			if (cli.todosAprobadas() && clientes.contains(cli)) {
				clientes.add(cli);
			}
		}
		return clientes;
	}

	/*
	 * b)
	 */
	public int cantTerjetasConPromo(double min, int desc) {
		int cant = 0;
		for (Cliente cli : this.clientes) {
			for (Tarjeta ta : cli.tarjetas) {
				if (ta.montoCompra() > min && ta.montoComprasDescuento(desc)) {
					cant++;
				}
			}
		}
		return cant;
	}
}